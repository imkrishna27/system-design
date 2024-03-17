package org.example.design_patterns_interview.design_parking_lot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ParkingArea {
    long parkingId;
    double parkingPrice;
    boolean isParkingEmpty;
    Vehicle vehicleParked;
}
