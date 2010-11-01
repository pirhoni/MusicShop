/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.ejb;

import ch.hslu.enapp.entities.Customer;
import ch.hslu.enapp.entities.Product;
import ch.hslu.enapp.entities.Purchase;
import ch.hslu.enapp.entities.Purchaseitem;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author nnussbaumer
 */
@Stateful
public class ProductSession implements ProductSessionRemote {

    @PersistenceContext(unitName = "EnappShop-ejbPU")
    private EntityManager em;
    private Purchase purchase = new Purchase();
    private Map<Product, Purchaseitem> cart = new HashMap<Product, Purchaseitem>();

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public List<Product> getProducts() {
        Query q = em.createNamedQuery("Product.findAll");
        return q.getResultList();
    }

    @Override
    public Product getProduct(Integer id) {
        Query q = em.createNamedQuery("Product.findById");
        q.setParameter("id", id);
        return (Product) q.getSingleResult();
    }

    @Override
    public Product mergeProduct(Product product) {
        return em.merge(product);
    }

    @Override
    public void addToCart(Product product) {
        if (!cart.containsKey(product)) {
            Purchaseitem item = new Purchaseitem();
            item.setProductid(product.getId());
            item.setDescription(product.getDescription());
            item.setQuantity(1L);
            item.setUnitprice(product.getUnitprice());
            cart.put(product, item);
        } else {
            increase(product);
        }
    }

    @Override
    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    @Override
    public Map<Product, Purchaseitem> getCart() {
        return cart;
    }

    @Override
    public Purchase getPurchase() {
        return purchase;
    }

    @Override
    public void checkout(Customer customer) {
        purchase.setCustomerid(customer.getId());
        purchase.setDatetime(new Date());
        purchase.setStatus("ordered");
        purchase = em.merge(purchase);
        em.flush();
        for (Purchaseitem pi : cart.values()) {
            pi.setPurchaseid(purchase.getId());
            em.merge(pi);
        }
        purchase = new Purchase();
        cart.clear();
    }

    @Override
    public void increase(Product product) {
        Purchaseitem p = cart.get(product);
        p.setQuantity(p.getQuantity() + 1L);
    }

    @Override
    public void decrease(Product product) {
        Purchaseitem p = cart.get(product);
        p.setQuantity(p.getQuantity() - 1L);
        if (p.getQuantity() < 1) {
            cart.remove(product);
        }
    }
}
