package store.dao;

import jakarta.persistence.EntityManager;
import store.JPA;
import store.entity.Category;
import store.entity.Stocks;

public class StocksDAO extends MyDAO{

    public StocksDAO(){
        super();
    }
    public StocksDAO(EntityManager entityManager){
        super(entityManager);
    }
    public void add(Stocks stock){
        this.entityManager.persist(stock);
    }

    public Stocks selectById(Long id){
        System.out.println(id);
        return this.entityManager.find(Stocks.class, id);
    }
}
