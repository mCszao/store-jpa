package store.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal fullSaleValue;
    private LocalDate createdAt = LocalDate.now();
    @ManyToOne
    private Customer customer;

    public Order(){}
}
