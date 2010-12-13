/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.ejb;

import ch.hslu.enapp.entities.Customer;
import ch.hslu.enapp.entities.Purchase;
import ch.hslu.enapp.entities.Purchaseitem;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author nnussbaumer
 */
@Remote
public interface CustomerSessionRemote {

    public void persist(java.lang.Object object);

    public List<Customer> getCustomers();

    public Customer getCustomer(Integer id);

    public List<Purchaseitem> getPurchaseItems(int purchaseId);

    public List<Purchase> getPurchases(Customer customer);

    public Customer saveCustomer(Customer customer);

    public Customer verifyLogin(String username, String password);

    public float getTotal(int purchaseId);
}