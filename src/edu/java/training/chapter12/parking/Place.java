package edu.java.training.chapter12.parking;

public abstract class Place {
	private volatile boolean busy;

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	public abstract void using();
}
