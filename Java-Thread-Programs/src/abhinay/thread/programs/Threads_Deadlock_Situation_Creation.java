package abhinay.thread.programs;

public class Threads_Deadlock_Situation_Creation {

	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Old Way using anonymous class");
			}
			
		});
		
		Thread thread1 = new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Thread-1 acquired lock1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("Thread-1 acquired lock2");
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (lock2) {
				System.out.println("Thread-2 acquired lock2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("Thread-2 acquired lock1");
				}
			}
		});
		thread.start();
		// starting both the threads
		thread1.start();
		thread2.start();
	}

	/*
	 * In this example, we have two threads, thread1 and thread2, each trying to
	 * acquire two locks: lock1 and lock2.
	 * 
	 * Thread1 first acquires lock1, then waits for 1000 milliseconds before trying
	 * to acquire lock2. At the same time, thread2 acquires lock2 and waits for 1000
	 * milliseconds before trying to acquire lock1. Since both threads are waiting
	 * for each other to release the locks they are holding, a deadlock situation is
	 * created, and the program will be stuck forever, unable to proceed.
	 */

}
