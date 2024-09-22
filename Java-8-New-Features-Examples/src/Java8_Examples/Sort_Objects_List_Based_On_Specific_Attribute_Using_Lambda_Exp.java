package Java8_Examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort_Objects_List_Based_On_Specific_Attribute_Using_Lambda_Exp {

	public static void main(String[] args) {

		System.out.println("Starting Sort_Objects_List_Based_On_Specific_Attribute_Using_Lambda_Exp....");

		List<Employee> employees_list = new ArrayList<Employee>();

		employees_list.add(new Employee("Abhinay", "Hyderabad", 4114));
		employees_list.add(new Employee("Sri", "Chennai", 2005));
		employees_list.add(new Employee("Vastav", "Bangalore", 3001));
		employees_list.add(new Employee("Vallamdasu", "Delhi", 1004));
		System.out.println("Initial elements in the employees list are...."); 
		// using stream on employees list to print each and every object
		employees_list.stream().forEach(System.out::println);
		// sorting the employee objects by applying emp_id as the comparing attribute 
		employees_list.sort(Comparator.comparing (Employee::getEmp_id));
		System.out.println("Employees list after sorting based on the id field are....");
		employees_list.stream().forEach(System.out::println);
	}
}
/*
 * By using the lambda expression and the sort method, the employees_list is
 * sorted by id. The lambda expression Comparator.comparing
 * (Employee::getEmp_id) * specifies the attribute to compare, which is the
 * employee's id in this case.
 */