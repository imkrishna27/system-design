package org.example.design_patterns_interview.design_parking_lot.manager;

import org.example.design_patterns_interview.design_parking_lot.model.ParkingArea;
import org.example.design_patterns_interview.design_parking_lot.model.Vehicle;

import java.util.List;

public class FourWheelerParkingAreaManager extends ParkingAreaManager{
    public FourWheelerParkingAreaManager(List<ParkingArea> parkingAreasList) {
        super(parkingAreasList);
    }

    @Override
    public ParkingArea findParkingSpace() {
        return this.parkingAreasList.stream().filter(ParkingArea::isParkingEmpty).findFirst().orElse(null);
    }

    @Override
    public void showStatusOfParkingSpace() {

    }

    @Override
    public void addParkingSpace() {

    }

    @Override
    public void removeParkingSpace() {

    }

    @Override
    public void parkVehicle(ParkingAreaManager parkingAreaManager, Vehicle vehicle, ParkingArea parkingArea) {

    }

    @Override
    public void removeVehicle(ParkingArea parkingAreaOnBasisOfVehicle) {

    }

    @Override
    public ParkingArea findAreaOnBasisOfVehicle(String vehicle) {
        return null;
    }
}
