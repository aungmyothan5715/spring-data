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
public class CustomerOrder extends IdClass{
    private double amount;
    private LocalDateTime dateCreated;
    private int confirmationNumber;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Customer customer;
    @ManyToMany
    private List<Product> products = new ArrayList<>();

    public CustomerOrder(){}

    public CustomerOrder(double amount, LocalDateTime dateCreated, int confirmationNumber) {
        this.amount = amount;
        this.dateCreated = dateCreated;
        this.confirmationNumber = confirmationNumber;
    }

    public void addProduct(Product product) {
        product.getCustomerOrders().add(this);
        this.products.add(product);
    }
}
