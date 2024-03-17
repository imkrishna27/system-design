package org.example.design_patterns_interview.design_parking_lot.service;

import org.example.design_patterns_interview.design_parking_lot.manager.ParkingAreaManager;
import org.example.design_patterns_interview.design_parking_lot.model.ParkingArea;

public class ExitGateService {
    public void removeVehicle(ParkingAreaManager twoWheelerParkingAreaManager, String vehicleNo) {
        ParkingArea parkingAreaOnBasisOfVehicle = twoWheelerParkingAreaManager.findAreaOnBasisOfVehicle(vehicleNo);
        twoWheelerParkingAreaManager.removeVehicle(parkingAreaOnBasisOfVehicle);
    }
}
