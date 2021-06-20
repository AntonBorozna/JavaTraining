package edu.java.training.chapter5;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String positionTitle;
    private String employeeName;
    private String dateOfEmployment;
    private String dateOfTermination;
    private final String departmentName = "QA/DEV";    
    
    Department(){}
    
    Department(String positionTitle, String employeeName, String dateOfEmployment, String dateOfTermination){
    	this.positionTitle = positionTitle;
    	this.employeeName = employeeName;
    	this.dateOfEmployment = dateOfEmployment;
    	this.dateOfTermination = dateOfTermination;    			
    }
    
    List<Department> employeePositionList = new ArrayList<>();  

    public void fillEmployee() {
        employeePositionList.add(new Department("Manager","Michael","01/01/2020",null));
        employeePositionList.add(new Department("Developer","Tomas","01/01/2010","31/12/2019"));
        employeePositionList.add(new Department("Developer","Michael","01/01/2020",null));
        employeePositionList.add(new Department("Tester","Hanna","01/01/2010",null));
        employeePositionList.add(new Department("Tester",null,null,null));
    }

    public void printDepartmentList() {
        System.out.println(employeePositionList.toString());
    }
    
    public void returnSpecificEmployee(String positionTitle) {
    	List<String> positionList = new ArrayList<>();	
    	for(int i = 0; i < employeePositionList.size(); i++) {
    		positionList.add(employeePositionList.get(i).getPositionTitle().toString());
    	}
    	if(positionList.contains(positionTitle)) {
    		System.out.println("List of employees wit title " + positionTitle);
    		for(Department employeePosition : employeePositionList) {    			
    			try {
    				if (employeePosition.getPositionTitle().equals(positionTitle)  && !employeePosition.getEmployeeName().equals(null)) {				
        				System.out.print(employeePosition.toString());
        			} 
				}catch (Exception e) {
					continue;
				}    				     
    		}
    	} else {
    		System.out.println(positionTitle + " position doesn't exist");
    	}
    }	

    class Employee{    	
    	void addEmployee(String positionTitle, String employeeName, String dateOfEmployment) {
    		employeePositionList.add(new Department(positionTitle,employeeName,dateOfEmployment,null));
    	}
    	
    	void terminateEmployee(String employeeName, String dateOfTermination) {
    		List<String> positionList = new ArrayList<>();			
			for(int i = 0; i < employeePositionList.size(); i++) {
				try {
					if (employeePositionList.get(i).getEmployeeName().equals(null)) {
					
					} else {
						positionList.add(employeePositionList.get(i).getEmployeeName().toString());
					}
				}catch (Exception e) {
					continue;
				}
			}			
			for(int i = 0; i < employeePositionList.size(); i++) {
				if(positionList.contains(employeeName)) {
					employeePositionList.set(employeePositionList.indexOf(employeePositionList.get(i)), new Department(employeePositionList.get(i).positionTitle,
							employeePositionList.get(i).employeeName, employeePositionList.get(i).dateOfEmployment,dateOfTermination));
					System.out.println(employeeName + " terminated.");
					System.out.println(employeePositionList.get(i).toString());
					break;
				} 
			}			
    	}          
    }
    
    class Position{  	    	   	

		void addPosition(String position){
			List<String> positionList = new ArrayList<>();			
			for(int i = 0; i < employeePositionList.size(); i++) {
				positionList.add(employeePositionList.get(i).getPositionTitle().toString());
			}
			if(positionList.contains(position)) {
				System.out.println("Position " + position + " already exist.");
			} else {
				employeePositionList.add(new Department(position,null,null,null));
				System.out.println("Position " + position + " added.");
			}	
    	}				
	    	
    	void returnPositionsList() {    		    		
			for(int i = 0; i < employeePositionList.size(); i++) {				
				try {
					if (employeePositionList.get(i).getEmployeeName().equals(null)) {
						
					} else {
						System.out.println(employeePositionList.get(i).getPositionTitle().toString() + " booked.");
					}
				}catch (Exception e) {					
					System.out.println(employeePositionList.get(i).getPositionTitle().toString() + " open.");
				}
			}			
    	}
    }

    public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(String dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

	public String getDateOfTermination() {
		return dateOfTermination;
	}

	public void setDateOfTermination(String dateOfTermination) {
		this.dateOfTermination = dateOfTermination;
	}

	@Override
	public String toString() {
		return "Department " + departmentName + " [positionTitle=" + positionTitle + ", employeeName=" + employeeName + ", dateOfEmployment="
				+ dateOfEmployment + ", dateOfTermination=" + dateOfTermination + "]" + " \n";
	}  
    
}
