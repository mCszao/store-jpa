import jakarta.persistence.EntityManager;
import store.JPA;
import store.dao.CategoryDAO;
import store.dao.ProductDAO;
import store.dao.StockDAO;
import store.dao.StocksDAO;
import store.entity.Category;
import store.entity.Product;
import store.entity.Stock;
import store.entity.Stocks;

import java.math.BigDecimal;

public class TesteNewStock {
    public static void main(String[] args) {
        EntityManager em = JPA.returnEntityManager();



        Category categorie = new CategoryDAO(em).selectById(1L);

        new ProductDAO(em).create(new Product("XIOMI", "preto", new BigDecimal("60"),categorie));

        Product last = new ProductDAO(em).selectById(1L);
        Stocks stocks = new StocksDAO(em).selectById(1L);
        new StockDAO(em).add(new Stock(last, stocks));

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();


    }
}
