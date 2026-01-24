package java8_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Two_Sum_Solution_Using_Java8 {

	/*
	 * Two Sum Problem Statement:
	 * 
	 * Given an array of integers and an integer target, return indices of the two
	 * numbers such that they add up to the target.
	 * 
	 */

	public static void main(String[] args) {
		int[] numbersArray = { 50, 40, 60, 50, 100, 50 };
		int targetSum = 100;
		calculateIndices(numbersArray, targetSum);
	}

	public static void calculateIndices(int[] brr, int targetSum) {
		Map<Integer, Integer> map_obj = new HashMap<>();
		List<Integer[]> integerArrayList = new ArrayList<>();
		IntStream.range(0, brr.length).forEach(x -> {
			int nextNumber = targetSum - brr[x];
			if (map_obj.containsKey(nextNumber)) {
				integerArrayList.add(new Integer[] { map_obj.get(nextNumber), x });
			}
			map_obj.put(brr[x], x);
		});
		integerArrayList.stream().forEach(x -> {
			System.out.println(Arrays.toString(x));
		});
	}

}
