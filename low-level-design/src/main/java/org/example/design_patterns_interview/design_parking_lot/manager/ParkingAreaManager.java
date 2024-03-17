package org.example.design_patterns_interview.design_parking_lot.manager;

import org.example.design_patterns_interview.design_parking_lot.model.ParkingArea;
import org.example.design_patterns_interview.design_parking_lot.model.Vehicle;

import java.util.List;

public abstract class ParkingAreaManager {
    List<ParkingArea> parkingAreasList;
    ParkingAreaManager(List<ParkingArea> parkingAreasList) {
        this.parkingAreasList = parkingAreasList;
    }
    public abstract ParkingArea findParkingSpace();
    public abstract void showStatusOfParkingSpace();
    public abstract void addParkingSpace();
    public abstract void removeParkingSpace();
    public abstract void parkVehicle(ParkingAreaManager parkingAreaManager, Vehicle vehicle,ParkingArea parkingArea);
    public abstract void removeVehicle(ParkingArea parkingAreaOnBasisOfVehicle);
    public abstract ParkingArea findAreaOnBasisOfVehicle(String vehicle);
}
