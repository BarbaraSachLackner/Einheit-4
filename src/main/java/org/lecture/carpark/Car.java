package org.lecture.carpark;

import lombok.Getter;

@Getter
public class Car extends Vehicle {

    private final boolean fourWheelDrive;

    protected Car(int tires, int axles, VehicleBrand brand, boolean fourWheelDrive) {
        super(tires, axles, brand);
        this.fourWheelDrive = fourWheelDrive;
    }


}
