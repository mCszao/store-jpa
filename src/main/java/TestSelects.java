import jakarta.persistence.EntityManager;
import store.JPA;
import store.dao.ProductDAO;

public class TestSelects {
    public static void main(String[] args) {
        EntityManager em = JPA.returnEntityManager();

//        new ProductDAO().selectByCategorieID(2L).forEach(p -> System.out.println(p.getDescription()));

//        new ProductDAO().selectByStockID(1L).forEach(p -> System.out.println(p.getName()));

//        new ProductDAO().selectNegative().forEach(p -> System.out.println(p.getName()));
    }
}
