package store.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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
    @OneToMany(mappedBy = "order")
    private List<ProductByOrder> products;

    public Order(){}
}
