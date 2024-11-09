package Java8_Examples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sorting_Hashmap_Values_Using_Java8 {

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

		System.out.println("Printing the contents of map after sorting based on the value (ascending order)");
		studentsMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(entry -> System.out.println(entry.getKey() + "--" + entry.getValue() + "\n"));
		
		System.out.println("Printing the contents of map after sorting based on the value (descending order)");
		studentsMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.forEach(entry -> System.out.println(entry.getKey() + "--" + entry.getValue() + "\n"));
	}

}
