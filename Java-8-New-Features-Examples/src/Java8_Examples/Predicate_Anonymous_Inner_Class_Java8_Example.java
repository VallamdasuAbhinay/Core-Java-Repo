package Java8_Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Anonymous_Inner_Class_Java8_Example {

	public static void main(String[] args) {
		// making use of anonymous inner class for providing the implementation for the
		// test method
		// which was present in the Java8 Functional Interface "Predicate"
		Predicate<Integer> evenPredicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if (t % 2 == 0)
					return true;
				else
					return false;
			}

		};

		List<Integer> intList = Arrays.asList(10, 4, 3, 20, 7);
		System.out.println("Printing the mapped elements (even) that are sorted in ascending order");
		intList.stream().filter(evenPredicate).sorted().map(m -> m * 2)
				.forEach(System.out::println);
		System.out.println("Printing the mapped elements (even) that are sorted in descending order");
		intList.stream().filter(evenPredicate).sorted(Collections.reverseOrder()).map(m -> m * 2)
				.forEach(System.out::println);
	}

}
