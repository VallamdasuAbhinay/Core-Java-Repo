package abhinay.thread.programs;

public class ThreadCreationByExtendingThreadClass {

	public static void main(String[] args) {
		System.out.println("Inside main.......");
		MyCustomThread customThreadObj = new MyCustomThread();
		customThreadObj.start();
	}

}

//One way to create the thread is by extending the Thread class
//Once we extend the Thread class, we have to Override the implementation of the run()
//Specify the instructions within this Overridden run(), that are going to be executed by the thread
//Once we call the start() on the object of the class (that extends the Thread class), thread execution will begin and JVM will call the run() of Thread
class MyCustomThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Executing.....Iteration# " + i + " on " + Thread.currentThread().getName());
		}

	}

}
