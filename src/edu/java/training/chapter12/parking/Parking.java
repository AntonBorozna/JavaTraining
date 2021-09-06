package edu.java.training.chapter12.parking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Parking<T extends Place> {

	private final int CAR_PLACES = 5;
	private Semaphore semaphore = new Semaphore(CAR_PLACES, true);
	private List<T> places = new ArrayList<>();

	public Parking(List<T> source) {
		places.addAll(source);
	}

	public T getPlace(Car car, long maxWaitTime) throws ResourсeException {
		try {
			if (semaphore.tryAcquire(maxWaitTime, TimeUnit.MILLISECONDS)) {
				for (T place : places) {
					if (!place.isBusy()) {
						place.setBusy(true);
						System.out.println("Car " + car.getId() + " took place " + place);
						return place;
					}
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		throw new ResourсeException("timed out " + maxWaitTime);

	}

	public void releasePlace(Car car, T place) {
		place.setBusy(false);
		System.out.println("Car #" + car.getId() + ": " + place + " --> released");
		semaphore.release();
	}

}