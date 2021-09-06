package edu.java.training.chapter12.parking;

public class Car extends Thread {

	private Parking<ParkingPlace> parking;

	public Car(Parking<ParkingPlace> parking) {
		this.parking = parking;
	}

	public void run() {
		ParkingPlace parkingPlace = null;
		try {
			parkingPlace = parking.getPlace(this, 500);
		} catch (ResourсeException e) {
			System.err.println("Client #" + this.getId() + " lost ->" + e.getMessage());
		} finally {
			if (parkingPlace != null) {
				parking.releasePlace(this, parkingPlace);
			}
		}
	}

}
