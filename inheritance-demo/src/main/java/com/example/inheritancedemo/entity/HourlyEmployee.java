package com.example.inheritancedemo.entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HourlyEmployee extends Employee{
    private double rate;
    private int hours;
    public HourlyEmployee(){}
    public HourlyEmployee(String name, String email, double rate, int hours){
        super(name, email);
        this.rate = rate;
        this.hours = hours;
    }
}
