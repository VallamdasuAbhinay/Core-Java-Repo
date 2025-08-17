package java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Fetch_Max_Salary_Employee_Details_Using_max_function {

	public static void main(String[] args) {
		List<EmployeeClass> employeesList = Arrays.asList(
				new EmployeeClass("Abhinay", "Vallamdasu", "Banking", "Hyderabad", 1000),
				new EmployeeClass("Archana", "Vallamdasu", "HR", "Hyderabad", 2000),
				new EmployeeClass("Srithik", "Vallamdasu", "Admin", "Hyderabad", 3000),
				new EmployeeClass("SuryaTej", "Vallamdasu", "Admin", "Hyderabad", 4000),
				new EmployeeClass("Urmila", "Vallamdasu", "HR", "Hyderabad", 5000),
				new EmployeeClass("Amarendar", "Vallamdasu", "Banking", "Hyderabad", 6000),
				new EmployeeClass("Shiva", "Kailas", "Exam", "Hyderabad", 6000));
		Optional<EmployeeClass> maxSalaryEmployee = employeesList.stream()
				.max(Comparator.comparingDouble(EmployeeClass::getSalary));
		System.out.println("The Employee with the maximum salary are: ");
		maxSalaryEmployee.ifPresent(emp -> System.out.println(emp));

		maxSalaryEmployee.ifPresent(emp -> System.out.println(maxSalaryEmployee.get()));

		Optional<EmployeeClass> maxSalEmployee = employeesList.stream()
				.sorted(Comparator.comparingDouble(EmployeeClass::getSalary).reversed()).findFirst();
		if (maxSalEmployee.isPresent()) {
			System.out.println("Max salary employee :: " + maxSalEmployee.get());
		}
		
		System.out.println("Printing employees list in desc order of their salaries::");
		List<EmployeeClass> empListDesc = employeesList.stream()
				.sorted(Comparator.comparingDouble(EmployeeClass::getSalary).reversed()).collect(Collectors.toList());
		empListDesc.forEach(x -> System.out.println(x));
	}

}

/*
 * Here we are fetching the employee details having max salary by providing the
 * Comparator and also an attribute (salary) based on it comparison will happen.
 * 
 * It returns Optional<EmployeeClass> which indicates we might (or) might not
 * have max employee in the provided list.
 * 
 * To check if data is present or not, we have applied ifPresent() on Optional
 * object, then only we are printing it.
 * 
 * We can also use "maxSalaryEmployee.get()" to print data in optional object.
 * 
 * Drawback
 * 
 * If there are multiple employees with same highest salary, only one employee
 * details will be printed
 */