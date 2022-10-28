package com.example.demo.driver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/driver")
public class DriverController {

    @GetMapping
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
