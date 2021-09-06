package edu.java.training.chapter12.parking;

public class ResourсeException extends Exception {

	private static final long serialVersionUID = 1L;

	public ResourсeException(String message) {
		super(message);
	}

	public ResourсeException(String message, Throwable couse) {
		super(message, couse);
	}

	public ResourсeException(Throwable couse) {
		super(couse);
	}

	@Override
	public String toString() {
		return "ResourсeException []";
	}

}
