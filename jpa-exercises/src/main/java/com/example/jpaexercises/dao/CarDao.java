package com.example.jpaexercises.dao;

import com.example.jpaexercises.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car, Integer> {
}
