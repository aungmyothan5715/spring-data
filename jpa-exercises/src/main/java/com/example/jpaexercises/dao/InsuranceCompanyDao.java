package com.example.jpaexercises.dao;

import com.example.jpaexercises.entity.InsuranceCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceCompanyDao extends JpaRepository<InsuranceCompany, Integer> {
}
