/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.ejb.mdb;

import ch.hslu.d3s.enapp.common.SalesOrderJMS;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Random;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TemporaryQueue;

/**
 *
 * @author nnussbaumer
 */
@Stateless
public class SalesOrderMSender {

    @Resource(mappedName = "jms/EnappQueueFactory")
    private QueueConnectionFactory connectionFactory;
    @Resource(mappedName = "jms/enappqueue")
    private Queue queue;
    @Resource(mappedName = "jms/EnappReplyQueueFactory")
    private QueueConnectionFactory connectionReplyFactory;
    @Resource(mappedName = "jms/enappreplyqueue")
    private Queue replyqueue;

    public void salesOrderMessageSender(SalesOrderJMS data) {
        QueueConnection connection = null;
        MessageConsumer consumer = null;
        try {
            //Dynnav Queue
            connection = connectionFactory.createQueueConnection();
            QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            QueueSender sender = session.createSender(queue);
            sender.setDeliveryMode(DeliveryMode.PERSISTENT);

            //Generate a Reply Temp Queue
            TemporaryQueue myReplyToQueue = session.createTemporaryQueue();

            // Creates a ObjectMessaage and set the Object!
            ObjectMessage message = session.createObjectMessage(data);

            // Setup the Properties for the Message
            message.setStringProperty("MessageFormat", "Version 1.0");
            String correlationId = Integer.toString(new Random().nextInt()) + "." + Long.toString(System.currentTimeMillis());
            message.setJMSCorrelationID(correlationId);
            message.setJMSReplyTo(session.createTemporaryQueue());


            //Not neccesary because of the session.createObjectMessage(data)
            //message.setObject(data);

            //Sends a Message to Dynnav
            sender.send(message);

            // Start connection, this actually sends the message.
            //connection.start();

            System.out.println("Waiting to Response");
            System.out.println("Response from JMS DYNNAV");
            System.out.println(message.getJMSReplyTo().toString());

            consumer = session.createConsumer(myReplyToQueue, "JMSCorrelationID = '" + correlationId + "'");
            Message msgResponse = consumer.receive(10000);

            if (msgResponse != null) {
                System.out.println("OK");
                System.out.println(msgResponse);
            } else {
                System.out.println("Failure");
            }

            salesOrderMessageReplySender(msgResponse);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    //connection.stop();
                    consumer.close();
                    connection.close();
                } catch (JMSException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void salesOrderMessageReplySender(Message data) {
        try {
            //Intern Reply Queue
            QueueConnection connectionReply = connectionReplyFactory.createQueueConnection();
            Session sessionReply = connectionReply.createSession(true, Session.AUTO_ACKNOWLEDGE);
            MessageProducer producerReply = sessionReply.createProducer((Destination) replyqueue);

            // Setup for Dynnav Queue Message
            ObjectMessage messageReply = sessionReply.createObjectMessage();
            messageReply.setStringProperty("MessageFormat", "Version 1.0");
            messageReply.setJMSCorrelationID(Calendar.getInstance().getTimeInMillis() + "");

            //Setes up the Data to send to Dynnav
            messageReply.setObject((Serializable) data);
            producerReply.send(messageReply);

            System.out.println("");
            System.out.println("Response from JMS DYNNAV");
            System.out.println(data);

            connectionReply.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
