package Java8_Lambda_Expression_Examples;

import java.util.Arrays;
import java.util.List;

public class Calculate_Average_And_Total_Employee_Salaries_Using_StreamAPI {

	public static void main(String[] args) {
		List<EmployeeClass> employeesList = Arrays.asList(
				new EmployeeClass("Abhinay", "Vallamdasu", "Banking", "Hyderabad", 160000),
				new EmployeeClass("Archana", "Vallamdasu", "IT", "Hyderabad", 190000),
				new EmployeeClass("Srithik", "Vallamdasu", "CSE", "Hyderabad", 120000),
				new EmployeeClass("Urmila", "Vallamdasu", "Mech", "Hyderabad", 100000),
				new EmployeeClass("Amarendar", "Vallamdasu", "Banking", "Hyderabad", 190000));
		double averageEmpSalary = employeesList.stream().mapToDouble(EmployeeClass::getSalary).average().orElse(0d);
		System.out.println("Average Employee Salary is "+averageEmpSalary);

		double totalEmpSalary = employeesList.stream().mapToDouble(EmployeeClass::getSalary).sum();
		System.out.println("Total Employee Salary is "+totalEmpSalary);
	}

}
