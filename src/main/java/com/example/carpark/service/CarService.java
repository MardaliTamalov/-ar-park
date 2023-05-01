package com.example.carpark.service;

import com.example.carpark.dto.AllCarDto;
import com.example.carpark.dto.CarDto;
import com.example.carpark.dto.ResponseDto;
import com.example.carpark.entity.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CarService {

    List<AllCarDto> getCar(long id);
    ResponseDto updateCar(CarDto carDto);

    void addCar(AllCarDto allCarDto);
    void deleteCar(Long id);

}
