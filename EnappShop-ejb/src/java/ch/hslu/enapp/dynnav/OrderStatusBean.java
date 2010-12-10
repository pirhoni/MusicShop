/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.dynnav;

import ch.hslu.d3s.enapp.common.SalesOrderRestful;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author nnussbaumer
 */
@Stateless
@LocalBean
public class OrderStatusBean {

    public String getRestStatus(String correlationId) {

        System.out.println("In RESTful");
        SalesOrderRestful rrb = null;

        Client client = Client.create();

//        String url = "http://enappsrv01.icompany.intern:8080/DynNAVdaemon-war/resources/salesorder/"
//                + correlationId + "/status";
//        System.out.println(url);

        WebResource resource = client.resource("http://enappsrv01.icompany.intern:8080/DynNAVdaemon-war/resources/salesorder/"
                + correlationId + "/status");
        ClientResponse response = resource.type("application/x-www-form-urlencoded ").get(ClientResponse.class);

        //Catch 404 Code
        if (200 != response.getStatus()) {
            System.out.println("ERROR RETRIEVING STATUS VIA REST!");
            return null;
        }

        try {
            JAXBContext context = JAXBContext.newInstance(SalesOrderRestful.class);
            Unmarshaller u = context.createUnmarshaller();
            rrb = (SalesOrderRestful) u.unmarshal(response.getEntityInputStream());
            return rrb.getStatus();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Status Error: ");
            System.out.println(rrb.getStatus());
        }

        return null;
    }
}
