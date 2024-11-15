package org.ies.vehicles.model;

import org.ies.vehicles.components.VehicleType;

import java.util.Objects;

public class Vehicle {
    private VehicleType vehicleType;
    private int maxSpeed;
    private String color;
    private String plate;

    public Vehicle(VehicleType vehicleType, int maxSpeed, String color, String plate) {
        this.vehicleType = vehicleType;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.plate = plate;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return maxSpeed == vehicle.maxSpeed && Objects.equals(vehicleType, vehicle.vehicleType) && Objects.equals(color, vehicle.color) && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, maxSpeed, color, plate);
    }
}