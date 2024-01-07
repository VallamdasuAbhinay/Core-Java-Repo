package Java8_Lambda_Expression_Examples;

import java.util.Arrays;

import java.util.List;

public class Calculate_Average_length_Of_Strings_In_List_Using_Lambda_Exp {
	public static void main(String[] args) {

		System.out.println(
				"Starting Calculate_Average_Length_Of_Strings_In_List_ e_Average_Length_Of_Strings_In_List_Using_Lambda_Exp....");
		List<String> animalslist = Arrays.asList("Elephant", "Rabbit", "Tiger", "Cat", "Dog", "Fox");
		System.out.println("The initial list of the animals are....\n" + animalslist);

		double avg_length = animalslist.stream().mapToInt(String::length).average().orElse(0);
		System.out.println("The average length of all the strings (animals) is " + avg_length);

	}

}

//Steps:
//The stream() method is used on the animalslist to create a stream of strings.
//The mapToInt method converts each string to its length by using a method reference String:: length.
//The average() calculates the average length of the strings in the stream.
//The orElse method is used to provide a default value of 0 if the provided list is empty.
