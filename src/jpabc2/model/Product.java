/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpabc2.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id;
    private String namaProduk;
    private double hargaProduk;
    private int quantity;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpabc2.model.Product[ id=" + id + " ]";
    }

    /**
     * @return the namaProduk
     */
    public String getNamaProduk() {
        return namaProduk;
    }

    /**
     * @param namaProduk the namaProduk to set
     */
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    /**
     * @return the hargaProduk
     */
    public double getHargaProduk() {
        return hargaProduk;
    }

    /**
     * @param hargaProduk the hargaProduk to set
     */
    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
