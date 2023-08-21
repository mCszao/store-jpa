package store.dao;

import jakarta.persistence.EntityManager;
import store.entity.Category;
import java.util.List;

public class CategoryDAO extends MyDAO{

    public CategoryDAO(){
        super();
    }

    public CategoryDAO (EntityManager entityManager){
        super(entityManager);
    }
    public void add(Category category){
        this.entityManager.persist(category);

    }

    public Category selectById(Long id){
        System.out.println(id);
        return this.entityManager.find(Category.class, id);
    }

    public List<Category> selectAll(){
        return this.entityManager.createQuery("SELECT c FROM Category c").getResultList();
    }

}
