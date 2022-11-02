package com.example.demo.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/driver")
public class DriverController {

    private final DriverService driverService;

    @Autowired // Brings Driver Service configured from line 14
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public List<Driver> getDrivers() {
        return driverService.getDrivers();
    }

    @PostMapping
    public void registerDriver(@RequestBody Driver driver) {
        driverService.addNewDriver(driver);
    }
}

