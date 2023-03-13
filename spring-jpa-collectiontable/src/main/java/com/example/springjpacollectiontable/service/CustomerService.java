package com.example.springjpacollectiontable.service;

import com.example.springjpacollectiontable.dao.CustomerDao;
import com.example.springjpacollectiontable.entity.Customer;
import com.example.springjpacollectiontable.entity.Phone;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Transactional
    public void createDb(){
        Customer customer1 = new Customer("John Doe", "N1223344");
        Customer customer2 = new Customer("William", "M55555");
        Customer customer3 = new Customer("Thomas Hardy", "T55555-33");

        customer3.addAddress("Creek Bridge Road");
        customer3.addAddress("Dream Land");
        customer3.addEmail("john@gmail.com");
        customer3.addEmail("doedeo@gmail.com");

        customer1.addPhoneNumber(new Phone("55-555-55", "MPT", "Orange"));
        customer1.addPhoneNumber(new Phone("44-44786", "Ooredoo", "Mango"));
        customer1.addPhoneNumber(new Phone("55-55443-55", "Telenor", "Samsung"));
        customer1.addAddress("NO.1 Stand Road");
        customer1.addEmail("william@gmail.com");
        customer1.addEmail("william123@gmail.com");

        customer2.addEmail("hardy123@gmail.com");
        customer2.addEmail("thomas123@gmail.com");
        customer2.addAddress("Blue Langoon Road");
        customer2.addAddress("Sky Blue Creek");
        customer2.addPhoneNumber(new Phone("44444-444", "Ooredoo", "Orange"));
        customer2.addPhoneNumber(new Phone("55-5555-5", "MPT", "Apple"));

        customerDao.save(customer1);
        customerDao.save(customer2);
        customerDao.save(customer3);
    }
}

