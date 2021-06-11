package edu.java.training.chapter4;

import edu.java.training.chapter4.plane.CargoAircraft;
import edu.java.training.chapter4.plane.PassengerAircraft;
import edu.java.training.chapter4.plane.Plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightPark {


    List<Plane> planes = new ArrayList<>();

    void fillPlanes() {
        planes.add(new PassengerAircraft("Airbus A321neo", "AI200-001", 7400, 2740, 210, AircraftType.PASSENGER));
        planes.add(new PassengerAircraft("Airbus A321neo", "AI200-002", 7400, 2740, 210, AircraftType.PASSENGER));
        planes.add(new PassengerAircraft("Airbus A321neo", "AI200-003", 7400, 2740, 210, AircraftType.PASSENGER));
        planes.add(new PassengerAircraft("Boeing 777-300ER", "BO300-01", 13649, 7800, 450, AircraftType.PASSENGER));
        planes.add(new CargoAircraft("Boeing 777 Freighter", "BO777-001", 9047, 9000, 103, AircraftType.CARGO));
        planes.add(new CargoAircraft("Boeing 757-200F", "BO757F-001", 5834, 3300, 39, AircraftType.CARGO));
        planes.add(new CargoAircraft("Airbus A330-200F", "AI300F-001", 7400, 5600, 70, AircraftType.CARGO));
        planes.add(new CargoAircraft("Airbus A330-200F", "AI300F-002", 7400, 5600, 70, AircraftType.CARGO));
    }

    void sortByRange() {
        Collections.sort(planes);
        System.out.println(planes);
    }

    void rangeConsumption(int min, int max) {
        System.out.print("Planes with range of fuel consumption between " + min + " and " + max + " kg per hour: ");
        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i).getFuelConsumption() >= min & planes.get(i).getFuelConsumption() <= max) {
                System.out.print(planes.get(i));
            }
        }
    }

    void sumCapacity() {
        List<PassengerAircraft> passengerAircrafts = new ArrayList<>();
        List<CargoAircraft> cargoAircrafts = new ArrayList<>();
        int sumSeating = 0;
        int sumCapacity = 0;
        for (Plane plane : planes) {
            if (plane.getType().equals(AircraftType.PASSENGER)) {
                passengerAircrafts.add((PassengerAircraft) plane);
            } else {
                cargoAircrafts.add((CargoAircraft) plane);
            }
        }

        for (PassengerAircraft passengerAircraft : passengerAircrafts) {
            sumSeating += passengerAircraft.getSeating();
        }
        for (CargoAircraft cargoAircraft : cargoAircrafts) {
            sumCapacity += cargoAircraft.getMaxPayLoad();
        }
        System.out.println("Seating: " + sumSeating + ", Capacity: " + sumCapacity + " tonnes");
    }

    @Override
    public String toString() {
        return "Flight Park: " + planes;
    }
}
