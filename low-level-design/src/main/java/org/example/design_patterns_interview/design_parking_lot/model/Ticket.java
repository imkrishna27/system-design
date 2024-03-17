package org.example.design_patterns_interview.design_parking_lot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {
    LocalDateTime entryDateTime;
    Vehicle vehicle;
    ParkingArea parkingArea;
}
