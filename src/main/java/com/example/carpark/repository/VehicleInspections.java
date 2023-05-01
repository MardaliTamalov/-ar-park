package com.example.carpark.repository;

import com.example.carpark.entity.VehicleInspection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleInspections extends JpaRepository<VehicleInspection,Long> {


}
