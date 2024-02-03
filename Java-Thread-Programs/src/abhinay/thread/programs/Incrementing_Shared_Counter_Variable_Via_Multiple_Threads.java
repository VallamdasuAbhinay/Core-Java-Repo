package abhinay.thread.programs;

public class Incrementing_Shared_Counter_Variable_Via_Multiple_Threads {

	public static void main(String[] args) {
		System.out.println("Starting Incrementing_Shared_Counter_Variable_Via_Multiple_Threads....");
		int num_of_threads = 6;
		int count_increment_per_thread = 10;
		IncrementCounter[] threadArray = new IncrementCounter[num_of_threads];
		Counter counterInstance = new Counter();
		// create and start multiple threads
		for (int i = 0; i < num_of_threads; i++) {
			threadArray[i] = new IncrementCounter(counterInstance, count_increment_per_thread);
			threadArray[i].start();
		}
		// wait for all threads to finish
		try {
			for (IncrementCounter thread : threadArray) {
				thread.join();
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		// printing final count
		System.out.println("Final Count :: " + counterInstance.getCount());
	}

}
/*
 * Explanation
 * 
 * Counter class that represents shared counter variable. It has a synchronized
 * method incrementCount(), that increments counter variable value by 1.
 * 
 * IncrementCounter class extends Thread class. Each IncrementCounter instance
 * increments the shared counter by specific number of increments.
 * 
 * In this Main class, we created Counter class object, specified threads count
 * and count increments per thread and created an array of IncrementCounter.
 * 
 * We then iterate over array, created and started multiple threads. After
 * starting all threads, we use join() to wait for all threads to finish their
 * execution
 * 
 * Finally we printed shared counter value.
 */
