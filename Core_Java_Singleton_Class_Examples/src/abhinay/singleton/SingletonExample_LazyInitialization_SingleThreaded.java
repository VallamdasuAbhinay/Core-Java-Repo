package abhinay.singleton;

public class SingletonExample_LazyInitialization_SingleThreaded {
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
	 * Lazy initialization method is used to implement the singleton pattern which
	 * creates the instance in the global access method. This works fine in case of
	 * single-threaded environment, but when it comes to multi-threaded systems, it
	 * can cause issues if multiple threads are inside the "if" condition at the
	 * same time. It will destroy the singleton pattern and both threads will get
	 * different instances of the singleton class.
	 */

	public static void main(String[] args) {
		SingleTonHelperLazy instance_1 = SingleTonHelperLazy.getInstance();
		System.out.println("Hashcode of instance_1 is: " + instance_1.hashCode());
		SingleTonHelperLazy instance_2 = SingleTonHelperLazy.getInstance();
		System.out.println("Hashcode of instance_2 is: " + instance_2.hashCode());
		SingleTonHelperLazy instance_3 = SingleTonHelperLazy.getInstance();
		System.out.println("Hashcode of instance_3 is: " + instance_3.hashCode());
	}
}

class SingleTonHelperLazy {

	private static SingleTonHelperLazy singleton_instance;;

	private SingleTonHelperLazy() {
		System.out.println("SingleTonHelperLazy Constructor Called....");
	}

	public static SingleTonHelperLazy getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new SingleTonHelperLazy();
		}
		return singleton_instance;
	}
}
