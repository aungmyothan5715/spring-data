package com.example.carmanufactureandinsurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String model;
    private String years;
    private double millage;
    public Car(){}

    public Car(String name, String model, String years, double millage) {
        this.name = name;
        this.model = model;
        this.years = years;
        this.millage = millage;
    }
}
