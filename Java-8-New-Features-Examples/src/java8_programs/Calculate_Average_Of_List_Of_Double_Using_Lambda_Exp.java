package java8_programs;

import java.util.Arrays;
import java.util.List;

public class Calculate_Average_Of_List_Of_Double_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Calculate_Average_Of_List_Of_Double_Using_Lambda_Exp....");
		List<Double> marksList = Arrays.asList(89.2, 39.5, 59.4, 99.1, 88.4, 90.4);
		System.out.println("Initial list of marks are....\n"+marksList);
		Double average = marksList.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		System.out.println("The average of student marks is "+average);
	}

}
/*
 * Explanation:
 * 
 * To calculate the average of the list, we use the stream() method on the
 * marksList to convert it into a stream. Then, we use the mapToDouble() method
 * to convert each Double object to its corresponding primitive double value.
 * This step is necessary because the average() method operates on primitive
 * double values.
 * 
 * Next, we call the average() method to calculate the average of the stream. If
 * the stream is empty, we use orElse(0.0) to provide a default value of 0.0.
 */