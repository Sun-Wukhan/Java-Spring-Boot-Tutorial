package com.example.demo.driver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(DriverRepository driverRepository){
        return args -> {
            Driver navid = new Driver(
                    1L,
                "Navid",
                "RC 350",
                LocalDate.of(2021, Month.JUNE, 01)

            );

            Driver maheen = new Driver(
                    1L,
                    "Maheen",
                    "IS 350",
                    LocalDate.of(2021, Month.APRIL, 01)
            );

            driverRepository.saveAll(List.of(navid, maheen));
        };
    }
}
