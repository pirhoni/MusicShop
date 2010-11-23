/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.web;

import ch.hslu.enapp.ejb.ProductSessionRemote;
import ch.hslu.enapp.entities.Product;
import ch.hslu.enapp.payment.CreditCard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author nnussbaumer
 */
@Named("product")
@SessionScoped
public class ProductBean implements Serializable {

    @EJB
    private ProductSessionRemote productSession;
    private Product product;
    @Inject
    private CustomerBean customer;

    private String cardNumber = "4111111111111111";
    private String veriCode = "123";
    private String expDate = "12/12";
    private String holder = "nicolas";

    /** Creates a new instance of ProductBean */
    public ProductBean() {
    }

    public List<Product> getProducts() {
        return productSession.getProducts();
    }

    public Product getProduct() {
        return null;
    }

    public Product getNewProduct() {
        Product p = new Product();
        this.product = p;
        return p;
    }

    public String saveProduct() {
        productSession.mergeProduct(product);
        return "SAVED";
    }

    public String select(Product p) {
        product = p;
        return "DETAILS";
    }

    public Product getDetails() {
        return product;
    }

    public List<Product> getCartProducts() {
        return new ArrayList(productSession.getCart().keySet());
    }

    public float getCartAmount() {
        return productSession.getCartAmount();
    }

    public Long showQuantity(Product product) {
        return productSession.getCart().get(product).getQuantity();
    }

    public void addToCart(Product product) {
        productSession.addToCart(product);
    }

    public void removeFromCart(Product product) {
        productSession.removeFromCart(product);
    }

    public String checkout() {

        CreditCard cc = new CreditCard();
        cc.setCardNo("4111111111111111");
        cc.setCustomerName("nicolas");
        cc.setCvc("123");
        cc.setExpiryDate("12/12");

        productSession.checkout(customer.getLogin().getCustomer(), cc);
        return "Thanks?faces-redirect=true";
    }

    public void increase(Product product) {
        productSession.increase(product);
    }

    public void decrease(Product product) {
        productSession.decrease(product);
    }

    public String getCardHolder() {
        return holder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getVerifyCode() {
        return veriCode;
    }
}
