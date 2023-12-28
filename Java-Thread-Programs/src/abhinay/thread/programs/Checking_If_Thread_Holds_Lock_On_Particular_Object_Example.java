package abhinay.thread.programs;

class SriCustomThread implements Runnable {
	/*
	 * holdsLock() method is used to check the lock on the particular object during
	 * the execution time of the java program.
	 * 
	 * Parameters: This method takes the reference/object of the class in which we
	 * want to check whether the lock is present on the threads or not.
	 * 
	 * Return Type: This method returns boolean parameters i.e true or false.True
	 * means monitor lock available on the current object.
	 */
	@Override
	public void run() {
		System.out.println("Inside run() method");
		System.out.println("Lock status before synchronized block : " + Thread.holdsLock(this));

		synchronized (this) {
			System.out.println("Lock status inside synchronized block : " + Thread.holdsLock(this));
		}
	}

}

public class Checking_If_Thread_Holds_Lock_On_Particular_Object_Example {

	public static void main(String[] args) {
		SriCustomThread threadObj = new SriCustomThread();
		Thread inst = new Thread(threadObj);
		inst.start();// starting the thread, this will invoke overridden run method
	}

}
