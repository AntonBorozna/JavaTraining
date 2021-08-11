package edu.java.training.chapter4.plane;

import java.io.Serializable;

import edu.java.training.chapter4.AircraftType;

public abstract class Plane implements Comparable<Plane>,Serializable{
   
	private static final long serialVersionUID = 1L;
	private String name;
	private String regNum;
    private int range;
    private int fuelConsumption;
    private AircraftType type;
    
    public Plane() {}

    public Plane(String name, String regNum, int range, int fuelConsumption, AircraftType type) {
        this.regNum = regNum;
        this.name = name;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
        this.type = type;
        
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getRange() {
        return range;
    }

    public String getName() {
        return name;
    }

    public String getRegNum() {
        return regNum;
    }

    public AircraftType getType() {
        return type;
    }
    
    public void setName(String name) {
		this.name = name;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public void setType(AircraftType type) {
		this.type = type;
	}

    @Override
    public int compareTo(Plane o) {
        return this.range - o.range;
    }
}
