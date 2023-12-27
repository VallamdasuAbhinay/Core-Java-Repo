package abhinay.singleton;

public class SingletonExample_EagerInitialization {
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
	 * In eager initialization, the instance of the singleton class is created at
	 * the time of class loading. The drawback to eager initialization is that the
	 * method is created even though the client application might not be using it
	 */

	public static void main(String[] args) {
		SingleTonHelperClass instance_1 = SingleTonHelperClass.getInstance();
		System.out.println("Hashcode of instance_1 is: " + instance_1.hashCode());
		SingleTonHelperClass instance_2 = SingleTonHelperClass.getInstance();
		System.out.println("Hashcode of instance_2 is: " + instance_2.hashCode());
		SingleTonHelperClass instance_3 = SingleTonHelperClass.getInstance();
		System.out.println("Hashcode of instance_3 is: " + instance_3.hashCode());
	}
}

class SingleTonHelperClass {

	private static SingleTonHelperClass singleton_instance = new SingleTonHelperClass();

	private SingleTonHelperClass() {
		System.out.println("SingleTonHelperClass Constructor Called....");
	}

	public static SingleTonHelperClass getInstance() {
		return singleton_instance;
	}
}
