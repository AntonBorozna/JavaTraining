package edu.java.training.chapter5;
/*
        Создать класс Department с внутренним классом, с помощью объектов ко-
        торого можно хранить информацию обо всех должностях отдела и обо всех
        сотрудниках, когда-либо занимавших конкретную должность.
 */

public class Runner {

    public static void main(String[] args) {
        Department department = new Department();
        Department.Position position = department.new Position();
        Department.Employee employee = department.new Employee();
        department.fillEmployee();
//        department.printDepartmentList();
//        position.addPosition("Developer");
//        position.addPosition("HR");
  //      department.returnSpecificEmployee("Developer");
//        department.returnSpecificEmployee("Tester");
        position.returnPositionsList();
//        department.printDepartmentList();
//        employee.terminateEmployee("Michael", "22/11/2021");
   //     System.out.println();
 //       System.out.println("final list:");
  //      department.printDepartmentList();
        
    }
}
