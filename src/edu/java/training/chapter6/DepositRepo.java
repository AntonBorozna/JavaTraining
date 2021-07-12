package edu.java.training.chapter6;

import java.util.ArrayList;
import java.util.List;

public class DepositRepo implements Openable {

	List<Deposit> deposits = new ArrayList<>();

	public void fillDeposits() {
		addDepositToRepo(new Deposit("Perpetual", "USD", "Revocable", 3, 9000));
		autoFillDepositId(deposits);
		addDepositToRepo(new Deposit("Long-term", 10, "EUR", "Irrevocable", 10, 1000));
		autoFillDepositId(deposits);
		addDepositToRepo(new Deposit("Short-term", 90, "BYN", "Irrevocable", 2, 100000));
		autoFillDepositId(deposits);
	}

	public Deposit openDeposit(String lengthType, int length, String currency, String type, double percent,
			double quantity) {
		Deposit deposit = null;
		if (lengthType.equals("Short-term") || lengthType.equals("Long-term")) {
			deposit = new Deposit(lengthType, length, currency, type, percent, quantity);
			System.out.println("Deposit can be opened.");
		} else {
			System.out.println("Length Type should be Short-term or Long-term.");
		}
		return deposit;
	}

	public Deposit openDeposit(String lengthType, String currency, String type, double percent, double quantity) {
		Deposit deposit = null;
		if (lengthType.equals("Perpetual")) {
			deposit = new Deposit(lengthType, currency, type, percent, quantity);
			System.out.println("Deposit can be opened.");
		} else {
			System.out.println("Length Type should be Perpetual.");
		}
		return deposit;
	}

	public void addDepositToRepo(Deposit deposit) {
		deposits.add(deposit);
		autoFillDepositId(deposits);
		deposits.get(deposits.size() - 1).setStatus("Open");
		System.out.println("Deposit has been opened: " + deposits.get(deposits.size() - 1).toString());
	}

	public void printAllDeposits(List<Deposit> deposits) {
		for (Deposit deposit : deposits) {
			System.out.println(deposit.toString());
		}
	}

	private static void autoFillDepositId(List<Deposit> deposits) {
		deposits.get(deposits.size() - 1).setId(deposits.size());
	}

	public List<Deposit> getDeposits() {
		return deposits;
	}

	/*
	 * Уточнить почему removeDeposit с типом boolean
	 */

//	public boolean removeDeposit(List<Deposit> deposits, int id) {
//		boolean isDepositClose = false;		
//		return isDepositClose;
//	}

}
