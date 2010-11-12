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
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author nnussbaumer
 */
@Stateless
public class PostFinanceBean {

    public void makePayment(Integer id, long totalPrice, CreditCard creditCard) {

        String orderID = Integer.toString(id);
        String amount = Long.toString(totalPrice * 100);
        String ccNumber = creditCard.getCardNo();
        String ccExpiryDate = creditCard.getExpiryDate();
        String ccCustomerName = creditCard.getCustomerName();

        try {
            MultivaluedMap formData = new MultivaluedMapImpl();
            formData.add("PSPID", Util.PSPID);
            formData.add("OrderId", orderID);
            formData.add("USERID", Util.USERID);
            formData.add("PSWD", Util.PSWD);
            formData.add("amount", amount);
            formData.add("currency", "CHF");
            formData.add("CARDNO", ccNumber);
            formData.add("ED", ccExpiryDate);
            formData.add("CN", ccCustomerName);
            formData.add("operation", "SAL");
            formData.add("SHASign", Util.createSHA1(orderID + amount + "CHF" + ccNumber + Util.PSPID + Util.SHA1PWDIN));

            Client client = Client.create();
            WebResource resource = client.resource("https://e-payment.postfinance.ch/ncol/test/orderdirect.asp");
            ClientResponse response = resource.type("application/x-www-form-urlencoded ").post(ClientResponse.class, formData);
            
            JAXBContext jc = JAXBContext.newInstance(ch.hslu.enapp.payment.NcResponse.class);
            Unmarshaller u = jc.createUnmarshaller();
            
            NcResponse ncResponce = (NcResponse)u.unmarshal(response.getEntityInputStream());
            System.out.println(ncResponce);
            System.out.println(ncResponce.getOrderID());

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PostFinanceBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PostFinanceBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(PostFinanceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
