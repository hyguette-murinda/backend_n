package rca.ne.prep.v1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long productId;
    private String name;
    private double price;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
