package org.example.design_patterns.behavioual_patterns.null_object_design_pattern;

public class NullObjectMain {
    public static void main(String[] args) {
        Vehicle tata = new VehicleFactory().getVehicle("TATA");
        Vehicle kia = new VehicleFactory().getVehicle("KIA");
        Vehicle audi = new VehicleFactory().getVehicle("AUDI");
        System.out.println(tata.getBrandName());
        System.out.println(kia.getBrandName());
        System.out.println(audi.getBrandName());


    }
}
