package edu.java.training.chapter12.parking;

import java.util.ArrayList;
import java.util.List;

/*
 * Разработать многопоточное приложение. Использовать возможности, 
 * предоставляемые пакетом java.util.concurrent. Не использовать слово synchronized.
 * Все сущности, желающие получить доступ к ресурсу, должны быть потоками.
 * . Автостоянка. 
 * Доступно несколько машиномест. На одном месте может находиться только один автомобиль. 
 * Если все места заняты, то автомобиль не станет ждать больше определенного времени и уедет на другую стоянку.
 */

public class Runner {

	public static void main(String[] args) {
		List<ParkingPlace> parkingList = new ArrayList<ParkingPlace>() {
			{
				this.add(new ParkingPlace(514));
				this.add(new ParkingPlace(725));
				this.add(new ParkingPlace(852));
				this.add(new ParkingPlace(952));
				this.add(new ParkingPlace(471));				
			}
		};

		Parking<ParkingPlace> parking = new Parking<>(parkingList);
		for (int i = 0; i < 20; i++) {
			new Car(parking).start();
		}
	}
}
