package com.example.customerorderdmeo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer extends IdClass{
    private String name;
    private String email;
    private String phone;
    private String address;
    private String cityRegion;
    private String ccNumber;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.PERSIST)
    private List<CustomerOrder> customerOrders = new ArrayList<>();

    public Customer() {}

    public Customer(String name, String email, String phone, String address, String cityRegion, String ccNumber) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.cityRegion = cityRegion;
        this.ccNumber = ccNumber;
    }

    public void addOrder(CustomerOrder customerOrder) {
        customerOrder.setCustomer(this);
        this.customerOrders.add(customerOrder);
    }


}
