package edu.java.training.chapter11.part_b;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * Реализовать класс, моделирующий работу N-местной автостоянки. Машина
 * подъезжает к определенному месту и едет вправо, пока не встретится свободное
 * место. Класс должен поддерживать методы, обслуживающие приезд и отъезд машины
 */

public class Parking {

	Set<Integer> parkingPlaces = new HashSet<>();

	public void fillParking() {
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			parkingPlaces.add(rand.nextInt(99) + 1);
		}
		System.out.println(parkingPlaces + " \noccupied places: " + parkingPlaces.size());
	}

	public void addCar() {
		for (int i = 1; i <= 100; i++) {
			if (!parkingPlaces.contains(i)) {
				parkingPlaces.add(i);
				System.out.println("Car take place " + i + " \noccupied places: " + parkingPlaces.size());
				break;
			}
		}
	}

	public void removeCarFromSpecificPlace(int parkingPlace) {
		if (parkingPlaces.contains(parkingPlace)) {
			parkingPlaces.remove(parkingPlace);
			System.out.println(parkingPlace + " Removed");
		} else {
			System.out.println("Parking place is already free");
		}
	}
}
