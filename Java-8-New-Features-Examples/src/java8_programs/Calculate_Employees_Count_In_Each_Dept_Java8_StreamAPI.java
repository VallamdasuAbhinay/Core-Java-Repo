package java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculate_Employees_Count_In_Each_Dept_Java8_StreamAPI {

	public static void main(String[] args) {

		List<EmployeeClass> employeesList = Arrays.asList(
				new EmployeeClass("Abhinay", "Vallamdasu", "Banking", "Hyderabad", 1000),
				new EmployeeClass("Archana", "Vallamdasu", "HR", "Hyderabad", 2000),
				new EmployeeClass("Srithik", "Vallamdasu", "Admin", "Hyderabad", 3000),
				new EmployeeClass("SuryaTej", "Vallamdasu", "Admin", "Hyderabad", 4000),
				new EmployeeClass("Urmila", "Vallamdasu", "HR", "Hyderabad", 5000),
				new EmployeeClass("Amarendar", "Vallamdasu", "Banking", "Hyderabad", 6000),
				new EmployeeClass("Shiva", "Kailas", "Exam", "Hyderabad", 4000));

		Map<String, Long> deptAndCountMap = employeesList.stream()
				.collect(Collectors.groupingBy(EmployeeClass::getDepartment, Collectors.counting()));
		deptAndCountMap.entrySet().stream().forEach(f -> System.out.println(f.getKey() + "--" + f.getValue()));
	}
}

/*
 * In this example, we have taken some test data for EmployeeClass and added
 * them to a list. Then, here we are grouping them by department and applied
 * Collectors.counting() to calculate the count of the employees in each
 * department.
 * 
 * Once above results are collected to a map, we are iterating over this to
 * print the department name and employees count
 */