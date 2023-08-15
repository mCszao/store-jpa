package store.dao;

import jakarta.persistence.EntityManager;
import store.JPA;
import store.entity.Stock;

public class StockDAO extends MyDAO{


    public void add(Stock stock){
        this.entityManager.persist(stock);
        ocultTransaction();
    }


}
