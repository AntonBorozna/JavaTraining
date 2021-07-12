package edu.java.training.chapter6;

/*
Разработать проект управления процессами на основе создания и реализации интерфейсов для следующих предметных областей: 
Банковский вклад. Возможности: изменить продолжительность вклада
(бессрочный/долгосрочный/краткосрочный); узнать, какой вклад (отзывной
или безотзывной); закрыть один вклад и открыть новый с такими же условиями, но в другой валюте; рассчитать начисление процентов по вкладу
 */

public class Runner {
	
	public static void main(String[] args) {
		DepositRepo depositRepo = new DepositRepo();
		depositRepo.fillDeposits();
		DepositCalculator calculator = new DepositCalculator();
		depositRepo.printAllDeposits(depositRepo.getDeposits());
		depositRepo.openDeposit( "Perpetual", "USD", "Revocable", 3, 9000);
		depositRepo.addDepositToRepo(depositRepo.openDeposit("Perpetual", "USD", "Revocable", 3, 9000));
		depositRepo.openDeposit("erpetual", "USD", "Revocable", 3, 9000);
		depositRepo.openDeposit("Short-term", 90 , "USD", "Revocable", 3, 9000);		
		depositRepo.openDeposit("Long-term", 3 , "USD", "Revocable", 3, 9000);
		calculator.calculateProfit(depositRepo.getDeposits(),1);
		calculator.calculateProfit(depositRepo.getDeposits(),2);
		calculator.calculateProfit(depositRepo.getDeposits(),3);		
		depositRepo.printAllDeposits(depositRepo.getDeposits());
		
		}

	

}
