package com.example.carmanufactureandinsurance.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Embeddable
@Getter
@Setter
public class Address {
    private String streetName;
    private String township;
    private String city;
    public Address(){}

    public Address(String streetName, String township, String city) {
        this.streetName = streetName;
        this.township = township;
        this.city = city;
    }


}
