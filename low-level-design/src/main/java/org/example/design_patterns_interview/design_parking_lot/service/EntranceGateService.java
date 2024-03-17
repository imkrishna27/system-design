package org.example.design_patterns_interview.design_parking_lot.service;

import org.example.design_patterns_interview.design_parking_lot.manager.ParkingAreaManager;
import org.example.design_patterns_interview.design_parking_lot.model.ParkingArea;
import org.example.design_patterns_interview.design_parking_lot.model.Ticket;
import org.example.design_patterns_interview.design_parking_lot.model.Vehicle;

import java.time.LocalDateTime;
import java.util.Objects;

public class EntranceGateService {

    public ParkingArea findSpace(Vehicle vehicle, ParkingAreaManager parkingAreaManager) {
        ParkingArea parkingSpace = parkingAreaManager.findParkingSpace();
        return parkingSpace;
    }

    public Ticket bookSpot(Vehicle vehicle,ParkingArea parkingArea,ParkingAreaManager parkingAreaManager) {
        parkingAreaManager.parkVehicle(parkingAreaManager,vehicle,parkingArea);
        return new Ticket(LocalDateTime.now(),vehicle,parkingArea);
    }
}
