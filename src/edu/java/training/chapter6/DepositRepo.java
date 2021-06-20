package edu.java.training.chapter6;

import java.util.ArrayList;
import java.util.List;

public class DepositRepo {
	
	List<Deposit> deposits = new ArrayList<>();	
	
	public void fillDeposits() {
		deposits.add(new Deposit("Perpetual", "USD", "Revocable", 3, 9000));
		DepositManager.autoFillDepositId(deposits);
		deposits.add(new Deposit("Long-term", 10, "EUR", "Irrevocable", 7, 1000));
		DepositManager.autoFillDepositId(deposits);
		deposits.add(new Deposit("Short-term", 3, "BYN", "Irrevocable", 10, 100000));
		DepositManager.autoFillDepositId(deposits);
	}		
	
	public List<Deposit> getDeposits(){		
		return deposits;
	}
}
