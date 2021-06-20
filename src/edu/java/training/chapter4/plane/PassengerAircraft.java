package edu.java.training.chapter4.plane;

import edu.java.training.chapter4.AircraftType;

public class PassengerAircraft extends Plane {

    private int seating;

    public PassengerAircraft(String name, String regNum, int range, int fuelConsumption, int seating) {
        super(name, regNum, range, fuelConsumption, AircraftType.PASSENGER);        
        this.seating = seating;
    }

    public int getSeating() {
        return seating;
    }

    @Override
    public String toString() {
        return "\nAircraft " + getName() + ", Registration Number: " + getRegNum() + ", Type: " + getType() +
                ", Seating: " + seating + ", Fuel Consumption: " + getFuelConsumption() +
                " kg per hour, Max Range: " + getRange() + "km.";
    }
}
