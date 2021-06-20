package edu.java.training.chapter4.plane;

import edu.java.training.chapter4.AircraftType;

public class CargoAircraft extends Plane {

    private int maxPayLoad;
        

    public CargoAircraft(String name, String regNum, int range, int fuelConsumption, int maxPayLoad) {
        super(name, regNum, range, fuelConsumption, AircraftType.CARGO);        
        this.maxPayLoad = maxPayLoad;
    }

    public int getMaxPayLoad() {
        return maxPayLoad;
    }  
    

    
	public void setMaxPayLoad(int maxPayLoad) {
		this.maxPayLoad = maxPayLoad;
	}

	@Override
    public String toString() {
        return "\nAircraft: " + getName() + ", Registration Number: " + getRegNum() + ", Type: " + getType() +
                ", maxPayLoad: " + maxPayLoad + " tonnes, Fuel Consumption: " + getFuelConsumption() +
                " kg per hour, Max Range: " + getRange() + "km.";
    }
}
