/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.ejb;

import ch.hslu.enapp.entities.Customer;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author nnussbaumer
 */
@Remote
public interface CustomerSessionClientRemote {

    public List<Customer> getCustomers();

    public void updateCustomer(ch.hslu.enapp.entities.Customer customer);
}
