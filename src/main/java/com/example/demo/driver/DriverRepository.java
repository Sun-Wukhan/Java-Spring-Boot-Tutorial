package com.example.demo.driver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends
        JpaRepository<Driver, Long> {

    @Query("SELECT s FROM Driver s WHERE s.car =?1")
    Optional<Driver> findDriverByCar(String car);
}
