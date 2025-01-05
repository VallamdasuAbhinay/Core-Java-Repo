package abhinay.thread.programs;

public class Print_Numbers_Alphabets_On_Separate_Threads_Runnable {

	private static boolean printNumber = true;
	private static final Object lock = new Object();

	public static void main(String[] args) {
		Runnable numbersRunnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 26; i++) {
					synchronized (lock) {// acquiring the lock on the object
						if (!printNumber) {// if this condition is true, numbersThread will wait
							try {
								lock.wait();// thread will wait until the invocation of notify()
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.print(i + " ");
						printNumber = false;
						lock.notify();// notifies the thread which was waiting on the same object
					}
				}
			}

		};

		Runnable alphabetsRunnable = new Runnable() {

			@Override
			public void run() {
				for (char ch = 'A'; ch <= 'Z'; ch++) {
					synchronized (lock) {// acquiring the lock on the object
						if (printNumber) {// if this condition is true, alphabetsThread will wait
							try {
								lock.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.print(ch + " ");
						printNumber = true;
						lock.notify();// notifies the thread which was waiting on the same object
					}
				}
			}

		};

		Thread numbersThread = new Thread(numbersRunnable);
		Thread alphabetsThread = new Thread(alphabetsRunnable);
		numbersThread.start();
		alphabetsThread.start();

		try {
			// below 2 statements will ensure that the main thread will not gets terminated
			// until
			// and unless the completion of execution of numbersThread and alphabetsThread
			numbersThread.join();
			alphabetsThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
