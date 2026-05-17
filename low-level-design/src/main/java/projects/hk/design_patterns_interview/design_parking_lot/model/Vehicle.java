package projects.hk.design_patterns_interview.design_parking_lot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import projects.hk.design_patterns_interview.design_parking_lot.model.constant.VehicleType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    String vehicleNo;
    VehicleType vehicleType;
}
