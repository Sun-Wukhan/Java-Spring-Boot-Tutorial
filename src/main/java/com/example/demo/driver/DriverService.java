package com.example.demo.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class DriverService {

    private final DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> getDrivers() {
                return driverRepository.findAll();

//        this was returning:
//        new Driver(
//                1L,
//                "Navid",
//                "RC 350",
//                LocalDate.of(2021, Month.JUNE, 01),
//                29
//        )
    }
}
