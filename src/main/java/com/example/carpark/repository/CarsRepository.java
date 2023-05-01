package com.example.carpark.repository;

import com.example.carpark.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarsRepository extends JpaRepository<Car,Long> {
    List<Car> getCarById(long id);
     Optional<Car> findCarById(long id);
}
