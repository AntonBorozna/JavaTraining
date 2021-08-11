package edu.java.training.chapter10.part_b;

import edu.java.training.chapter4.plane.CargoAircraft;
import edu.java.training.chapter4.plane.PassengerAircraft;

public class Runner {
	public static void main(String[] args) {

		XMLCoder coder = new XMLCoder();
		coder.saveObjectToXML(new PassengerAircraft("Airbus A321neo", "AI200-001", 7400, 2740, 210));
		coder.getObjectFromXML("AI200-001");
		coder.saveObjectToXML(new CargoAircraft("Boeing 757-200F", "BO757F-001", 5834, 3300, 39));
		coder.getObjectFromXML("BO757F-001");
	}
}
