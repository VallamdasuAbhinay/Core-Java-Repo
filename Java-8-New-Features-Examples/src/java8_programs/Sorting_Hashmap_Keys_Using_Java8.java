package java8_programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sorting_Hashmap_Keys_Using_Java8 {

	public static void main(String[] args) {
		Map<Integer, String> studentsMap = new HashMap<>();
		studentsMap.put(200, "Nirved");
		studentsMap.put(100, "Vallamdasu");
		studentsMap.put(900, "Srivastav");
		studentsMap.put(600, "Abhinay");
		studentsMap.put(400, "Srithik");
		System.out.println("Printing the contents of map before sorting");
		studentsMap.entrySet().stream()
				.forEach(entry -> System.out.println(entry.getKey() + "--" + entry.getValue() + "\n"));

		System.out.println("Printing the contents of map after sorting based on the key (ascending order)");
		studentsMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(entry -> System.out.println(entry.getKey() + "--" + entry.getValue() + "\n"));
		
		System.out.println("Printing the contents of map after sorting based on the key (descending order)");
		studentsMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.forEach(entry -> System.out.println(entry.getKey() + "--" + entry.getValue() + "\n"));
	}

}
