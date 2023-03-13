package com.example.jpaexercises.dao;

import com.example.jpaexercises.entity.CarManufacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarManufactureDao extends JpaRepository<CarManufacture, Integer> {
}
