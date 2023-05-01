package com.example.carpark.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "vehicle_inspections")

public class VehicleInspection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "date_inspection")
    private LocalDate dateInspection;

    @Column(name = "remarks")
    private String remarks;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cars_id", referencedColumnName = "id")
    private Car car;


    }