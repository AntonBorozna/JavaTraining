package edu.java.training.chapter12.parking;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ParkingPlace extends Place {

	private int parkingPlaceId;

	public int getParkingPlaceId() {
		return parkingPlaceId;
	}

	public void setParkingPlaceId(int parkingPlaceId) {
		this.parkingPlaceId = parkingPlaceId;
	}

	public ParkingPlace(int id) {
		this.parkingPlaceId = id;
	}

	@Override
	public void using() {
		try {
			TimeUnit.MILLISECONDS.sleep(new Random().nextInt(500));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "ParkingPlace [parkingPlaceId=" + parkingPlaceId + "]";
	}
}
