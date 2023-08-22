package store.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Stocks stock;

    private BigDecimal product_quantity = new BigDecimal("0");

    public Stock(Product product, Stocks stockOnStocks){
        this.product = product;
        this.stock = stockOnStocks;
    }
}
