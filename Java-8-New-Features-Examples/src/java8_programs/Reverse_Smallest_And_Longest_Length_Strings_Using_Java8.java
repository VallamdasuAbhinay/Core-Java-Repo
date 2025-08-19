package java8_programs;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_Smallest_And_Longest_Length_Strings_Using_Java8 {
	/*
	 * This program will reverse only the smallest and also the longest length
	 * strings in a specific List of strings.
	 * 
	 * Even if we have multiple smallest length strings (or) longest length strings
	 * in the given list, all those will gets reversed and applied to the same list,
	 * instead of adding them to new list.
	 */
	public static void main(String[] args) {
		List<String> fruitsList = Arrays.asList("Banana", "Apple", "Orange", "Watermelon", "Grapes", "Lichi",
				"Strawberry");
		IntSummaryStatistics summaryStatistics = fruitsList.stream().mapToInt(String::length).summaryStatistics();
		int smallestStringLength = summaryStatistics.getMin();
		int longestStringLength = summaryStatistics.getMax();
		System.out.println("Smallest String Length :: " + smallestStringLength);
		System.out.println("Longest String Length :: " + longestStringLength);
		List<String> collect = fruitsList.stream().map(string -> {
			int wordLength = string.length();
			if (wordLength == smallestStringLength || wordLength == longestStringLength) {
				return new StringBuilder(string).reverse().toString();
			} else {
				return string;
			}
		}).collect(Collectors.toList());
		System.out.println("Final List of Strings is........." + collect);
	}

}
