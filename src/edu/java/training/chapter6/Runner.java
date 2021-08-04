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
		Console console = new Console();
		console.runByUserChoice(depositRepo.openDeposit());		
	    depositRepo.printAllDeposits(depositRepo.getDeposits());		
	}
}
