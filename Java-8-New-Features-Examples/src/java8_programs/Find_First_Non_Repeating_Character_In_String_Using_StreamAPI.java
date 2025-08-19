package java8_programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class First_Non_Repeating_Character_In_String_Using_Java8 {

	public static void main(String[] args) {
		 String str = "aeroaero"; // Output :: First Non Repeating Character Not Found
		 String str2 = "aeroplane"; // Output :: r
		 Arrays.stream(str.trim().split(""))
		 	.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		 	.entrySet()
		 	.stream()
		 	.filter(f -> f.getValue() == 1)
		 	.map(x -> x.getKey())
		 	.findFirst()
		 	.ifPresentOrElse(System.out::println, () -> {
		 		System.out.println("First Non Repeating Character Not Found");
		 	});
	}
	
	/* Explanation 
	 * 
	 * Here, LinkedHashMap is used, as we need to follow the order strictly.
	 * 
	 * Here, ifPresentOrElse takes 2 arguments.
	 * 
	 * If the value is present, it prints that value.
	 * If the value is not present, it executes the provided Runnable function.
	 * 
	 * */
}
