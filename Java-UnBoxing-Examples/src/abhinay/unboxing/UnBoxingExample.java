package abhinay.unboxing;

public class UnBoxingExample {
	/*
	 * Java introduced the feature called "UnBoxing" starting from JDK 5
	 * 
	 * UnBoxing refers to the conversion of the object of wrapper class to its
	 * corresponding primitive value For example, converting Integer to int,
	 * Character to char etc.
	 *
	 * Main advantage of the feature "UnBoxing" is it helps the developers to make
	 * use of the primitive types and wrapper class objects interchangeably without
	 * the need to perform any explicit type-casting.
	 * 
	 * Java Compiler will automatically apply the UnBoxing in the following
	 * scenarios::
	 * 
	 * 1--> When an object of wrapper class is passed as an argument to a method
	 * that expects value of the corresponding primitive type 2--> When an object of
	 * wrapper class is assigned to a variable of the corresponding primitive type
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Sum...." + sum(Integer.valueOf(11), Integer.valueOf(9)));// .............1

		Integer i = new Integer(10);
		int i1 = i;
		System.out.println("Primitive int value...." + i1);// .............2
	}

	public static int sum(int num1, int num2) {
		return (num1 + num2);
	}

}
