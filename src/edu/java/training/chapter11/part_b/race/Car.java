package edu.java.training.chapter11.part_b.race;

public class Car {
	private int speed;
	private int position;
	private double finishTime;

	public Car(int speed, int position) {
		super();
		this.speed = speed;
		this.position = position;
	}

	public Car() {
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public double getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(double finishTime) {
		this.finishTime = finishTime;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", position=" + position + ", finishTime=" + finishTime + "]";
	}	
}
