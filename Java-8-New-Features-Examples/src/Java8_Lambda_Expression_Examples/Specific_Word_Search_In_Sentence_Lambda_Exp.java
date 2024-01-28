package Java8_Lambda_Expression_Examples;

import java.util.Arrays;

public class Specific_Word_Search_In_Sentence_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Specific_Word_Search_In_Sentence_Lambda_Exp....");
		String sentence_1 = "that cat is on the house roof";
		String keyword = "cat";
		Long matchCount = Arrays.asList(sentence_1.split("\\s+")).stream().filter(str -> str.equals(keyword)).count();
		if (matchCount != 0) {
			System.out.println("The sentence " + sentence_1 + " contains the keyword " + keyword);
		} else {
			System.out.println("The sentence " + sentence_1 + " does not contains the keyword " + keyword);
		}
	}

}
//Explanation:
//sentence is splitted based on white space and those individual strings are supplied as input for Arrays.asList(..) method.
//stream() is applied on Arrays.asList()
//filter() is applied on stream() to check if string matches the provided keyword and applied count() at the end
//This count() will provide the number of occurrences of matched keyword in given sentence.