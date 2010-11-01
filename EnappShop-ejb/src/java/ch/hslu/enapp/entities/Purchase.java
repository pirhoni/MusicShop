/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hslu.enapp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nnussbaumer
 */
@Entity
@Table(name = "purchase")
@NamedQueries({
    @NamedQuery(name = "Purchase.findAll", query = "SELECT p FROM Purchase p"),
    @NamedQuery(name = "Purchase.findById", query = "SELECT p FROM Purchase p WHERE p.id = :id"),
    @NamedQuery(name = "Purchase.findByCustomerid", query = "SELECT p FROM Purchase p WHERE p.customerid = :customerid"),
    @NamedQuery(name = "Purchase.findByDatetime", query = "SELECT p FROM Purchase p WHERE p.datetime = :datetime"),
    @NamedQuery(name = "Purchase.findByStatus", query = "SELECT p FROM Purchase p WHERE p.status = :status")})
public class Purchase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "customerid", nullable = false)
    private int customerid;
    @Column(name = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;
    @Column(name = "status", length = 15)
    private String status;

    public Purchase() {
    }

    public Purchase(Integer id) {
        this.id = id;
    }

    public Purchase(Integer id, int customerid) {
        this.id = id;
        this.customerid = customerid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if (!(object instanceof Purchase)) {
            return false;
        }
        Purchase other = (Purchase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ch.hslu.enapp.entities.Purchase[id=" + id + "]";
    }

}
