package Java8_Lambda_Expression_Examples;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Each_Character_Frequency_In_Sentence_Using_Lambda_Exp {

	public static void main(String[] args) {
		//counting the frequency of each character
		Map<Character, Long> frequencyMap = new HashMap<Character, Long>();
		System.out.println("Starting Each_Character_Frequency_In_Sentence_Using_Lambda_Exp....");
		String sentence = "cat name is pinky. That cat is sitting on the house roof";
		frequencyMap = sentence.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(frequencyMap);
		//displaying the frequency of each character
		frequencyMap.forEach((k,v) -> System.out.print("The Character " + k + " appeared " + v + " times\n"));
	}

}
