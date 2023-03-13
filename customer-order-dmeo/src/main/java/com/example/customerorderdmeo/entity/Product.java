package com.example.customerorderdmeo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Product extends IdClass {
    private String name;
    private double price;
    private String description;
    private LocalDateTime lastUpdate;
    @ManyToOne
    private Category category;
    @ManyToMany(mappedBy = "products", cascade = CascadeType.PERSIST)
    private List<CustomerOrder> customerOrders = new ArrayList<>();
    public Product(){}

    public Product(String name, double price, String description, LocalDateTime lastUpdate) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.lastUpdate = lastUpdate;

    }
}
