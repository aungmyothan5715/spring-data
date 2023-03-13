package com.example.springjpacollectiontable.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String nrc;
//    @CollectionTable(name = "customer_phones")
//    @ElementCollection
//    private List<String> phoneNumbers = new ArrayList<>();

    @CollectionTable(name = "customer_phones")
    @ElementCollection
    private List<Phone> phones = new ArrayList<>();

    @CollectionTable(name = "customer_emails")
    @ElementCollection
    private List<String> emails = new ArrayList<>();

    @ElementCollection
    private List<String> addresses = new ArrayList<>();
    public Customer(){}

    public Customer(String name, String nrc) {
        this.name = name;
        this.nrc = nrc;
    }

    public void addPhoneNumber(Phone phone) {
        this.phones.add(phone);
    }

    public void addEmail(String email) {
        this.emails.add(email);
    }
    public void addAddress(String address){
        this.addresses.add(address);
    }
}
