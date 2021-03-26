package org.lecture.carpark;

import lombok.ToString;

@ToString
public class Vehicle {

    protected final int tires;
    protected final int axles;
    protected final VehicleBrand brand;

    public Vehicle(int tires, int axles, VehicleBrand brand) {
        this.tires = tires;
        this.axles = axles;
        this.brand = brand;
    }




}
