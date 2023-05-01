package com.example.carpark.controller;

import com.example.carpark.dto.AllCarDto;
import com.example.carpark.dto.CarDto;
import com.example.carpark.entity.Car;
import com.example.carpark.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor

public class CarsController {
    private final CarService carService;

    @GetMapping(params = {"id"})
    public List<AllCarDto> getCar(@RequestParam Long id) {
        return carService.getCar(id);
    }

    @PutMapping()
    public ResponseEntity<?> updateCar(@RequestBody CarDto carDto) {
        return ResponseEntity.status(HttpStatus.OK).body(carService.updateCar(carDto));
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }

    @PostMapping()
    public ResponseEntity<Car> addCar(@RequestBody AllCarDto allCarDto) {
        carService.addCar(allCarDto);
        return ResponseEntity.ok().build();
    }
}
