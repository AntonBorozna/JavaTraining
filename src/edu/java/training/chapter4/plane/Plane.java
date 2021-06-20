package edu.java.training.chapter4.plane;

import edu.java.training.chapter4.AircraftType;

public abstract class Plane implements Comparable<Plane> {

    private String name;
    private String regNum;
    private int range;
    private int fuelConsumption;
    private AircraftType type;

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

    @Override
    public int compareTo(Plane o) {
        return this.range - o.range;
    }
}
