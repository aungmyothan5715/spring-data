package com.example.jpaexercises;

import com.example.jpaexercises.service.CarService;
import com.example.jpaexercises.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaExercisesApplication implements CommandLineRunner {

    @Autowired
    private CarService carService;

    public static void main(String[] args) {
        SpringApplication.run(JpaExercisesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        carService.createDb();
        JPAUtil.checkData("select * from car");
        JPAUtil.checkData("select * from company");
        JPAUtil.checkData("select * from insurance");
        JPAUtil.checkData("select * from manufacture");
        JPAUtil.checkData("select * from person");
        JPAUtil.checkData("select * from car_insurance");
        JPAUtil.checkData("select * from driver_car");

    }
}
