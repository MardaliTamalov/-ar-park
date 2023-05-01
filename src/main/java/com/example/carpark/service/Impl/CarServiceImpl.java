package com.example.carpark.service.Impl;

import com.example.carpark.dto.AllCarDto;
import com.example.carpark.dto.CarDto;
import com.example.carpark.dto.ResponseDto;
import com.example.carpark.entity.Car;
import com.example.carpark.mapper.CarMapper;
import com.example.carpark.repository.CarsRepository;
import com.example.carpark.service.CarService;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Data

public class CarServiceImpl implements CarService {
    private final CarsRepository carsRepository;
    private CarMapper carMapper;

    @Override
    @Transactional
    public List<AllCarDto> getCar(long id) {
        return carsRepository.getCarById(id).stream()
                .map(carMapper::carToCarDto)
                .collect(Collectors.toList());
    }
    //   return carsRepository.getCarById(id);
//        List<AllCarDto> CarDto = carsRepository.getCarById(id).stream()
//                .map(car -> new AllCarDto(car.getIssueDate(), car.getModel(), car.getStateNumber(), car.getRegistrationDate()))
//                .collect(Collectors.toList());
//        return CarDto;}

    @Override
    @Transactional
    public ResponseDto updateCar(CarDto carDto) {

        Optional<Car> optionalCar = carsRepository.findById(carDto.id());
        if (optionalCar.isPresent()) {
            Car car = optionalCar.get();
            car.setStateNumber(carDto.stateNumber());
            carsRepository.save(car);
            return null;
        } else return new ResponseDto(false, "нет такой машины");
    }

    @Override
    @Transactional
    public void addCar(AllCarDto allCarDto) {
//        Car car = new Car();
//        car.setIssueDate(allCarDto.issueDate());
//        car.setModel(allCarDto.model());
//        car.setStateNumber(allCarDto.stateNumber());
//        car.setRegistrationDate(allCarDto.registrationDate());
        carsRepository.save(carMapper.getCar(allCarDto));
    }

    @Override
    @Transactional
    public void deleteCar(Long id) {
        if (carsRepository.findCarById(id).isPresent()) {
            carsRepository.delete(carsRepository.findCarById(id).get());
        }
    }
}
