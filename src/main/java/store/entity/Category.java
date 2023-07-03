package store.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    public Category(String name){
        this.name = name;
    }
    public Category(){
        super();
    }

    public String getName() {
        return name;
    }
}
