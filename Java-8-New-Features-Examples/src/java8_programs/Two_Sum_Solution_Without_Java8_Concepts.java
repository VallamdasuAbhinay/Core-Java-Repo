package java8_programs;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_Solution_Without_Java8_Concepts {

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
		for (int i = 0; i < brr.length; i++) {
			int next_num = targetSum - brr[i];
			if (map_obj.containsKey(next_num)) {
				System.out.println(
						"The Array Indices That Sums Up To Given Target are : " + map_obj.get(next_num) + "----" + i);
			}
			map_obj.put(brr[i], i);
		}

	}

}
