package com.example.customerorderdmeo.service;

import com.example.customerorderdmeo.dao.CategoryDao;
import com.example.customerorderdmeo.dao.CustomerDao;
import com.example.customerorderdmeo.entity.Category;
import com.example.customerorderdmeo.entity.Customer;
import com.example.customerorderdmeo.entity.CustomerOrder;
import com.example.customerorderdmeo.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class CustomerService {
    private CategoryDao categoryDao;
    private CustomerDao customerDao;

    public CustomerService(CategoryDao categoryDao, CustomerDao customerDao) {
        this.categoryDao = categoryDao;
        this.customerDao = customerDao;
    }

    @Transactional
    public void createDb(){
        Product product1 = new Product("Drink", 1000, "very good", LocalDateTime.now());

        Category category1 = new Category();
        category1.setName("Milo");
        Category category2 = new Category();
        category2.setName("Milk");

        CustomerOrder customerOrder1 = new CustomerOrder(2000, LocalDateTime.now(), 002);

        Customer customer = new Customer("John Doe", "johndoe@gmail.com", "09-555-5555", "Yangon", "Hlaing","No.13");

        customer.addOrder(customerOrder1);

        category1.addProduct(product1);

        customerOrder1.addProduct(product1);

        categoryDao.save(category1);
        customerDao.save(customer);

    }
}
