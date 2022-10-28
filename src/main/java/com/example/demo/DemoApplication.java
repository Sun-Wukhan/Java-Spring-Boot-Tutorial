package com.example.demo;

import com.example.demo.driver.Driver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
    public String greetingString() {
        return "Hello World";
    }

	@GetMapping("/list")
	public List<String> greetingList() {
		return List.of("Hello", "World");
	}

	@GetMapping("/driver")
	public List<Driver> driverList() {
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
