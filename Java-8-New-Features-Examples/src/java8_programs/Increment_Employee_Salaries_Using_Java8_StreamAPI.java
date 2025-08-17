package java8_programs;

import java.util.Arrays;
import java.util.List;

public class Increment_Employee_Salaries_Using_Java8_StreamAPI {

	public static void main(String[] args) {
		List<EmployeeClass> employeesList = Arrays.asList(
				new EmployeeClass("Abhinay", "Vallamdasu", "Banking", "Hyderabad", 160000),
				new EmployeeClass("Archana", "Vallamdasu", "IT", "Hyderabad", 190000),
				new EmployeeClass("Srithik", "Vallamdasu", "CSE", "Hyderabad", 120000),
				new EmployeeClass("Urmila", "Vallamdasu", "Mech", "Hyderabad", 100000),
				new EmployeeClass("Amarendar", "Vallamdasu", "Banking", "Hyderabad", 190000));
		double incrementAmount = 10000d;
		System.out.println("Employees Salaries Before Adding Increment..........");
		employeesList.stream().forEach(System.out::println);
		System.out.println("------------------------");
		System.out.println("Employees Salaries After Adding Increment..........");

		// use the below statement that will print only incremented salaries and
		// original employee salary data will not get modified
		employeesList.stream().map(emp -> emp.getSalary() + incrementAmount).forEach(System.out::println);
		
		//use below statement to print entire employee object and this will modify the original employee salary data
		employeesList.stream().map(emp -> {
			emp.setSalary(emp.getSalary() + incrementAmount);
			return emp;
		}).forEach(emp -> System.out.println(emp.getFirstName()+"----"+emp.getSalary()));

	}

}
