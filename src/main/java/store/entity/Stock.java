package store.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "stocks")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;


}
