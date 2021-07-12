package edu.java.training.chapter5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Department {

	private final String departmentName = "QA/DEV";
	private Employee employee;
	private String dateOfTermination;

	Department() {
	}

	Department(Employee employee, String dateOfTermination) {
		this.employee = employee;
		this.dateOfTermination = dateOfTermination;
	}

	List<Department> employeePositionList = new ArrayList<>();

	public void fillEmployee() {
		employeePositionList.add(new Department(new Employee(new Position("Manager"), "Michael", "01/01/2020"), null));
		employeePositionList
				.add(new Department(new Employee(new Position("Developer"), "Tomas", "01/01/2010"), "31/12/2019"));
		employeePositionList
				.add(new Department(new Employee(new Position("Developer"), "Michael", "01/01/2020"), null));
		employeePositionList.add(new Department(new Employee(new Position("Tester"), "Hanna", "01/01/2010"), null));
		employeePositionList.add(new Department(new Employee(new Position("Tester"), null, null), null));
	}

	public void printDepartmentList() {
		System.out.println(employeePositionList.toString());
	}

	public void returnSpecificEmployee(String positionTitle) {
		List<String> positionList = new ArrayList<>();
		for (int i = 0; i < employeePositionList.size(); i++) {
			positionList.add(employeePositionList.get(i).employee.position.positionTitle.toString());
		}
		if (positionList.contains(positionTitle)) {
			System.out.println();
			System.out.println("List of employees with title " + positionTitle);
			for (Department employeePosition : employeePositionList) {
				try {
					if (employeePosition.employee.position.positionTitle.toString().equals(positionTitle)
							&& !employeePosition.employee.employeeName.equals(null)) {
						System.out.print(employeePosition.toString());
					}
				} catch (Exception e) {
					continue;
				}
			}
		} else {
			System.out.println(positionTitle + " position doesn't exist");
		}
		System.out.println();
	}

	void addPosition(String position) {
		List<String> positionList = new ArrayList<>();
		for (int i = 0; i < employeePositionList.size(); i++) {
			positionList.add(employeePositionList.get(i).employee.position.positionTitle.toString());
		}
		if (positionList.contains(position)) {
			System.out.println("Position " + position + " already exist.");
		} else {
			employeePositionList.add(new Department(new Employee(new Position(position), null, null), null));
			System.out.println("Position " + position + " added.");
		}
	}

	void returnPositionsList() {
		List<String> positionList = new ArrayList<>();
		for (int i = 0; i < employeePositionList.size(); i++) {
			positionList.add(employeePositionList.get(i).employee.position.positionTitle.toString());
		}

		Map<String, Integer> positions = new HashMap<String, Integer>();

		for (int i = 0; i < positionList.size(); i++) {
			String tempPosition = positionList.get(i);

			if (!positions.containsKey(tempPosition)) {
				positions.put(tempPosition, 1);
			} else {
				positions.put(tempPosition, positions.get(tempPosition) + 1);
			}
		}

		for (Map.Entry<String, Integer> entry : positions.entrySet()) {
			System.out.println("Number of " + entry.getKey()  + "s = " + entry.getValue());
		}
	}

	void addEmployee(String positionTitle, String employeeName, String dateOfEmployment) {
		employeePositionList
				.add(new Department(new Employee(new Position(positionTitle), employeeName, dateOfEmployment), null));
	}

	void terminateEmployee(String employeeName, String dateOfTermination) {
		List<String> positionList = new ArrayList<>();
		for (int i = 0; i < employeePositionList.size(); i++) {
			try {
				if (employeePositionList.get(i).employee.employeeName.equals(null)) {

				} else {
					positionList.add(employeePositionList.get(i).employee.employeeName.toString());
				}
			} catch (Exception e) {
				continue;
			}
		}
		for (int i = 0; i < employeePositionList.size(); i++) {
			if (positionList.contains(employeeName)) {
				employeePositionList
						.set(employeePositionList.indexOf(employeePositionList.get(i)),
								new Department(
										new Employee(
												new Position(employeePositionList.get(i).employee.position.positionTitle
														.toString()),
												employeePositionList.get(i).employee.employeeName.toString(),
												employeePositionList.get(i).employee.dateOfEmployment.toString()),
										dateOfTermination));
				System.out.print(employeeName + " terminated.");
				System.out.println(employeePositionList.get(i).toString());
				break;
			}
		}
	}

	class Employee {

		private Position position;
		private String employeeName;
		private String dateOfEmployment;

		public Employee(Position position, String employeeName, String dateOfEmployment) {
			super();
			this.position = position;
			this.employeeName = employeeName;
			this.dateOfEmployment = dateOfEmployment;
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

		public Position getPosition() {
			return position;
		}

		public void setPosition(Position position) {
			this.position = position;
		}

		@Override
		public String toString() {
			return employeeName;
		}
	}

	class Position {

		private String positionTitle;

		public Position(String positionTitle) {
			super();
			this.positionTitle = positionTitle;
		}

		public String getPositionTitle() {
			return positionTitle;
		}

		public void setPositionTitle(String positionTitle) {
			this.positionTitle = positionTitle;
		}

		@Override
		public String toString() {
			return positionTitle;
		}
	}

	public String getDateOfTermination() {
		return dateOfTermination;
	}

	public void setDateOfTermination(String dateOfTermination) {
		this.dateOfTermination = dateOfTermination;
	}

	@Override
	public String toString() {
		return "\nDepartment " + departmentName + " [position= " + employee.position.positionTitle + ", employee="
				+ employee + ", dateOfEmployment=" + employee.dateOfEmployment + ", dateOfTermination="
				+ dateOfTermination + "]";
	}
}
