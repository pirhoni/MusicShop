/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.dynnav;

import ch.hslu.d3s.enapp.common.SalesOrderRestful;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author nnussbaumer
 */
@Stateless
@LocalBean
public class OrderStatusBean {

    public String getStatus(String correlationId) {

        System.out.println("In RESTful");
//        SalesOrderRestful rb = null;

        Client client = Client.create();

        WebResource resource = client.resource("http://enappsrv01.icompany.intern:8080/DynNAVdaemon-war/resources/salesorder/" + correlationId + "/status");
        System.out.println("REST URL: " + resource.getURI().toString());
//        ClientResponse response = resource.type("application/x-www-form-urlencoded ").get(ClientResponse.class);
        ClientResponse response = resource.type("text/xml").get(ClientResponse.class);

        if (response.getStatus() != 200) {
//            System.out.println("!!--Error fetching Status via REST--!!");
            Logger.getLogger(OrderStatusBean.class.getName()).log(Level.WARNING, "REST returned Status {0}", response.getStatus());
            return null;
        }

        //        try {
        //            JAXBContext context = JAXBContext.newInstance(SalesOrderRestful.class);
        //            Unmarshaller u = context.createUnmarshaller();
        //            rb = (SalesOrderRestful) u.unmarshal(response.getEntityInputStream());
        //        } catch (Exception e) {
        //            e.printStackTrace();
        //        }
        //        System.out.println("Response " + response);
        //        System.out.println(rb.getCorrelationid());
        //        System.out.println(rb.getStatus());
        //        return rb.getStatus();
        try {
            JAXBContext context = JAXBContext.newInstance(SalesOrderRestful.class);
            Unmarshaller u = context.createUnmarshaller();
            SalesOrderRestful rb = (SalesOrderRestful) u.unmarshal(response.getEntityInputStream());

            return rb.getStatus();

        } catch (JAXBException ex) {
            Logger.getLogger(OrderStatusBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
