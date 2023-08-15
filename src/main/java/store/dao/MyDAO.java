package store.dao;

import jakarta.persistence.EntityManager;
import store.JPA;

public abstract class MyDAO {
    protected final EntityManager entityManager;

    public MyDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    public MyDAO(){
        this.entityManager = JPA.returnEntityManager();
    }

    protected void ocultTransaction(){
        this.entityManager.getTransaction().begin();
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }
}
