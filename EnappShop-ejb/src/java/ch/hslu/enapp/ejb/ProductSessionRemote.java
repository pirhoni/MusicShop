/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.ejb;

import ch.hslu.enapp.entities.Customer;
import ch.hslu.enapp.entities.Product;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author nnussbaumer
 */
@Remote
public interface ProductSessionRemote {

    public List<Product> getProducts();

    public Product getProduct(Integer id);

    public Product mergeProduct(Product product);

    public void addToCart(Product product);

    public void removeFromCart(Product product);

    public java.util.Map<ch.hslu.enapp.entities.Product, ch.hslu.enapp.entities.Purchaseitem> getCart();

    public ch.hslu.enapp.entities.Purchase getPurchase();

    public void checkout(Customer customer);

    public void increase(Product product);

    public void decrease(Product product);

    public float getCartAmount();

}
