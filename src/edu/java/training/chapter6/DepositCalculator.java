package edu.java.training.chapter6;

import java.util.List;

public class DepositCalculator implements Calculatable{		
		
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
	
}
