/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.mdb;

import ch.hslu.d3s.enapp.common.SalesOrderJMS;
import java.util.Random;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;

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

    public String salesOrderMessageSender(SalesOrderJMS data) {
        QueueConnection connection = null;
//        MessageConsumer consumer = null;
        try {
            //DynNav Queue
            connection = connectionFactory.createQueueConnection();
            QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            QueueSender sender = session.createSender(queue);
            sender.setDeliveryMode(DeliveryMode.PERSISTENT);


            // Creates a ObjectMessaage and set the Object!
            ObjectMessage message = session.createObjectMessage(data);

            // Setup the Properties for the Message
            message.setStringProperty("MessageFormat", "Version 1.0");
            String correlationId = Integer.toString(new Random().nextInt()) + "." + Long.toString(System.currentTimeMillis());
            message.setJMSCorrelationID(correlationId);

            message.setJMSReplyTo(replyqueue);

            System.out.println("Sending message");
            sender.send(message);
            System.out.println("Response from JMS DYNNAV");
            System.out.println(message.getJMSReplyTo().toString());

            return correlationId;

        } catch (Exception e) {
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException ex) {
                }
            }
        }
        return null;
    }

//    public void salesOrderMessageReplySender(Message data) {
//        try {
//            //Internal Reply Queue
//            QueueConnection connectionReply = connectionReplyFactory.createQueueConnection();
//            Session sessionReply = connectionReply.createSession(true, Session.AUTO_ACKNOWLEDGE);
//            MessageProducer producerReply = sessionReply.createProducer((Destination) replyqueue);
//
//            // Setup for Dynnav Queue Message
//            ObjectMessage messageReply = sessionReply.createObjectMessage();
//            messageReply.setStringProperty("MessageFormat", "Version 1.0");
//            messageReply.setJMSCorrelationID(Calendar.getInstance().getTimeInMillis() + "");
//
//            //Setes up the Data to send to Dynnav
//            messageReply.setObject((Serializable) data);
//            producerReply.send(messageReply);
//
//            System.out.println("");
//            System.out.println("Response from JMS DYNNAV");
//            System.out.println(data);
//
//            connectionReply.close();
//
//        } catch (Exception e) {
//        }
//    }
}
