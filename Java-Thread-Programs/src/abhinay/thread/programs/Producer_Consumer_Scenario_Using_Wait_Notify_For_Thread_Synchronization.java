package abhinay.thread.programs;

import java.util.LinkedList;
import java.util.Queue;

public class Producer_Consumer_Scenario_Using_Wait_Notify_For_Thread_Synchronization {

	private static final int BUFFER_SIZE = 4;
	private static final Queue<Integer> buffer = new LinkedList<>();

	public static void main(String[] args) {
		System.out.println("Starting Producer_Consumer_Scenario_Using_Wait_Notify_For_Thread_Synchronization....");
		Thread producerThread = new Thread(new Producer());
		Thread consumerThread = new Thread(new Consumer());
		producerThread.start();
		consumerThread.start();
	}

	static class Producer implements Runnable {
		@Override
		public void run() {
			int value = 0;
			while (true) {
				synchronized (buffer) {
					// Wait if the buffer is full
					while (buffer.size() == BUFFER_SIZE) {
						try {
							buffer.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Producer Produced :: " + value);
					buffer.add(value++);
					// Notify the consumer that an item is produced
					buffer.notify();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	static class Consumer implements Runnable {
		@Override
		public void run() {
			while (true) {
				synchronized (buffer) {
					// Wait if the buffer is empty
					while (buffer.isEmpty()) {
						try {
							buffer.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					int value = buffer.poll();
					System.out.println("Consumer Consumed :: " + value);
					// Notify the producer that an item is Consumed
					buffer.notify();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
/*
 * Explanation
 * 
 * Producer class implements Runnable interface and represents producer thread.
 * It continuously produces items by adding values to shared buffer. When buffer
 * is full, producer waits until consumer consumes the item and notifies it.
 * 
 * Consumer class implements Runnable interface and represents consumer thread.
 * It continuously consumes items by removing values from shared buffer. When
 * buffer is empty, consumer uses wait() to wait until new item is produced by
 * producer. It notifies producer once it consumes an item.
 * 
 * In main method, created instances of Producer and Consumer as separate
 * threads and started them concurrently.
 * 
 * 
 */
