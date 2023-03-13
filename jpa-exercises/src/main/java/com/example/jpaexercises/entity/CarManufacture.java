package com.example.jpaexercises.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "manufacture")
public class CarManufacture extends Company {
    private int numberOfEmployee;
    private LocalDate yearsPublished;
    @OneToOne(mappedBy = "carManufacture")
    private Car car;
    public CarManufacture(){}

    public CarManufacture(String name, Address address, int numberOfEmployee, LocalDate yearsPublished) {
        super(name, address);
        this.numberOfEmployee = numberOfEmployee;
        this.yearsPublished = yearsPublished;
    }

}
