package org.example.design_patterns_interview.design_parking_lot.controller;

import org.example.design_patterns_interview.design_parking_lot.factory.ParkingFactory;
import org.example.design_patterns_interview.design_parking_lot.manager.ParkingAreaManager;
import org.example.design_patterns_interview.design_parking_lot.manager.TwoWheelerParkingAreaManager;
import org.example.design_patterns_interview.design_parking_lot.model.ParkingArea;
import org.example.design_patterns_interview.design_parking_lot.model.Ticket;
import org.example.design_patterns_interview.design_parking_lot.model.Vehicle;
import org.example.design_patterns_interview.design_parking_lot.model.constant.VehicleType;
import org.example.design_patterns_interview.design_parking_lot.service.EntranceGateService;
import org.example.design_patterns_interview.design_parking_lot.service.ExitGateService;
import org.example.design_patterns_interview.design_parking_lot.service.ParkingAreaService;

import java.util.Objects;

public class ParkingLotController {
    final ParkingFactory parkingFactory;
    final EntranceGateService entranceGateService;
    final ExitGateService exitGateService;
    ParkingLotController(ParkingFactory parkingFactory, EntranceGateService entranceGateService, ExitGateService exitGateService) {
        this.parkingFactory = parkingFactory;
        this.entranceGateService = entranceGateService;
        this.exitGateService = exitGateService;
    }

    void implementParkingLot() {
        // define our parking area
        ParkingAreaManager twoWheelerParkingAreaManager = this.parkingFactory.getParkingAreaManager(VehicleType.TWO_WHEELER);
        ParkingAreaManager fourWheelerParkingAreaManager = this.parkingFactory.getParkingAreaManager(VehicleType.FOUR_WHEELER);
        // define our entrance gate
        // suppose some two-wheeler is coming
        for(int i=1;i<=4;i++) {
            Vehicle twoWheelerVehicle = new Vehicle("TW-"+ i, VehicleType.TWO_WHEELER);
            ParkingArea parkingSpace = this.entranceGateService.findSpace(twoWheelerVehicle, twoWheelerParkingAreaManager);
            if(Objects.isNull(parkingSpace)) throw new RuntimeException("No Parking Space Available");
            Ticket ticket = this.entranceGateService.bookSpot(twoWheelerVehicle, parkingSpace,twoWheelerParkingAreaManager);
            System.out.println(ticket);
        }
        // status of two-wheeler vehicle
        twoWheelerParkingAreaManager.showStatusOfParkingSpace();
        // now some of the vehicles are going out of parking
        this.exitGateService.removeVehicle(twoWheelerParkingAreaManager,"TW-1");
        // status of two-wheeler vehicle
        twoWheelerParkingAreaManager.showStatusOfParkingSpace();




    }
}
