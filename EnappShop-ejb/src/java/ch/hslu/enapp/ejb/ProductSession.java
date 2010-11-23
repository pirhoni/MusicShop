/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.ejb;

import ch.hslu.d3s.enapp.common.SalesOrderJMS;
import ch.hslu.enapp.entities.Customer;
import ch.hslu.enapp.entities.Product;
import ch.hslu.enapp.entities.Purchase;
import ch.hslu.enapp.entities.Purchaseitem;
import ch.hslu.enapp.mdb.SalesOrderMSender;
import ch.hslu.enapp.payment.CreditCard;
import ch.hslu.enapp.payment.NcResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateful;
import javax.inject.Inject;
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
    @Inject
    private PostFinanceBean postFinance;
    @Inject
    private SalesOrderMSender salesOrderMSender;

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
    public float getCartAmount() {
        float amount = 0f;
        for (Product p : cart.keySet()) {
            amount += p.getUnitprice();
        }
        return amount;
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
    public void checkout(Customer customer, CreditCard cc) {

        long total = 0;
        SalesOrderJMS soJms = new SalesOrderJMS();

        purchase.setCustomerid(customer.getId());
        purchase.setDatetime(new Date());
        purchase.setStatus("ordered");
        purchase = em.merge(purchase);
        em.flush();

        List<SalesOrderJMS.PurchaseItem> sojmsItems = new ArrayList<SalesOrderJMS.PurchaseItem>();

        for (Purchaseitem pi : cart.values()) {

            Query q = em.createNamedQuery("Product.findById");
            q.setParameter("id", pi.getProductid());
            Product p = (Product) q.getSingleResult();

            SalesOrderJMS.PurchaseItem item = soJms.new PurchaseItem(p.getReference(), pi.getDescription(),
                    pi.getQuantity().toString(), String.valueOf(pi.getQuantity() * pi.getUnitprice()));
            sojmsItems.add(item);

            total += pi.getUnitprice() * pi.getQuantity();
            pi.setPurchaseid(purchase.getId());
            em.merge(pi);
        }

//        CreditCard cc = new CreditCard();
//        cc.setCardNo("4111111111111111");
//        cc.setCustomerName("nicolas");
//        cc.setCvc("123");
//        cc.setExpiryDate("12/12");

        NcResponse ncResponse = postFinance.makePayment(purchase.getId(), total, cc);

        SalesOrderJMS.PurchaseCustomer purchaseCustomer = soJms.new PurchaseCustomer(null, customer.getName(),
                customer.getAddress(), "1234", "Luzern", customer.getId().toString(), customer.getUsername());

        soJms.setPayId(ncResponse.getPayId());
        soJms.setPurchaseCustomer(purchaseCustomer);
        soJms.setPurchaseId(purchase.getId().toString());
        soJms.setPurchaseDate(purchase.getDatetime());
        soJms.setPurchaseItemList(sojmsItems);
        soJms.setStudent("tcnussba");
        soJms.setTotalPrice(String.valueOf(total));

        String correlationId = salesOrderMSender.salesOrderMessageSender(soJms);
        purchase.setCorrelationId(correlationId);
        em.merge(purchase);

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
