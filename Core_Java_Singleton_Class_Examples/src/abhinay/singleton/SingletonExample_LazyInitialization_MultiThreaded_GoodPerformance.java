package abhinay.singleton;

public class SingletonExample_LazyInitialization_MultiThreaded_GoodPerformance {
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
	 * creates the instance in the global access method.
	 * 
	 * A simple way to create a thread-safe singleton class is to make the global
	 * access method synchronized so that only one thread can execute this method at
	 * a time.
	 * 
	 * This works fine in case of multi-threaded environment, but it reduces the
	 * performance because of the cost associated with the synchronized method. To
	 * avoid this extra overhead every time, double-checked locking principle is
	 * used. In this approach, the synchronized block is used inside the if
	 * condition with an additional check to ensure that only one instance of a
	 * singleton class is created.,
	 */

	public static void main(String[] args) {
		SingleTonHelperLazyMultiThreadedDoubleChecking instance_1 = SingleTonHelperLazyMultiThreadedDoubleChecking
				.getInstance();
		System.out.println("Hashcode of instance_1 is: " + instance_1.hashCode());
		SingleTonHelperLazyMultiThreadedDoubleChecking instance_2 = SingleTonHelperLazyMultiThreadedDoubleChecking
				.getInstance();
		System.out.println("Hashcode of instance_2 is: " + instance_2.hashCode());
		SingleTonHelperLazyMultiThreadedDoubleChecking instance_3 = SingleTonHelperLazyMultiThreadedDoubleChecking
				.getInstance();
		System.out.println("Hashcode of instance_3 is: " + instance_3.hashCode());
	}
}

class SingleTonHelperLazyMultiThreadedDoubleChecking {

	private static SingleTonHelperLazyMultiThreadedDoubleChecking singleton_instance;

	private SingleTonHelperLazyMultiThreadedDoubleChecking() {
		System.out.println("SingleTonHelperLazyMultiThreadedDoubleChecking Constructor Called....");
	}

	public static SingleTonHelperLazyMultiThreadedDoubleChecking getInstance() {
		if (singleton_instance == null) {
			synchronized (SingleTonHelperLazyMultiThreadedDoubleChecking.class) {
				if (singleton_instance == null) {
					singleton_instance = new SingleTonHelperLazyMultiThreadedDoubleChecking();
				}
			}
		}
		return singleton_instance;
	}
}
