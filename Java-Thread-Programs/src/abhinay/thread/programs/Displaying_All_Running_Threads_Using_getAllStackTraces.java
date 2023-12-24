package abhinay.thread.programs;

import java.util.Set;

//Java Program to display all the running threads using
//getAllStackTraces() method
class AbhinayCustThread extends Thread {
	@Override
	public void run() {
		System.out.println("Executing Overridden Run Method");
	}
}


public class Displaying_All_Running_Threads_Using_getAllStackTraces {

	public static void main(String[] args) {
		// creating the thread objects
		AbhinayCustThread t1 = new AbhinayCustThread();
		AbhinayCustThread t2 = new AbhinayCustThread();
		t1.start(); // starting the thread t1 --> this will invoke overridden run()
		t2.start(); // starting the thread t2 --> this will invoke overridden run()

		/* getAllStackTraces()
		 * Returns a map of stack traces for all live threads. The map keys are threads
		 * and each map value is an array of StackTraceElement that represents the stack
		 * dump of the corresponding Thread.
		 * 
		 * keySet()
		 * Returns a Set view of the keys contained in this map.
		 */
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();

		System.out.println("Count of Active Threads: "+ threadSet.size());
		System.out.println("Active threads are:");
		// iterating over the for loop to get the names of
		// all the active (or running) threads.
		for (Thread threadObj : threadSet) {
			System.out.println(threadObj.getName());
		}
	}

}
