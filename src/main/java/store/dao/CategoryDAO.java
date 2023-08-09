package store.dao;

import jakarta.persistence.EntityManager;
import store.JPA;
import store.entity.Category;

import java.util.List;

public class CategoryDAO {
    final private EntityManager entityManager;
    public CategoryDAO(){
        this.entityManager = JPA.returnEntityManager();
    }

    public void add(Category category){
        this.entityManager.persist(category);
        ocultTransaction();
    }
    private void ocultTransaction(){
        this.entityManager.getTransaction().begin();
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    public Category selectById(Long id){
        return this.entityManager.find(Category.class, id);
    }

    public List<Category> selectAll(){
        return this.entityManager.createQuery("SELECT c FROM Category c").getResultList();
    }

}
