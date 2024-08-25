package Java8_Lambda_Expression_Examples;

import java.util.Arrays;
import java.util.List;

public class Print_Employee_Names_Starting_With_Some_Letter_Using_StreamAPI {

	public static void main(String[] args) {
		List<EmployeeClass> employeesList = Arrays.asList(
				new EmployeeClass("Abhinay", "Vallamdasu", "Banking", "Hyderabad", 160000),
				new EmployeeClass("Archana", "Vallamdasu", "IT", "Hyderabad", 190000),
				new EmployeeClass("Srithik", "Vallamdasu", "CSE", "Hyderabad", 120000),
				new EmployeeClass("Urmila", "Vallamdasu", "Mech", "Hyderabad", 100000),
				new EmployeeClass("Amarendar", "Vallamdasu", "Banking", "Hyderabad", 190000));
		String startingLetter = "A";
		System.out.println("Printing the Employee names which starts with some specific character");
		employeesList.stream().filter(f -> f.getFirstName().startsWith(startingLetter))
				.forEach(emp -> System.out.println(emp));
	}

}
