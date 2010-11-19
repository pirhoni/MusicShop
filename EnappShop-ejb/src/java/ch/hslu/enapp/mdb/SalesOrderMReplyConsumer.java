/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 *
 * @author nnussbaumer
 */
@MessageDriven(mappedName = "jms/enappreplyqueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class SalesOrderMReplyConsumer implements MessageListener {

    public SalesOrderMReplyConsumer() {
    }

    @Override
    public void onMessage(Message message) {

        try {
            ObjectMessage msg = (ObjectMessage) message;
            System.out.println(msg.getObject().toString());
            System.out.println("Received Message Done");
        } catch (JMSException jmse) {
            System.out.println("Received Message Fail: " + jmse.getMessage());
        }
    }
}
