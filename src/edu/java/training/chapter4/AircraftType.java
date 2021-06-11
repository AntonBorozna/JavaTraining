package edu.java.training.chapter4;

public enum AircraftType {
    CARGO("Cargo"),
    PASSENGER("Passenger");

    private final String type;

    AircraftType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
