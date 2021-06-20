package edu.java.training.chapter6;

import java.util.List;

public class DepositManager implements Calculatable, Openable{	
		
	public void openDeposit(List<Deposit> deposits, String lengthType, int length, String currency, String type, double percent, double quantity) {		
		if(lengthType.equals("Short-term") || lengthType.equals("Long-term")) {
			deposits.add(new Deposit(lengthType, length,  currency, type, percent, quantity));
			autoFillDepositId(deposits);
			System.out.println("Deposit has been opened: " + deposits.get(deposits.size()-1).toString());
		} else {
			System.out.println("Length Type should be Short-term or Long-term.");
		}
	}
	
	public void openDeposit(List<Deposit> deposits,String lengthType, String currency, String type, double percent, double quantity) {		
		if(lengthType.equals("Perpetual")) {
			deposits.add(new Deposit(lengthType, currency, type, percent, quantity));
			autoFillDepositId(deposits);
			System.out.println("Deposit has been opened: " + deposits.get(deposits.size()-1).toString());
		} else {
			System.out.println("Length Type should be Perpetual.");
		}
	}
	
	public void getType(List<Deposit> deposits, int id) {
		for (Deposit deposit : deposits) {
			if(id == deposit.getId()) {
				System.out.println("Deposit Type: " + deposit.getType());				
			}
		}
	}
	
	public void getAllDeposits(List<Deposit> deposits) {
		for (Deposit deposit : deposits) {			
			System.out.println("Deposit Type: " + deposit.getType());
		}
	}
	
	public void calculateProfit(List<Deposit> deposits, int id) {
		for (Deposit deposit : deposits) {
			if(id == deposit.getId() && (deposit.getLengthType().equals("Long-term"))) {
				double profit = ((deposit.getQuantity() / 100) * deposit.getPercent()) * deposit.getLength();
				System.out.println("Deposit profit: " + profit+ " " + deposit.getCurrency() + " for " + deposit.getLength() + " Years.");
			} else if (id == deposit.getId() && (deposit.getLengthType().equals("Perpetual"))){
				double profit = ((deposit.getQuantity() / 100) * deposit.getPercent());
				System.out.println("Year profit: " + profit+ " " + deposit.getCurrency() + " for 1 year.");
			} else if (id == deposit.getId() && (deposit.getLengthType().equals("Short-term"))){
				double profit = (((deposit.getQuantity() / 100) * deposit.getPercent()) / 365 * deposit.getLength());
				System.out.println("Deposit profit: " + profit + " " + deposit.getCurrency() + " for " + deposit.getLength() + " Days.");
			}
		}
	}
	
	public static void autoFillDepositId(List<Deposit> deposits) {
		deposits.get(deposits.size()-1).setId(deposits.size());
	}
}
