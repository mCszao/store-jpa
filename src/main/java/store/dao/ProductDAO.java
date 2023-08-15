package store.dao;

import jakarta.persistence.EntityManager;
import store.JPA;
import store.entity.Product;

import java.math.BigDecimal;
import java.util.List;


public class ProductDAO extends MyDAO{

    public void create(Product product){
        this.entityManager.persist(product);
        ocultTransaction();
    }


    public void update(Long id, BigDecimal price){
        Product model = this.selectById(id);
        model = this.entityManager.merge(model);
        model.setPrice(price);
        this.ocultTransaction();
    }

    public Product selectById(Long id){
        return this.entityManager.find(Product.class, id);
    }

    public List<Product> select(){
        return this.entityManager.createQuery("SELECT p FROM Product p").getResultList();
    }

    public List<Product> selectLessThan(BigDecimal value){
        String jpql = "SELECT p FROM Product p WHERE p.price < :value";
        return this.entityManager.createQuery(jpql).setParameter("value", value).getResultList();
    }

}


