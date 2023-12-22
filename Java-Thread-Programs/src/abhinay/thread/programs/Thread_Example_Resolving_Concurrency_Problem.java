package abhinay.thread.programs;

public class Thread_Example_Resolving_Concurrency_Problem implements Runnable {

	public static int amount = 0;

	public static void main(String[] args) {
		Thread_Example_Resolving_Concurrency_Problem obj = new Thread_Example_Resolving_Concurrency_Problem();
		Thread threadObj = new Thread(obj);
		threadObj.start();
		// Wait for the thread to finish
		while (threadObj.isAlive()) {
			System.out.println("Waiting...");
		}
		System.out.println("Iteration#1 Value of amount variable...." + amount);
		amount++;
		System.out.println("Iteration#2 Value of amount variable...." + amount);
	}

	@Override
	public void run() {
		amount++;
	}

}

/*
 * To avoid concurrency problems, it is best to share as few attributes between
 * threads as possible. If attributes need to be shared, one possible solution
 * is to use the isAlive() method of the thread to check whether the thread has
 * finished running before using any attributes that the thread can change.
 */