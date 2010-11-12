/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.web;

import ch.hslu.enapp.ejb.ProductSessionRemote;
import ch.hslu.enapp.entities.Product;
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
        productSession.checkout(customer.getLogin().getCustomer());
        return "Thanks?faces-redirect=true";
    }

    public void increase(Product product) {
        productSession.increase(product);
    }

    public void decrease(Product product) {
        productSession.decrease(product);
    }
}
