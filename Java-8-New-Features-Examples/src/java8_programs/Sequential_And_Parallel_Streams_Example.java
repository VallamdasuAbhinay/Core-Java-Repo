package java8_programs;

import java.util.stream.IntStream;

public class Sequential_And_Parallel_Streams_Example {

	public static void main(String[] args) {
		/*
		 * In Java 8, Streams can operate in 2 ways as follows:
		 * 
		 * sequence (default)
		 * parallel
		 * 
		 * In case of the sequence stream, it uses the single thread for processing the elements.
		 * The elements are processed one after the another (strictly follows the order).
		 * 
		 *  Example output from sequence stream:
		 *  
		 *  Sequential Stream: main Printing 1
			Sequential Stream: main Printing 2
			Sequential Stream: main Printing 3
			Sequential Stream: main Printing 4
		 *  
		 */
		IntStream.rangeClosed(1, 5).forEach(
				p -> System.out.println("Sequential Stream: " + Thread.currentThread().getName() + " Printing " + p));
		

		/*
		 * In case of the parallel stream, it splits the stream into multiple sub-streams and processes
		 * the elements in parallel threads (using ForkJoinPool).
		 * 
		 * This will improve the performance when working with large data-sets and utilizes multi-core CPUs.
		 * 
		 * Order is not guaranteed in this parallel stream (unless we use forEachOrdered)
		 * 
		 * Example output from parallel stream:
		 * 
		 *  Parallel Stream: main Printing 3
			Parallel Stream: main Printing 4
			Parallel Stream: ForkJoinPool.commonPool-worker-1 Printing 2
			Parallel Stream: ForkJoinPool.commonPool-worker-2 Printing 1
			
			Example output from parallel stream (using forEachOrdered):
		  
		    Parallel Stream: ForkJoinPool.commonPool-worker-3 Printing 1
			Parallel Stream: ForkJoinPool.commonPool-worker-1 Printing 2
			Parallel Stream: ForkJoinPool.commonPool-worker-1 Printing 3
			Parallel Stream: ForkJoinPool.commonPool-worker-1 Printing 4

		 *  */
		
		IntStream.rangeClosed(1, 5).parallel().forEach(
				p -> System.out.println("Parallel Stream: " + Thread.currentThread().getName() + " Printing " + p));
		
		
		IntStream.rangeClosed(1, 5).parallel().forEachOrdered(
				p -> System.out.println("Parallel Stream Ordered: " + Thread.currentThread().getName() + " Printing " + p));
	}

}
