package com.example.springjpacollectiontable.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Phone {
    private String phoneNumber;
    private String operator;
    private String phoneType;
    public Phone(){
        //
    }

    public Phone(String phoneNumber, String operator, String phoneType) {
        this.phoneNumber = phoneNumber;
        this.operator = operator;
        this.phoneType = phoneType;
    }
}
