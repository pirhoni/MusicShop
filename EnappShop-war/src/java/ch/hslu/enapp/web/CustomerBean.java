/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.web;

import ch.hslu.enapp.ejb.CustomerSessionRemote;
import ch.hslu.enapp.entities.Customer;
import ch.hslu.enapp.entities.Purchase;
import ch.hslu.enapp.entities.Purchaseitem;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


import javax.inject.Named;

/**
 *
 * @author nnussbaumer
 */
@Named("customer")
@SessionScoped
public class CustomerBean implements Serializable {

    @EJB
    private CustomerSessionRemote customerSession;
    private Login login = new Login();
    private Customer customer;
    private int purchaseId;
    private String tempPw;

    public CustomerBean() {
    }

    public String getTempPw() {
        return tempPw;
    }

    public void setTempPw(String tempPw) {
        this.tempPw = tempPw;
    }

    public Login getLogin() {
        return login;
    }

    public Customer getDetails() {
        return customer;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String showDetails(Customer customer) {
        this.customer = customer;
        return "MyAccount?faces-redirect=true";
    }

    public void select(Customer customer) {
    }

    public String login() {
        login.setCustomer(customerSession.verifyLogin(login.getUsername(), login.getPassword()));
        if(login.getCustomer() == null){
            FacesContext.getCurrentInstance().addMessage("login:username",new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Wrong password/username", "Wrong password/username"));
            return null;
        }
        return "MyAccount?faces-redirect=true";
    }

    public String logout() {
        login.setCustomer(null);
        return "Login?faces-redirect=true";
    }

    public String updateCustomer() {
        if(tempPw.length() > 0 ) {
            login.getCustomer().setPassword(tempPw);
        }
        customerSession.saveCustomer(login.getCustomer());
        return "MyAccount?faces-redirect=true";
    }

    public List<Customer> getCustomers() {
        return customerSession.getCustomers();
    }

    public List<Purchaseitem> getPurchaseItems() {
        return customerSession.getPurchaseItems(purchaseId);
    }
    
    public List<Purchase> getPurchases() {
        return customerSession.getPurchases(login.getCustomer());
    }

    public boolean isLoggedIn() {
        return login.getCustomer() == null ? false : true;
    }

    public Customer getLoggedInCustomer() {
        return login.getCustomer();
    }

    public String extractPurchases (Purchase p) {
        if(p == null)
            return null;
        String itmes = "";
        int i = 0;
        
        return "";
    }

}
