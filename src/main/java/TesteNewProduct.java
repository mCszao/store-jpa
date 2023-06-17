import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import store.JPA;
import store.dao.ProductDAO;
import store.entity.Product;
import store.model.Category;

import java.math.BigDecimal;

public class TesteNewProduct {
    public static void main(String[] args) {
        Product nP = new Product("Samsumg Galaxy S10","capa vermelha",new BigDecimal("100"), Category.MOBILES);

        new ProductDAO().create(nP);


    }
}
