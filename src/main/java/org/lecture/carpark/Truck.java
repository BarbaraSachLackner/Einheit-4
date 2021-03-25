package org.lecture.carpark;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Truck extends Vehicle {

    private final double maximumWeightInTons;

    protected Truck(int tires, int axles, VehicleBrand brand, double maximumWeightInTons) {
        super(tires, axles, brand);
        this.maximumWeightInTons = maximumWeightInTons;
    }
}
