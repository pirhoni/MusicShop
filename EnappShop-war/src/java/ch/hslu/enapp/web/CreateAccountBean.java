/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.web;

import ch.hslu.d3s.enapp.common.Util;
import ch.hslu.enapp.ejb.CustomerSessionRemote;
import ch.hslu.enapp.entities.Customer;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author nnussbaumer
 */
@Named("createAccount")
@SessionScoped
public class CreateAccountBean implements Serializable {

    @EJB
    private CustomerSessionRemote customerSession;
    private Customer customer;
    private String tempPw;

    /** Creates a new instance of CreateAccountBean */
    public CreateAccountBean() {
    }

    public Customer getCustomer() {
        if (customer == null) {
            customer = new Customer();
        }
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String create() {
        try {
            customer.setPassword(Util.createSHA1(customer.getPassword()));

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CreateAccountBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CreateAccountBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        customer = customerSession.saveCustomer(customer);
        return "Main?faces-redirect=true";
    }

    public void validatePw(FacesContext context, UIComponent component, Object value) {
        if (component.getId().equals("password")) {
            tempPw = (String) value;
            return;
        }
        if (((String) value).equals(tempPw)) {
            return;
        }
        throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Passwords not matching", "Passwords not matching"));
    }
}
