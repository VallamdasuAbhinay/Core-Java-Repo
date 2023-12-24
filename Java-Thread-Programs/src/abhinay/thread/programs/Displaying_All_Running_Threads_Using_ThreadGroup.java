package abhinay.thread.programs;

//Java Program to display all the running threads using
//ThreadGroup object
class AbhinayCustomThread extends Thread {
	@Override
	public void run() {
		System.out.println("Executing Overridden Run Method");
	}
}

public class Displaying_All_Running_Threads_Using_ThreadGroup {

	public static void main(String[] args) {
		// creating the thread objects
		AbhinayCustomThread t1 = new AbhinayCustomThread();
		AbhinayCustomThread t2 = new AbhinayCustomThread();
		t1.start(); // starting the thread t1 --> this will invoke overridden run()
		t2.start(); // starting the thread t2 --> this will invoke overridden run()

		// returns the thread group to which the current thread belongs to
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();

		// getting the count of total active threads in the thread group
		int threadCount = threadGroup.activeCount();

		Thread threadList[] = new Thread[threadCount];
		// enumerating over the thread list
		// all the active threads which are part of this thread group are copied into
		// the passed array called threadList
		threadGroup.enumerate(threadList);
		System.out.println("Count of Active Threads: "+threadList.length);
		System.out.println("Active threads are:");
		// iterating over the for loop to get the names of
		// all the active (or running) threads.
		for (int i = 0; i < threadCount; i++) {
			System.out.println(threadList[i].getName());
		}
	}
}

/*
 * Java provides us a way to group multiple threads in a single object. In Java,
 * a group of threads ie thread groups is being implemented by ThreadGroup
 * class, so here we will be using a ThreadGroup object to group all the threads
 * currently running. After this, we will be using the activeCount() method of
 * ThreadGroup to get the number of active threads, then we will use the
 * enumerate(Thread[] list) method of the ThreadGroup which will copy the
 * currently active threads in an array, and we will loop over the array to get
 * the names of all the active threads.
 */