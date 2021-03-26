package org.lecture.carpark;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString(callSuper = true)
public class Truck extends Vehicle {

    private final double maximumWeightInTons;

    public Truck(int tires, int axles, VehicleBrand brand, double maximumWeightInTons) {
        super(tires, axles, brand);
        this.maximumWeightInTons = maximumWeightInTons;
    }
}
