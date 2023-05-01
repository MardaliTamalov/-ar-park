package com.example.carpark.mapper;

import com.example.carpark.dto.AllCarDto;
import com.example.carpark.entity.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface CarMapper {
    Car getCar(AllCarDto allCarDto);
    AllCarDto carToCarDto(Car car);
}
