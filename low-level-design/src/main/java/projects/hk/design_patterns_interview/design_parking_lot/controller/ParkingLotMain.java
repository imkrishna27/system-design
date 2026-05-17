package projects.hk.design_patterns_interview.design_parking_lot.controller;

import projects.hk.design_patterns_interview.design_parking_lot.factory.ParkingFactory;
import projects.hk.design_patterns_interview.design_parking_lot.service.EntranceGateService;
import projects.hk.design_patterns_interview.design_parking_lot.service.ExitGateService;
import projects.hk.design_patterns_interview.design_parking_lot.service.ParkingAreaService;

public class ParkingLotMain {
    public static void main(String[] args) {
        ParkingAreaService parkingAreaService = new ParkingAreaService();
        ParkingFactory parkingFactory = new ParkingFactory(parkingAreaService);
        ParkingLotController parkingLotController = new ParkingLotController(
                parkingFactory,
                new EntranceGateService(),
                new ExitGateService()
        );
        parkingLotController.implementParkingLot();
    }
}
