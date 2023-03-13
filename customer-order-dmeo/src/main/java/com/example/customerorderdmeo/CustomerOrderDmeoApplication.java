package com.example.customerorderdmeo;

import com.example.customerorderdmeo.service.CustomerService;
import com.example.customerorderdmeo.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

@SpringBootApplication
public class CustomerOrderDmeoApplication implements CommandLineRunner {
    @Autowired
    private CustomerService customerService;
    public static void main(String[] args) {
        SpringApplication.run(CustomerOrderDmeoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        customerService.createDb();
        JPAUtil.checkData("select * from category");
        JPAUtil.checkData("select * from product");
        JPAUtil.checkData("select * from customer");
        JPAUtil.checkData("select * from customer_order");
        JPAUtil.checkData("select * from customer_order_products");
    }
}
