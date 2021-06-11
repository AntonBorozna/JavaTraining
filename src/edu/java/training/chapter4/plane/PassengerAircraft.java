package edu.java.training.chapter4.plane;

import edu.java.training.chapter4.AircraftType;

public class PassengerAircraft extends Plane {

    private int seating;

    public PassengerAircraft(String name, String regNum, int range, int fuelConsumption, int seating, AircraftType type) {
        super(name, regNum, range, fuelConsumption, type);
        this.seating = seating;
    }

    public int getSeating() {
        return seating;
    }

    @Override
    public String toString() {
        return "\nAircraft " + getName() + ", Registration Number: " + getRegNum() + ", Type: " + AircraftType.PASSENGER.getType() +
                ", Seating: " + seating + ", Fuel Consumption: " + getFuelConsumption() +
                " kg per hour, Max Range: " + getRange() + "km.";
    }
}
