package org.example.design_patterns_interview.design_parking_lot.manager;

import org.example.design_patterns_interview.design_parking_lot.model.ParkingArea;
import org.example.design_patterns_interview.design_parking_lot.model.Vehicle;

import java.util.List;
import java.util.Objects;


public class TwoWheelerParkingAreaManager extends ParkingAreaManager{
    public TwoWheelerParkingAreaManager(List<ParkingArea> parkingAreasList) {
        super(parkingAreasList);
    }

    @Override
    public ParkingArea findParkingSpace() {
        return this.parkingAreasList.stream().filter(ParkingArea::isParkingEmpty).findFirst().orElse(null);
    }

    @Override
    public void showStatusOfParkingSpace() {
        System.out.println("------------------------------------------------------------------------------");
        parkingAreasList.forEach(parkingArea -> {
            System.out.println("parking status of parkingId: "+ parkingArea.getParkingId()+ " is: "+ parkingArea.isParkingEmpty());
        });
        System.out.println("------------------------------------------------------------------------------");
    }

    @Override
    public void addParkingSpace() {

    }

    @Override
    public void removeParkingSpace() {

    }

    @Override
    public void parkVehicle(ParkingAreaManager parkingAreaManager, Vehicle vehicle, ParkingArea parkingArea) {
        // we have parking space check if it's null or not
        if(Objects.nonNull(parkingArea)) {
            parkingArea.setParkingEmpty(false);
            parkingArea.setVehicleParked(vehicle);
        }
    }

    @Override
    public void removeVehicle(ParkingArea parkingAreaOnBasisOfVehicle) {
        if (Objects.isNull(parkingAreaOnBasisOfVehicle)) throw new RuntimeException("No parking area found");
        ParkingArea parkingArea1 = this.parkingAreasList.stream().filter(parkingArea -> parkingArea.equals(parkingAreaOnBasisOfVehicle)).findFirst().orElse(null);
        parkingArea1.setParkingEmpty(true);
        parkingArea1.setVehicleParked(null);
    }

    @Override
    public ParkingArea findAreaOnBasisOfVehicle(String vehicle) {
        return this.parkingAreasList.stream().filter(parkingArea -> {
            return parkingArea.getVehicleParked().getVehicleNo().equals(vehicle);
        }).findFirst().orElse(null);
    }
}
