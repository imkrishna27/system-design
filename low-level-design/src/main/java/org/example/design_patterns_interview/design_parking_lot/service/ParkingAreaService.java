package org.example.design_patterns_interview.design_parking_lot.service;

import org.example.design_patterns_interview.design_parking_lot.factory.ParkingFactory;
import org.example.design_patterns_interview.design_parking_lot.manager.ParkingAreaManager;
import org.example.design_patterns_interview.design_parking_lot.manager.TwoWheelerParkingAreaManager;
import org.example.design_patterns_interview.design_parking_lot.model.ParkingArea;

import java.util.ArrayList;
import java.util.List;

public class ParkingAreaService {
    public ParkingAreaService() {
    }

    public List<ParkingArea> defineParkingSpaceForTwoWheeler() {
        // define space for two-wheeler
        List<ParkingArea> parkingAreaListForTwoWheeler = new ArrayList<>();
        for(int i=1;i<=10;i++) {
            parkingAreaListForTwoWheeler.add(new ParkingArea(i,10,true,null));
        }
        return parkingAreaListForTwoWheeler;
    }

    public List<ParkingArea> defineParkingSpaceForFourWheeler() {
        // define space for four wheeler
        List<ParkingArea> parkingAreaListForFourWheeler = new ArrayList<>();
        for(int i=11;i<=20;i++) {
            parkingAreaListForFourWheeler.add(new ParkingArea(i,10,true,null));
        }
        return parkingAreaListForFourWheeler;
    }
}
