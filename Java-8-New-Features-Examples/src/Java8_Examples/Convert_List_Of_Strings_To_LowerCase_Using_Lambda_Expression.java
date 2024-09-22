package Java8_Examples;

import java.util.Arrays;
import java.util.List;

public class Convert_List_Of_Strings_To_LowerCase_Using_Lambda_Expression {

	public static void main(String[] args) {
		System.out.println("Starting Convert_List_Of_Strings_To_LowerCase_Using_Lambda_Expression....");
		List<String> employeesNamesList = Arrays.asList("Shiva", "Abhinay", "Sri", "Vastav");
		System.out.println("Initial List of Employees Names are....\n"+employeesNamesList);
		// Convert strings to lowercase using lambda expression
		employeesNamesList.replaceAll(employeeName -> employeeName.toLowerCase());
		System.out.println("Employees Names in Lower Case are....\n"+employeesNamesList);
	}

}
/*
 * Explanation:
 * 
 * In the above exercise, we start by creating a list of strings in employeesNamesList.
 * 
 * The replaceAll() method applies a lambda expression that converts each string
 * in the list to lowercase using the toLowerCase() method. 
 * This lambda expression is (str -> str.toLowerCase()).
 */