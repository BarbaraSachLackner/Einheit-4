package org.lecture.carpark;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarDriverClass {

    public static void main(String[] args) {
        ClassBTruck classBTruck = new ClassBTruck(VehicleBrand.MERCEDES);

        Car car = new Car(4, 2, VehicleBrand.ALPHA_ROMEO, false);

        log.info(classBTruck.toString());
        log.info(car.toString());


    }
}
