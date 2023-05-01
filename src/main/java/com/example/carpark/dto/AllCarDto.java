package com.example.carpark.dto;

import java.time.LocalDate;
import java.util.Date;

public record AllCarDto(LocalDate issueDate, String model, String stateNumber, LocalDate registrationDate) {
}
