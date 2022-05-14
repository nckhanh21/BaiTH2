package com.baith2.entity;


import javax.persistence.*;

@Entity
@Table(name = "Product")
public class ProductEntity {
    @Id
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @OneToOne(mappedBy = "productEntity")
    private CartEntity cartEntity;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
