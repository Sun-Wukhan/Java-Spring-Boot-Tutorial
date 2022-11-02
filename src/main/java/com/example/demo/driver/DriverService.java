package com.example.demo.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    private final DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> getDrivers() {
                return driverRepository.findAll();
    }

    public void addNewDriver(Driver driver) {
       Optional<Driver> driverOptional =
               driverRepository.findDriverByCar(driver.getCar());
       if(driverOptional.isPresent()) {
           throw new IllegalStateException("This Car is registered");
       }

       driverRepository.save(driver);
       System.out.println(driver);
    }
}
