package com.example.customerorderdmeo.dao;

import com.example.customerorderdmeo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
