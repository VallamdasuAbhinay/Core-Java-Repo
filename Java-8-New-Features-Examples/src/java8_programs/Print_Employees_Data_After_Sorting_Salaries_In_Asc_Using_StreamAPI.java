package java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Print_Employees_Data_After_Sorting_Salaries_In_Asc_Using_StreamAPI {

	public static void main(String[] args) {
		List<EmployeeClass> employeesList = Arrays.asList(
				new EmployeeClass("Abhinay", "Vallamdasu", "Banking", "Hyderabad", 160000),
				new EmployeeClass("Archana", "Vallamdasu", "IT", "Hyderabad", 190001),
				new EmployeeClass("Srithik", "Vallamdasu", "CSE", "Hyderabad", 120000),
				new EmployeeClass("Urmila", "Vallamdasu", "Mech", "Hyderabad", 100000),
				new EmployeeClass("Amarendar", "Vallamdasu", "Banking", "Hyderabad", 190000.5));
		System.out.println("Printing the Employees Data after sorting them based on salaries in ascending order");
		employeesList.stream().sorted(Comparator.comparingDouble(EmployeeClass::getSalary))
				.forEach(System.out::println);
	}

}
