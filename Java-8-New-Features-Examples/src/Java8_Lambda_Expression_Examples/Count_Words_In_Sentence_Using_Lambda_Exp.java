package Java8_Lambda_Expression_Examples;

public class Count_Words_In_Sentence_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Count_Words_In_Sentence_Using_Lambda_Exp....");
		AbhinayCountWords count_words = (str) -> (str.split("\\s+").length);
		String sentence_1 = "Hello World";
		String sentence_2 = "Lenovo World in laptop";
		System.out.println(
				"Number of words in the sentence " + sentence_1 + " are " + count_words.countWords(sentence_1));
		System.out.println(
				"Number of words in the sentence " + sentence_2 + " are " + count_words.countWords(sentence_2));
	}

}

interface AbhinayCountWords {
	public int countWords(String str);
}
/*
 * Explanation
 * 
 * count_words variable is assigned a lambda expression that splits the input
 * string by whitespace (\\s+) regular expression and counts number of resulting
 * substrings using length method. This lamda expression provides the
 * implementation for the countWords method in interface AbhinayCountWords
 */
