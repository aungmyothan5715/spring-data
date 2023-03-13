package com.example.jpaexercises.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String model;
    private String make;
    private LocalDate localDate;
    private int millage;

    @OneToOne
    private CarManufacture carManufacture;

    @JoinTable(
            name = "car_insurance",
            joinColumns = @JoinColumn(name = "car_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "insurance_id", referencedColumnName = "id")
    )
    @OneToOne
    private InsuranceCompany insuranceCompany;

    @OneToMany(mappedBy = "car1",cascade = CascadeType.PERSIST)
    private List<Person> owners = new ArrayList<>();
    @OneToMany(mappedBy = "car2", cascade = CascadeType.PERSIST)
    private List<Person> drivers = new ArrayList<>();
    public Car(){}

    public Car(String model, String make,LocalDate localDate, int millage) {
        this.model = model;
        this.make = make;
        this.localDate = localDate;
        this.millage = millage;
    }

    public void addDriver(Person person) {
        person.setCar2(this);
        drivers.add(person);
    }

    public void addOwner(Person person) {
        person.setCar1(this);
        owners.add(person);
    }
}
