/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpabc2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import jpabc2.model.Product;

/**
 *
 * @author user
 */
public class JPABC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPABC2PU");  

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Product p = new Product();
        p.setNamaProduk("AQUA");
        p.setHargaProduk(3000.0);
        p.setQuantity(100);
        
        p.setNamaProduk("LeMineral");
        p.setHargaProduk(3000.0);
        p.setQuantity(100);
        
        p.setNamaProduk("Ades");
        p.setHargaProduk(2600.0);
        p.setQuantity(150);
//        
        
        em.persist(p); // simpan data yg di insert di atas ke dlm db
        tx.commit();
        em.close();
        emf.close();
        
        
        // TODO code application logic here
    }

}
