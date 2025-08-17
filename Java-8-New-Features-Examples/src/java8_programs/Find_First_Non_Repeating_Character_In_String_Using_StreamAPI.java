package java8_programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_First_Non_Repeating_Character_In_String_Using_StreamAPI {

	public static void main(String[] args) {
		String sentence = "LenovoLaptop";

		String firstNonRepeatingChar = Arrays.stream(sentence.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1).findFirst().get().getKey();

		System.out
				.println("First Non-repeating character in the string " + sentence + " is \n" + firstNonRepeatingChar);
	}

}
