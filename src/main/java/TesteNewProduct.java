import store.dao.CategoryDAO;
import store.entity.Category;

public class TesteNewProduct {
    public static void main(String[] args) {
//    List<Product> list = new ProductDAO().selectLessThan(new BigDecimal("60"));
//    list.forEach(product -> System.out.println(product.getDescription() + product.getName()));
        new CategoryDAO().add(new Category("Blusas"));

        new CategoryDAO().selectAll().forEach(category -> {
            System.out.println(category.getName());
        });



    }
}
