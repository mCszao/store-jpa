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
    private BigDecimal unitPrice;
    private BigDecimal quantity;
    private BigDecimal discount;
    public ProductByOrder(){}
    public ProductByOrder(Product product, Order order, BigDecimal quantity) {
        this.product = product;
        this.order = order;
        this.quantity = quantity;
        this.discount = new BigDecimal(0);
    }

    public Product getProduct() {
        return product;
    }

    public Order getOrder() {
        return order;
    }

    public BigDecimal getUnitPirce() {
        return unitPrice;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setUnitPrice(){
        this.unitPrice = this.product.getPrice();
    }
}
