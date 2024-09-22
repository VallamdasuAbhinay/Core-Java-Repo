package Java8_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_Using_Collectors_Joining_Java8_StreamAPI {

	public static void main(String[] args) {
		List<String> fruitsList = Arrays.asList("Apple", "Banana", "Custard Apple", "Dragon Fruit");

		System.out.println("Printing fruits list before applying the joining function");
		fruitsList.stream().forEach(System.out::println);

		System.out.println(
				"Printing fruits list after applying the joining function, all fruit names are appended without any space/delimiter between them");
		String finalFruitsName = fruitsList.stream().collect(Collectors.joining());
		System.out.println(finalFruitsName);

		System.out.println(
				"Printing fruits list after applying the joining function, all fruit names are appended with ',' as delimiter between them");
		String finalFruitsName2 = fruitsList.stream().collect(Collectors.joining(","));
		System.out.println(finalFruitsName2);

		System.out.println("Printing fruits list after applying the joining function, "
				+ "all fruit names are appended with ',' as delimiter between them "
				+ "provided [ which gets appened at the beginning of the concatenated string"
				+ "provided ] which gets appened at the end of the concatenated string");
		String finalFruitsName3 = fruitsList.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(finalFruitsName3);
	}

}
