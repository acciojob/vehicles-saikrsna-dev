package com.driver;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    @Override
    public String getVehicleName() {
        return getVehicleName();
    }

    @Override
    public int getVehicleCapacity() {
        return getVehicleCapacity();
    }
}
