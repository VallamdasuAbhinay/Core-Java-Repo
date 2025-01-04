package abhinay.thread.programs;

public class ThreadCreationByImplementingRunnableInterface {

	public static void main(String[] args) {
		CustomThread customThread = new CustomThread();
		Thread thread = new Thread(customThread);
		thread.start();
		System.out.println("Thread Name....." + thread.getName());
		System.out.println("Thread Priority...." + thread.getPriority());
		System.out.println("Is Daemon Thread...." + thread.isDaemon());
	}

}

//Second way to create the thread is by implementing the Runnable interface
//Once we implement the Runnable interface, we have to Override the implementation of the run()
//Specify the instructions within this Overridden run(), that are going to be executed by the thread
//Create the object of the class that implements the Runnable interface
//and then create the object of the thread, by passing the above object in parameter.
//Once we call the start() on the object of the Thread class, thread execution will begin and JVM will call the run() of Thread

class CustomThread implements Runnable {

	@Override
	public void run() {
		for (int k = 1; k <= 5; k++) {
			System.out.println("Thread Executing.....Iteration# " + k + " on " + Thread.currentThread().getName());
		}
	}

}
