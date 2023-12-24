package abhinay.thread.programs;

//Java Program to temporarily suspend and resume the thread
class AbhinayCustomThreadClass extends Thread {
	@Override
	public void run() {
//		System.out.println("Executing Overridden Run Method");
		// Print and display the running thread
		// using currentThread() method
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	}
}

public class Thread_Example_Using_Suspend_And_Resume {

	public static void main(String[] args) throws InterruptedException {
		AbhinayCustomThreadClass obj = new AbhinayCustomThreadClass();
		obj.start();// starting the thread
		System.out.println("Thread is going to suspended state.");
		obj.suspend();
		System.out.println("Thread is going to sleep for 5 seconds.");
		Thread.sleep(9000);
		System.out.println("Thread is going to be resumed.");
		obj.resume();
	}

}
