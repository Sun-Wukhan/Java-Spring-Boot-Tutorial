package com.example.demo.driver;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class DriverService {

    public List<Driver> getDrivers() {
        return List.of(
                new Driver(
                        1L,
                        "Navid",
                        "RC 350",
                        LocalDate.of(2021, Month.JUNE, 01),
                        29
                )
        );
    }
}
