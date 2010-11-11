/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.nav;

import ch.hslu.enapp.ejb.CustomerSession;
import ch.hslu.enapp.salesorder.Item;
import ch.hslu.enapp.salesorder.ItemFields;
import ch.hslu.enapp.salesorder.ItemFilter;
import ch.hslu.enapp.salesorder.ItemList;
import ch.hslu.enapp.salesorder.ItemPort;
import ch.hslu.enapp.salesorder.ItemService;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

/**
 *
 * @author nnussbaumer
 */
public class DynNav {

    private String user = "icDynNAVWsStudentSvc";
    private String password = "ic0mp@ny";
    private String domain = "ICOMPANY";
    private String companyName = "iCompany%20HSLU%20T%26A";
    private URL url = null;

    public DynNav() {
        createURL();
    }

    private void createURL() {
        url = null;

        try {
            url = new URL("http://icompanydb01.icompany.intern:7047/DynamicsNAVTest/WS/" + companyName + "/Page/Item");
        } catch (MalformedURLException ex) {
            Logger.getLogger(CustomerSession.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void setAuthenticator(final String domain, final String user, final String password) {
        Authenticator.setDefault(new Authenticator() {

            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(domain + "\\" + user, password.toCharArray());
            }
        });
    }

    public ItemList getNavItems() {

        setAuthenticator(domain, user, password);

        QName itemPageQName = new QName("urn:microsoft-dynamics-schemas/page/item", "Item_Service");
        ItemService itemService = new ItemService(url, itemPageQName);
        ItemPort itemPort = itemService.getItemPort();

        ItemFilter myFilters = new ItemFilter();
        myFilters.setField(ItemFields.PRODUCT_GROUP_CODE);
        myFilters.setCriteria("MP3");

        List<ItemFilter> filters = new ArrayList<ItemFilter>();
        filters.add(myFilters);

        String bookmarkKey = null;
        int setSize = 0;
        ItemList itemList = itemPort.readMultiple(filters, bookmarkKey, setSize);

        for (Item it : itemList.getItem()) {
        }

        return itemList;
    }
}
