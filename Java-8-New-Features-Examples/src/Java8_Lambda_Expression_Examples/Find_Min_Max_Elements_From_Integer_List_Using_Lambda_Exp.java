package Java8_Lambda_Expression_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_Min_Max_Elements_From_Integer_List_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Find_Min_Max_Elements_From_Integer_List_Using_Lambda_Exp....");
		List<Integer> numsList = Arrays.asList(200, -40, 100, 69, 400);
		System.out.println("Initial  Elements in the list are....\n"+numsList);
		Optional<Integer> minElement = numsList.stream().min((x,y) -> x.compareTo(y));
		System.out.println("Minimum Element in the list is "+minElement.orElse(null));
		Optional<Integer> maxElement = numsList.stream().max((x,y) -> x.compareTo(y));
		System.out.println("Maximum Element in the list is "+maxElement.orElse(null));
	}

}
/*
 * Using Arrays.asList(....) we created list of integers called numsList.
 * 
 * To find minimum value, we used stream() on numsList to convert it into
 * stream. Then, we called min() on the stream() and provided lambda expression
 * of (x,y)->x.compareTo(y) as a comparator. This expression compares 2 integers
 * x & y using compareTo() method. This method returns a negative, zero or
 * positive values depending on the comparison result.
 * 
 * min() returns Optional object that may contain minimum value if it exists or
 * an empty Optional if stream is empty.
 * 
 * To find maximum value, we used stream() on numsList to convert it into
 * stream. Then, we called max() on the stream() and provided lambda expression
 * of (x,y)->x.compareTo(y) as a comparator. This expression compares 2 integers
 * x & y using compareTo() method. This method returns a negative, zero or
 * positive values depending on the comparison result.
 * 
 * max() returns Optional object that may contain maximum value if it exists or
 * an empty Optional if stream is empty.
 * 
 * Finally, we used orElse(null) on Optional objects to retrieve min & max
 * values. If optional objects are empty, it displays null.
 * 
 */
