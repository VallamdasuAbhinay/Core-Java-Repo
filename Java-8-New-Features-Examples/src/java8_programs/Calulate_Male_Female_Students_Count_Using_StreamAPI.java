package java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calulate_Male_Female_Students_Count_Using_StreamAPI {

	public static void main(String[] args) {

		List<StudentClass> studentsList = Arrays.asList(
				new StudentClass("Abhinay", "Vastav", "Section 4", "Hyderabad", "Male"),
				new StudentClass("Archana", "Vallamdasu", "Section 2", "Hyderabad", "Female"),
				new StudentClass("Urmila", "Vallamdasu", "Section 1", "Hyderabad", "Female"),
				new StudentClass("Amarendar", "Vallamdasu", "Section 9", "Hyderabad", "Male"),
				new StudentClass("Srithik", "Vallamdasu", "Section 10", "Hyderabad", "Male"));

		Map<String, Long> resultMap = studentsList.stream()
				.collect(Collectors.groupingBy(StudentClass::getGender, Collectors.counting()));
		
		System.out.println(resultMap);

	}

}
