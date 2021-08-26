package edu.java.training.chapter11.part_b;

import edu.java.training.chapter11.part_b.race.Race;

public class Runner {	

	public static void main(String[] args) {

		Race race = new Race();		
		race.startRace(race.fillStartLine(10));
		race.printResults();		
		BlackBox box = new BlackBox();
		box.fillBlackBox();
		box.returnMinNumber(400);		
		Kicker util = new Kicker();		
		util.removeEverySecondArray(100);
		util.removeEverySecondLinked(100);
		Parking parking = new Parking();
		parking.fillParking();
		parking.addCar();
		parking.addCar();
		parking.addCar();
		parking.removeCarFromSpecificPlace(1);
		parking.removeCarFromSpecificPlace(22);
	}
}
