package edu.java.training.chapter6;

public interface Openable {
	
	public Deposit openDeposit(String lengthType, int length,  String currency, String type, double percent, double quantity);
	public Deposit openDeposit(String lengthType, String currency, String type, double percent, double quantity);

}
