package Java8_Lambda_Expression_Examples;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Print_Unique_Elements_In_List_Using_Stream_API {

	public static void main(String[] args) {
		System.out.println("Starting Print_Unique_Elements_In_List_Using_Stream_API....");
		Integer[] marksArray = { 100, 30, 100, 40, 10, 4, 4 };
		System.out.println("Initial elements in the array are....");
		Arrays.asList(marksArray).stream().forEach(System.out::println);
		System.out.println("Unique elements (appeared only once) in the list are....");

		Arrays.stream(marksArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(f -> f.getValue() == 1).forEach(p -> System.out.println(p.getKey()));
		
	}

}
