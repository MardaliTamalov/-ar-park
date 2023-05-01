package com.example.carpark.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cars" )

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "issue_date")
    private LocalDate issueDate;

    @Column(name = "model")
    private String model;

    @Column(name = "state_number")
    private String stateNumber;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

}
