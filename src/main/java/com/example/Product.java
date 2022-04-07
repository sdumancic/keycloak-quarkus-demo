package com.example;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@RegisterForReflection
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    long id;
    String name;
    String sku;
    String description;
    BigDecimal price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product(long id, String name, String sku, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.sku = sku;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                '}';
    }
}
