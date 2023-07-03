package store;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPA {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("store");

    public static EntityManager returnEntityManager(){
        return factory.createEntityManager();
    }
}
