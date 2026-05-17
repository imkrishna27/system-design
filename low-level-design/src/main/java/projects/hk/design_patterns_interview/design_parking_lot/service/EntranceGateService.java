package projects.hk.design_patterns_interview.design_parking_lot.service;

import projects.hk.design_patterns_interview.design_parking_lot.manager.ParkingAreaManager;
import projects.hk.design_patterns_interview.design_parking_lot.model.ParkingArea;
import projects.hk.design_patterns_interview.design_parking_lot.model.Ticket;
import projects.hk.design_patterns_interview.design_parking_lot.model.Vehicle;

import java.time.LocalDateTime;

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
