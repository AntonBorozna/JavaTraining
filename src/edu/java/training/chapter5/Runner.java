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
    }
}
