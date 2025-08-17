package java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Print_Duplicate_Elements_In_List_Using_Stream_API {

	public static void main(String[] args) {
		System.out.println("Starting Print_Duplicate_Elements_In_List_Using_Stream_API....");
		Integer[] marksArray = { 100, 30, 100, 40, 10, 4, 4 };
		System.out.println("Initial elements in the array are....");
		Arrays.asList(marksArray).stream().forEach(System.out::println);
		System.out.println("Duplicate elements (appeared more than once) in the list are....");
		// printing the duplicate elements in the list
		Arrays.stream(marksArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(f -> f.getValue() > 1).forEach(p -> System.out.println(p.getKey()));
		
		// collecting all the duplicate elements into a list and printing them
		List<Integer> duplicateElementsList = Arrays.stream(marksArray)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(f -> f.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateElementsList);

	}

}
