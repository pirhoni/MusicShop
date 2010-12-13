/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author nnussbaumer
 */
@Entity
@Table(name = "purchaseitem")
@NamedQueries({
    @NamedQuery(name = "Purchaseitem.findAll", query = "SELECT p FROM Purchaseitem p"),
    @NamedQuery(name = "Purchaseitem.findById", query = "SELECT p FROM Purchaseitem p WHERE p.id = :id"),
    @NamedQuery(name = "Purchaseitem.findByPurchaseid", query = "SELECT p FROM Purchaseitem p WHERE p.purchaseid = :purchaseid"),
    @NamedQuery(name = "Purchaseitem.findByProductid", query = "SELECT p FROM Purchaseitem p WHERE p.productid = :productid"),
    @NamedQuery(name = "Purchaseitem.findByQuantity", query = "SELECT p FROM Purchaseitem p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "Purchaseitem.findByUnitprice", query = "SELECT p FROM Purchaseitem p WHERE p.unitprice = :unitprice"),
    @NamedQuery(name = "Purchaseitem.findByLineamount", query = "SELECT p FROM Purchaseitem p WHERE p.lineamount = :lineamount"),
    @NamedQuery(name = "Purchaseitem.findByDescription", query = "SELECT p FROM Purchaseitem p WHERE p.description = :description")})
public class Purchaseitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "purchaseid", nullable = false)
    private int purchaseid;
    @Basic(optional = false)
    @Column(name = "productid", nullable = false)
    private int productid;
    @Column(name = "quantity")
    private Long quantity;
    @Column(name = "unitprice")
    private Long unitprice;
    @Column(name = "lineamount")
    private Long lineamount;
    @Column(name = "description", length = 90)
    private String description;

    public Purchaseitem() {
    }

    public Purchaseitem(Integer id) {
        this.id = id;
    }

    public Purchaseitem(Integer id, int purchaseid, int productid) {
        this.id = id;
        this.purchaseid = purchaseid;
        this.productid = productid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(int purchaseid) {
        this.purchaseid = purchaseid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Long unitprice) {
        this.unitprice = unitprice;
    }

    public Long getLineamount() {
        return lineamount;
    }

    public void setLineamount(Long lineamount) {
        this.lineamount = lineamount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchaseitem)) {
            return false;
        }
        Purchaseitem other = (Purchaseitem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ch.hslu.enapp.entities.Purchaseitem[id=" + id + "]";
    }
}
