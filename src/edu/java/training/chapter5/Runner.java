package edu.java.training.chapter5;
/*
        Создать класс Department с внутренним классом, с помощью объектов ко-
        торого можно хранить информацию обо всех должностях отдела и обо всех
        сотрудниках, когда-либо занимавших конкретную должность.
 */

public class Runner {

	public static void main(String[] args) {
		Department department = new Department();
		department.fillEmployee();
		department.printDepartmentList();
		department.addPosition("Developer");
		department.addPosition("HR");
		department.returnSpecificEmployee("Developer");
		department.returnSpecificEmployee("Tester");
		department.addEmployee("HR", "Victoria", "01/01/2019");
		department.terminateEmployee("Michael", "22/11/2021");
		System.out.println();
		System.out.println("Position list:");
		department.returnPositionsList();
		System.out.println();
		System.out.println("final list:");
		department.printDepartmentList();

	}
}
