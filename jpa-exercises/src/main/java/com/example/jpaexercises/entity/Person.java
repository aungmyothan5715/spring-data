package com.example.jpaexercises.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private LocalDate dob;
    @JoinColumn(name = "car_id_fk")
    @ManyToOne
    private Car car1;
    @JoinTable(
            name = "driver_car",
            joinColumns = @JoinColumn(name = "driver_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "car_id", referencedColumnName = "id")

    )
    @ManyToOne
    private Car car2;

    public Person(){}

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }
}
