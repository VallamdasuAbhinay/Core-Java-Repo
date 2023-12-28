package abhinay.thread.programs;

import java.util.Set;

class SriThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class Displaying_All_Threads_Status {

	public static void main(String[] args) {
		SriThread threadObj = new SriThread();

		for (int i = 0; i < 5; i++) {
			Thread inst = new Thread(threadObj);
			inst.setName("SriThread-" + i);// setting the custom name for the thread
			inst.start();// starting the thread, this will invoke overridden run method
		}

		Set<Thread> threadsSet = Thread.getAllStackTraces().keySet();
		for (Thread obj : threadsSet) {
			System.out.println("Status of the thread " + obj.getName() + " is : " + obj.getState());
		}
	}
	/*
	 * The status of a thread can be retrieved by using getState() method of the
	 * Thread class object.
	 * 
	 * 
	 */}
