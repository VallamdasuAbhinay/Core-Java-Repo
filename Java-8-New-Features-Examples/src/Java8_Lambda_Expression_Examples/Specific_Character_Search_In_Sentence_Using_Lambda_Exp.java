package Java8_Lambda_Expression_Examples;

public class Specific_Character_Search_In_Sentence_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Specific_Character_Search_In_Sentence_Using_Lambda_Exp....");
		String sentence = "cat name is pinky. That cat is sitting on the house roof";
		char keychar = 't';
		Long matchCount = sentence.chars().filter(c -> c == keychar).count();
		System.out.println("The keychar provided to search is ----> " + keychar);
		System.out.println("The provided keychar " + keychar + " appeared " + matchCount +" times in the sentence --> " + sentence);
	}

}
