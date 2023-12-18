package abhinay.autoboxing;

import java.util.ArrayList;

public class AutoBoxingExample {
	/*
	 * Java introduced the feature called "Auto Boxing" starting from JDK 5
	 * 
	 * AutoBoxing refers to the automatic conversion of the primitive type value
	 * into its corresponding wrapper class object For example, converting int to
	 * Integer, char to Character etc.
	 *
	 * Main advantage of the feature "Auto Boxing" is it helps the developers to
	 * make use of the primitive types and wrapper class objects interchangeably
	 * without the need to perform any explicit type-casting.
	 * 
	 * Java Compiler will automatically apply the Auto Boxing in the following
	 * scenarios::
	 * 
	 * 1--> When a primitive value is passed as an argument to a method that expects
	 * an object of the corresponding wrapper class 2--> When a primitive value is
	 * assigned to a variable of the corresponding wrapper class 3--> When a
	 * primitive value is added to a Collection, whose type is equal to the
	 * corresponding wrapper class of primitive type
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Sum...." + sum(9, 11));// .............1

		Integer i = 44;
		System.out.println("Integer Value...." + i);// .............2

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);// .............3
		arrayList.add(20);// .............3
		arrayList.add(30);// .............3
		arrayList.add(40);// .............3
		System.out.println("ArrayList Elements...." + arrayList);
	}

	public static int sum(Integer num1, Integer num2) {
		return (num1 + num2);
	}

}
