package Java8_Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Find_Nth_Highest_Salary_Employee_Using_StreamAPI {

	public static void main(String[] args) {

		List<EmployeeClass> employeesList = Arrays.asList(
				new EmployeeClass("Abhinay", "Vallamdasu", "Banking", "Hyderabad", 160000),
				new EmployeeClass("Archana", "Vallamdasu", "IT", "Hyderabad", 190000),
				new EmployeeClass("Srithik", "Vallamdasu", "CSE", "Hyderabad", 120000),
				new EmployeeClass("Urmila", "Vallamdasu", "Mech", "Hyderabad", 100000),
				new EmployeeClass("Amarendar", "Vallamdasu", "Banking", "Hyderabad", 190000));

		findNthHighestEmployeeSalary(2, employeesList);
	}

	
	/*
	 * This approach is the effective one because even if there are multiple
	 * employees with the same highest salary, then this method will print all of
	 * them
	 */
	public static void findNthHighestEmployeeSalary(int num, List<EmployeeClass> employeesList) {
		Entry<Double, List<String>> entry = employeesList.stream()
				.collect(Collectors.groupingBy(EmployeeClass::getSalary,
						Collectors.mapping(EmployeeClass::getFirstName, Collectors.toList())))
				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toList()).get(num - 1);

		System.out.println(entry);
	}
}