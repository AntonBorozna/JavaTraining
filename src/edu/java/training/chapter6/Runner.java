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
		DepositManager manager = new DepositManager();			
		manager.openDeposit(depositRepo.getDeposits(), "Perpetual", "USD", "Revocable", 3, 9000);
		manager.openDeposit(depositRepo.getDeposits(),"erpetual", "USD", "Revocable", 3, 9000);
		manager.openDeposit(depositRepo.getDeposits(),"Short-term", 90 , "USD", "Revocable", 3, 9000);		
		manager.openDeposit(depositRepo.getDeposits(),"Long-term", 3 , "USD", "Revocable", 3, 9000);
		manager.calculateProfit(depositRepo.getDeposits(),1);
		manager.calculateProfit(depositRepo.getDeposits(),2);
		manager.calculateProfit(depositRepo.getDeposits(),3);
		manager.getType(depositRepo.getDeposits(),1);
		}	

}
