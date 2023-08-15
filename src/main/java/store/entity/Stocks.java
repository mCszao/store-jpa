package store.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stocks")
public class Stocks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;


    public Stocks(String name){
        this.name = "Stock Default";
    }

}
