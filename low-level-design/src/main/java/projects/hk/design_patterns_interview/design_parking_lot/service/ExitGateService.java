package projects.hk.design_patterns_interview.design_parking_lot.service;

import projects.hk.design_patterns_interview.design_parking_lot.manager.ParkingAreaManager;
import projects.hk.design_patterns_interview.design_parking_lot.model.ParkingArea;

public class ExitGateService {
    public void removeVehicle(ParkingAreaManager twoWheelerParkingAreaManager, String vehicleNo) {
        ParkingArea parkingAreaOnBasisOfVehicle = twoWheelerParkingAreaManager.findAreaOnBasisOfVehicle(vehicleNo);
        twoWheelerParkingAreaManager.removeVehicle(parkingAreaOnBasisOfVehicle);
    }
}
