/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.ejb;

import ch.hslu.d3s.enapp.common.Util;
import ch.hslu.enapp.payment.CreditCard;
import ch.hslu.enapp.payment.NcResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author nnussbaumer
 */
@Stateless
public class PostFinanceBean {

    public NcResponse makePayment(Integer id, long totalPrice, CreditCard creditCard) {

        String orderID = Integer.toString(id);
        String amount = Long.toString(totalPrice * 100);
        String ccNumber = creditCard.getCardNo();
        String ccExpiryDate = creditCard.getExpiryDate();
        String ccCustomerName = creditCard.getCustomerName();
        String ccCVC = creditCard.getCvc();

        MultivaluedMap formData = new MultivaluedMapImpl();
        NcResponse ncResponse = null;
        formData.add("PSPID", Util.PSPID);
        formData.add("OrderId", orderID);
        formData.add("USERID", Util.USERID);
        formData.add("PSWD", Util.PSWD);
        formData.add("amount", amount);
        formData.add("currency", "CHF");
        formData.add("CARDNO", ccNumber);
        formData.add("ED", ccExpiryDate);
        formData.add("CVC", ccCVC);
        formData.add("CN", ccCustomerName);
        try {
            //Muss auskommentiert werden da ansonsten HASH Wert falsch erzeugt wird
            //formData.add("operation", "SAL");
            formData.add("SHASign", Util.createSHA1(orderID + amount + "CHF" + ccNumber + Util.PSPID + Util.SHA1PWDIN));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PostFinanceBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PostFinanceBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        Client client = Client.create();
        WebResource resource = client.resource("https://e-payment.postfinance.ch/ncol/test/orderdirect.asp");
        ClientResponse response = resource.type("application/x-www-form-urlencoded ").post(ClientResponse.class, formData);

        try {
            //unmarshalling of JAX Response
            JAXBContext jc = JAXBContext.newInstance(ch.hslu.enapp.payment.NcResponse.class);
            Unmarshaller u = jc.createUnmarshaller();
            ncResponse = (NcResponse) u.unmarshal(response.getEntityInputStream());

            //Print response as debug
            System.out.println("NCResponse: " + ncResponse);
        } catch (Exception e) {
            System.out.println("PAYMENT EXCEPTION: " + e.getMessage());
        }
        System.out.println(ncResponse);
        return ncResponse;
    }
}
