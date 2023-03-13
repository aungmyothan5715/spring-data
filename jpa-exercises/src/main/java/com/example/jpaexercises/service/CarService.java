package com.example.jpaexercises.service;

import com.example.jpaexercises.dao.CarDao;
import com.example.jpaexercises.dao.CarManufactureDao;
import com.example.jpaexercises.dao.InsuranceCompanyDao;
import com.example.jpaexercises.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class CarService {
    private CarDao carDao;
    private CarManufactureDao carManufactureDao;
    private InsuranceCompanyDao insuranceCompanyDao;

    public CarService(CarDao carDao, CarManufactureDao carManufactureDao, InsuranceCompanyDao insuranceCompanyDao) {
        this.carDao = carDao;
        this.carManufactureDao = carManufactureDao;
        this.insuranceCompanyDao = insuranceCompanyDao;
    }
    @Transactional
    public void createDb(){
        Car car1 = new Car("005", "Japan", LocalDate.of(2020, 03, 12), 334530);
        Car car2 = new Car("005", "Japan", LocalDate.of(2020, 03, 12), 334530);
        Car car3 = new Car("005", "Japan", LocalDate.of(2020, 03, 12), 334530);

        Person person1 = new Person("John", LocalDate.of(2000, 06 ,22));
        Person person2 = new Person("Harley", LocalDate.of(2000, 06 ,22));
        Person person3 = new Person("Smit", LocalDate.of(2000, 06 ,22));
        Person person4 = new Person("John", LocalDate.of(2000, 06 ,22));
        Person person5 = new Person("John", LocalDate.of(2000, 06 ,22));

        InsuranceCompany insuranceCompany1 = new InsuranceCompany("Indigo",
                new Address("79 Park Avenue", "79", "Yangon"), 6);

        InsuranceCompany insuranceCompany2 = new InsuranceCompany("Inwa",
                new Address("79 Park Avenue", "79", "Yangon"), 6);

        CarManufacture carManufacture1 = new CarManufacture("Sun",
                new Address("55Street", "NO.34", "Mandalay"), 5400, LocalDate.of(2020, 03, 21));

        CarManufacture carManufacture2 = new CarManufacture("Tesla",
                new Address("55Street", "NO.34", "DC"), 54500, LocalDate.of(2020, 03, 21));
        CarManufacture carManufacture3 = new CarManufacture("Audi",
                new Address("55Street", "NO.34", "Mombai"), 5400, LocalDate.of(2020, 03, 21));

        //Mapping
        car1.setCarManufacture(carManufacture1);
        carManufacture1.setCar(car1);
        car2.setCarManufacture(carManufacture2);
        carManufacture2.setCar(car2);
        car3.setCarManufacture(carManufacture3);
        carManufacture3.setCar(car3);

        car1.setInsuranceCompany(insuranceCompany1);
        insuranceCompany1.setCar(car1);
        car2.setInsuranceCompany(insuranceCompany2);
        insuranceCompany2.setCar(car2);

        Person driver1 = new Person("Thuzar", LocalDate.of(2022, 03, 22));
        Person driver2 = new Person("PhyuPyar", LocalDate.of(2020, 04, 23));


        car1.addOwner(person1);
        car2.addDriver(person2);
        car3.addOwner(person3);
        car3.addDriver(person5);

        car1.addDriver(driver1);
        car1.addDriver(driver2);

        carDao.save(car1);
        carDao.save(car2);
        carDao.save(car3);

        carManufactureDao.save(carManufacture1);
        carManufactureDao.save(carManufacture2);
        carManufactureDao.save(carManufacture3);

        insuranceCompanyDao.save(insuranceCompany1);
        insuranceCompanyDao.save(insuranceCompany2);

    }
}
