package edu.java.training.chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepositRepo implements Openable {
	Deposit deposit = new Deposit();
	List<Deposit> deposits = new ArrayList<>();

	public void fillDeposits() {
		addDepositToRepo(new Deposit("Perpetual", "USD", "Revocable", 3, 9000));
		autoFillDepositId(deposits);
		addDepositToRepo(new Deposit("Long-term", 10, "EUR", "Irrevocable", 10, 1000));
		autoFillDepositId(deposits);
		addDepositToRepo(new Deposit("Short-term", 90, "BYN", "Irrevocable", 2, 100000));
		autoFillDepositId(deposits);
	}

	public Deposit openDeposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("To open new deposit, please choose what type. \r\n" + "Short-term, Long-term or Perpetual");
		String enteredLegthType = scanner.next();
		switch (enteredLegthType) {
		case "Short-term":
		case "Long-term":
			System.out.println("Please put the following params: \nCurrency");
			String enteredCurrency = scanner.next();
			System.out.println("Choose type: Revocable or Irrevocable");
			String enteredType = scanner.next();
			while (true) {
				if (enteredType.equals("Revocable") || enteredType.equals("Irrevocable")) {
					break;
				}
				System.out.println("Type should be Revocable or Irrevocable.");
				enteredType = scanner.next();
			}
			System.out.println("Enter Quantity");
			double enteredQuantity = scanner.nextDouble();
			System.out.println("Enter Percent");
			double enteredPercent = scanner.nextDouble();
			System.out.println("Enter lenght in years for long-term in days for short-term");
			int enteredLength = scanner.nextInt();
			deposit = new Deposit(enteredLegthType, enteredLength, enteredCurrency, enteredType, enteredPercent,
					enteredQuantity);
			System.out.println(deposit.toString());
			break;
		case "Perpetual":
			System.out.println("Please put the following params:" + "\nCurrency");
			enteredCurrency = scanner.next();
			System.out.println("Enter Quantity");
			enteredQuantity = scanner.nextDouble();
			System.out.println("Enter Percent");
			enteredPercent = scanner.nextDouble();
			deposit = new Deposit(enteredLegthType, enteredCurrency, "Revocable", enteredPercent, enteredQuantity);
			System.out.println(deposit.toString());
			break;
		default:
			System.out.println("Please enter consistent Type");
			openDeposit();
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

	public boolean isDepositExist(List<Deposit> deposits, int id) {		
		return deposits.stream().anyMatch(o -> o.getId() == id);
	}
}
