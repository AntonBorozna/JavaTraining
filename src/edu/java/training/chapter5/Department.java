package edu.java.training.chapter5;


import java.util.ArrayList;
import java.util.List;

public class Department {

    private final String departmentName = "Department of launching and debugging of mechanisms of connecting purpose of non-lethal devices.";

    List<EmployeePosition> employeePositionList = new ArrayList<>();

    public void fillEmployee() {
        employeePositionList.add(new EmployeePosition("Respirator", "Fedorovich", "11/22/99", "12/22/99"));
        employeePositionList.add(new EmployeePosition("Drel", "Fedor", "11/22/11", "12/22/12"));
        employeePositionList.add(new EmployeePosition("Perforator", "Fedorvna", "11/22/00", "12/22/01"));
    }

    public void printDepartmentList() {
        System.out.println(employeePositionList.toString());
    }


    private class EmployeePosition {
        private String positionName;
        private String employeeName;
        private String dateOfEmployment;
        private String dateOfTermination;


        EmployeePosition(String positionName, String employeeName, String dateOfEmployment, String dateOfTermination) {
            this.positionName = positionName;
            this.employeeName = employeeName;
            this.dateOfEmployment = dateOfEmployment;
            this.dateOfTermination = dateOfTermination;
        }


        @Override
        public String toString() {
            return "EmployeePosition of " + departmentName + "\n {" +
                    "positionName='" + positionName + '\'' +
                    ", employeeName='" + employeeName + '\'' +
                    ", dateOfEmployment='" + dateOfEmployment + '\'' +
                    ", dateOfTermination='" + dateOfTermination + '\'' +
                    "}\n ";
        }
    }
}
