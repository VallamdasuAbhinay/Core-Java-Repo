package abhinay.singleton;

public class SingletonExample_StaticBlockInitialization {
	/*
	 * A Singleton class is a class that allows only one instance of itself to be
	 * created and provides a global point of access to that instance.This is
	 * achieved by making the constructor private, so that no other instances of the
	 * class can be created, and providing a static method that returns the single
	 * instance of the class.
	 * 
	 * The Singleton pattern is commonly used in situations where a single instance
	 * of a class needs to coordinate actions across the system, such as in a
	 * logging or configuration system.It ensures that there is only one instance of
	 * the class, which can be accessed globally, preventing unnecessary duplication
	 * and ensuring consistency across the system.
	 * 
	 * To implement a singleton pattern, we have different approaches, but all of
	 * them have the following common concepts.
	 * 
	 * Private constructor to restrict instantiation of the class from other
	 * classes.
	 * 
	 * Private static variable of the same class that is the only instance of the
	 * class.
	 * 
	 * Public static method that returns the instance of the class, this is the
	 * global access point for the outer world to get the instance of the singleton
	 * class.
	 * 
	 * Static block initialization implementation is similar to eager
	 * initialization, except that instance of the class is created in the static
	 * block that provides the option for exception handling.
	 * 
	 * Both eager initialization and static block initialization create the instance
	 * even before it’s being used and that is not the best practice to use.
	 */

	public static void main(String[] args) {
		SingleTonHelper instance_1 = SingleTonHelper.getInstance();
		System.out.println("Hashcode of instance_1 is: " + instance_1.hashCode());
		SingleTonHelper instance_2 = SingleTonHelper.getInstance();
		System.out.println("Hashcode of instance_2 is: " + instance_2.hashCode());
		SingleTonHelper instance_3 = SingleTonHelper.getInstance();
		System.out.println("Hashcode of instance_3 is: " + instance_3.hashCode());
	}
}

class SingleTonHelper {

	private static SingleTonHelper singleton_instance = null;

	private SingleTonHelper() {
		System.out.println("SingleTonHelper Constructor Called....");
	}

	static {
		try {
			singleton_instance = new SingleTonHelper();
		} catch (Exception ex) {
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}

	public static SingleTonHelper getInstance() {
		return singleton_instance;
	}
}
