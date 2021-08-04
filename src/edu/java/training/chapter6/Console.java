package edu.java.training.chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
	DepositRepo repo = new DepositRepo();
	DepositCalculator calculator = new DepositCalculator();
	List<Deposit> deposits = new ArrayList<>();

	public void runByUserChoice(Deposit deposit) {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("save, calculate, new or exit?");
		String userAnswer = scanner.next();
		while (!userAnswer.equals("exit")) {
		    switch (userAnswer) {
			case "save":
				repo.addDepositToRepo(deposit);
				userAnswer = "exit";
				break;
			case "calculate":
				calculator.calculateProfit(deposit);				
				userAnswer = scanner.next();
				break;
			case "new":
				repo.openDeposit();
				System.out.println("save, calculate, new or exit");
				userAnswer = scanner.next();
				break;
			
			default:
				System.out.println("save, calculate, new or exit");
				userAnswer = scanner.next();
				break;
			}
		}
	}
}
