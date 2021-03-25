package org.lecture.carpark;

import lombok.Builder;


public class ClassBTruck extends Truck {

    protected ClassBTruck(VehicleBrand brand) {
        super(4, 2, brand, 3.5);
    }
}
