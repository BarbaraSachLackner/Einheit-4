package org.lecture.carpark;

import lombok.Builder;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@ToString(callSuper = true)
@Slf4j
public final class ClassBTruck extends Truck {


    protected ClassBTruck(VehicleBrand brand) {
        super(4, 2, brand, 3.5);
        log.debug("ClassBTruck created");
    }
}
