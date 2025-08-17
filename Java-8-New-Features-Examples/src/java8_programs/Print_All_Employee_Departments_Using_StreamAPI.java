package java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Print_All_Employee_Departments_Using_StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeClass> employeesList = Arrays.asList(
				new EmployeeClass("Abhinay", "Vallamdasu", "Banking", "Hyderabad", 160000),
				new EmployeeClass("Archana", "Vallamdasu", "IT", "Hyderabad", 190000),
				new EmployeeClass("Srithik", "Vallamdasu", "CSE", "Hyderabad", 120000),
				new EmployeeClass("Urmila", "Vallamdasu", "Mech", "Hyderabad", 100000),
				new EmployeeClass("Amarendar", "Vallamdasu", "Banking", "Hyderabad", 190000));
		List<String> collect = employeesList.stream().map(EmployeeClass::getDepartment).distinct().collect(Collectors.toList());
		System.out.println("Printing all the distinct department names of employees");
		System.out.println(collect);
	}

}
