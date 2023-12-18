package abhinay.overloading.examples;

public class MainMethodOverloadingExample {

	public static void main(String[] args) {
		System.out.println("Inside main method.............");
		MainMethodOverloadingExample.main();
	}

	// overloaded main method..
	public static void main() {
		System.out.println("Inside overloaded main method.............");
	}
}
/*
 * Apart from the fact that JVM always looks for the main method to launch the
 * program, main method is just like other methods. We can overload the main
 * method too, But JVM will never call that overloaded main method. To execute
 * that overloaded main method, we need to explicitly call it.
 */
