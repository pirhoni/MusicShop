/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.ejb;

import ch.hslu.enapp.entities.Product;
import ch.hslu.enapp.nav.DynNav;
import ch.hslu.enapp.salesorder.Item;
import ch.hslu.enapp.salesorder.ItemList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.Schedule;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author nnussbaumer
 */
@Stateless
public class ProductRemote {

    @PersistenceContext(unitName = "EnappShop-ejbPU")
    private EntityManager em;
    private DynNav dynNav = new DynNav();

    public List<ItemList> getDynNavItems() {
        return (List<ItemList>) dynNav.getNavItems();
    }

    public ItemList getNavItems() {
        return dynNav.getNavItems();
    }

    @Schedule(minute = "*/1", hour = "*")
    public void reconcile() {
        System.out.println("calling reconcile");
        Product p;
        Query q;

        for (Item item : dynNav.getNavItems().getItem()) {
//            String s = item.getNo();
//            s = s.substring(4, item.getNo().length());
//            int dynNavId = Integer.parseInt(s);
            q = em.createNamedQuery("Product.findByReference");
            q.setParameter("reference", item.getNo());

            try {
                try {
                    p = (Product) q.getSingleResult();
                } catch (Exception ex) {
                    p = new Product();
                }
                    p.setName(item.getDescription());
                    p.setMediapath(item.getMediafileName());
                    p.setDescription(item.getDescription());
                    p.setReference(item.getNo());
                    p.setUnitprice(item.getUnitPrice().longValue());
                    em.merge(p);
                } catch (Exception e) {
                    System.out.println("Error merging product to DB " + e.getMessage());
                }
            }
        }
    }
