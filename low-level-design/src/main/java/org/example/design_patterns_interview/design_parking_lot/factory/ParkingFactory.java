package org.example.design_patterns_interview.design_parking_lot.factory;

import org.example.design_patterns_interview.design_parking_lot.manager.FourWheelerParkingAreaManager;
import org.example.design_patterns_interview.design_parking_lot.manager.ParkingAreaManager;
import org.example.design_patterns_interview.design_parking_lot.manager.TwoWheelerParkingAreaManager;
import org.example.design_patterns_interview.design_parking_lot.model.constant.VehicleType;
import org.example.design_patterns_interview.design_parking_lot.service.ParkingAreaService;

public class ParkingFactory {
    final ParkingAreaService parkingAreaService;
    public ParkingFactory(ParkingAreaService parkingAreaService) {
        this.parkingAreaService = parkingAreaService;
    }

    public ParkingAreaManager getParkingAreaManager(VehicleType vehicleType) {
        switch(vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerParkingAreaManager(parkingAreaService.defineParkingSpaceForTwoWheeler());
            case FOUR_WHEELER:
                return new FourWheelerParkingAreaManager(parkingAreaService.defineParkingSpaceForFourWheeler());

        }
        return null;
    }
}
