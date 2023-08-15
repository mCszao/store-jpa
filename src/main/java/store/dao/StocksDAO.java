package store.dao;

import jakarta.persistence.EntityManager;
import store.JPA;
import store.entity.Stocks;

public class StocksDAO extends MyDAO{


    public void add(Stocks stock){
        this.entityManager.persist(stock);
        ocultTransaction();
    }


}
