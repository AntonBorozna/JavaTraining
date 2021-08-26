package edu.java.training.chapter11.part_b.race;

/*
 * На прямой гоночной трассе стоит N автомобилей, для каждого из которых
 * известны начальное положение и скорость. Определить, сколько произойдет обгонов
 */

import java.util.ArrayList;
import java.util.List;

public class Race {
	List<Car> cars = new ArrayList<>();

	private final int TRACK_LENGTH = 10000;

	public List<Car> fillStartLine(int numberOfCars) {
		for (int i = 0; i < numberOfCars; i++) {
			int speed = (int) (50 + Math.random() * 100);
			int position = (int) (Math.random() * 1000);
			cars.add(new Car(speed, position));
		}
		return cars;
	}

	public void startRace(List<Car> cars) {
		for (Car car : cars) {
			double finishTime = (TRACK_LENGTH - car.getPosition()) / car.getSpeed();
			car.setFinishTime(finishTime);
		}
	}

	private Integer getOvertakeCount(List<Car> cars) {
		int count = 0;
		for (int i = 0; i < cars.size(); i++) {
			for (int j = 0; j < cars.size(); j++) {
				if (cars.get(i).getPosition() < cars.get(j).getPosition()
						&& cars.get(i).getFinishTime() < cars.get(j).getFinishTime()) {
					count++;
				}
			}
		}
		return count;
	}

	public void printResults() {
		for (Car car : cars) {
			System.out.println(car.toString());
		}
		System.out.println("Overtakes count: " + getOvertakeCount(cars));
	}
}
