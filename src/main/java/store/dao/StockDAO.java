package store.dao;

import jakarta.persistence.EntityManager;
import store.entity.Stock;

public class StockDAO extends MyDAO{

    public StockDAO(){
        super();
    }

    public StockDAO (EntityManager entityManager){
        super(entityManager);
    }
    public void add(Stock stock){
        this.entityManager.persist(stock);

    }


}
