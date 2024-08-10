package Java8_Lambda_Expression_Examples;

import java.util.Arrays;

public class Specific_Word_Count_In_Sentence_Using_Lambda_Exp {

	public static void main(String[] args) {
		Long matchCount = 0l;
		System.out.println("Starting Specific_Word_Count_In_Sentence_Using_Lambda_Exp....");
		String sentence = "cat name is pinky. That cat is sitting on the house roof";
		String keyword = "caat";
		matchCount = Arrays.asList(sentence.split("\\s+")).stream().filter(str -> str.equals(keyword)).count();
		System.out.println("The keyword provided to search is ----> " + keyword);
		System.out.println("The provided keyword " + keyword + " appeared " + matchCount + " times in the sentence --> "
				+ sentence);
	}

}
