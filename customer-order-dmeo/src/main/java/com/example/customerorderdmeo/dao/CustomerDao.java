package com.example.customerorderdmeo.dao;

import com.example.customerorderdmeo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
