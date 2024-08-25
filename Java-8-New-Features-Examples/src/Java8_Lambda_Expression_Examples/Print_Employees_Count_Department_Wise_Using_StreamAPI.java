package Java8_Lambda_Expression_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Print_Employees_Count_Department_Wise_Using_StreamAPI {

	public static void main(String[] args) {
		List<EmployeeClass> employeesList = Arrays.asList(
				new EmployeeClass("Abhinay", "Vallamdasu", "Banking", "Hyderabad", 160000),
				new EmployeeClass("Archana", "Vallamdasu", "IT", "Hyderabad", 190000),
				new EmployeeClass("Srithik", "Vallamdasu", "CSE", "Hyderabad", 120000),
				new EmployeeClass("Urmila", "Vallamdasu", "Mech", "Hyderabad", 100000),
				new EmployeeClass("Amarendar", "Vallamdasu", "Banking", "Hyderabad", 190000),
				new EmployeeClass("Kailas", "Vallamdasu", "CSE", "Hyderabad", 190000));

		Map<String, Long> collect = employeesList.stream().collect(Collectors.groupingBy(EmployeeClass::getDepartment, Collectors.counting()));
		System.out.println("Printing Employees Count In Each Department");
		System.out.println(collect);
	}

}
