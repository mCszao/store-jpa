package store.dao;

import jakarta.persistence.EntityManager;
import store.JPA;
import store.entity.Product;


public class ProductDAO {
    private EntityManager entityManager ;

    public ProductDAO(){
        this.entityManager = JPA.callEntityManager();;
    }
    public void create(Product product){
        this.entityManager.persist(product);
        ocultTransaction();
    }

    private void ocultTransaction(){
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
