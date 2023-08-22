package store.dao;

import jakarta.persistence.EntityManager;
import store.entity.Product;

import java.math.BigDecimal;
import java.util.List;


public class ProductDAO extends MyDAO{
    public ProductDAO(){
        super();
    }

    public ProductDAO (EntityManager entityManager){
        super(entityManager);
    }
    public void create(Product product){
        this.entityManager.persist(product);

    }


    public void update(Long id, BigDecimal price){
        Product model = this.selectById(id);
        model = this.entityManager.merge(model);
        model.setPrice(price);

    }

    public Product selectById(Long id){
        return this.entityManager.find(Product.class, id);
    }

    public List<Product> select(){
        return this.entityManager.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }

    public List<Product> selectLessThan(BigDecimal value){
        String jpql = "SELECT p FROM Product p WHERE p.price < :value";
        return this.entityManager.createQuery(jpql,  Product.class).setParameter("value", value).getResultList();
    }

    public List<Product> selectByCategorieID(Long idCategory){
        String jpql = "SELECT p FROM Product p WHERE p.category.id = :idCategory";
        return this.entityManager.createQuery(jpql, Product.class).setParameter("idCategory", idCategory).getResultList();
    }

    public List<Product> selectByStockID(Long idStock){
        String jpql = "SELECT p FROM Product p INNER JOIN Stock s ON p.id = s.product.id WHERE s.stock.id = :idStock";
        return  this.entityManager.createQuery(jpql, Product.class).setParameter("idStock", idStock).getResultList();
    }

    public List<Product> selectPositive() {
        String jpql = "SELECT p FROM Product p INNER JOIN Stock s on p.id = s.product.id WHERE s.product_quantity > 5";
        return  this.entityManager.createQuery(jpql, Product.class).getResultList();
    }
}


