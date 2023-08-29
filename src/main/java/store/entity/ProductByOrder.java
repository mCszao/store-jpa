package store.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "product_by_order")
public class ProductByOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;
    @ManyToOne
    private Order order;
    private BigDecimal unitPirce;
    private BigDecimal quantity;
    private BigDecimal discount;


}
