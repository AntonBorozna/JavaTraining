package edu.java.training.chapter6;

import java.util.List;

public interface Openable {
	
	public void openDeposit(List<Deposit> deposits, String lengthType, int length,  String currency, String type, double percent, double quantity);
	public void openDeposit(List<Deposit> deposits, String lengthType, String currency, String type, double percent, double quantity);

}
