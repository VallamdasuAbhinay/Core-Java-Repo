package abhinay.thread.programs;

public class Thread_Yield_Example_Using_Two_Child_Threads implements Runnable {

	public static void main(String[] args) {
		Thread_Yield_Example_Using_Two_Child_Threads obj1 = new Thread_Yield_Example_Using_Two_Child_Threads();
		Thread t1 = new Thread(obj1, "first-child-thread");

		Thread_Yield_Example_Using_Two_Child_Threads obj2 = new Thread_Yield_Example_Using_Two_Child_Threads();
		Thread t2 = new Thread(obj2, "second-child-thread");

		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread() + " Started");
		// calling yield() method on current thread to move it
		// back to ready state from the running status
		Thread.yield();
		System.out.println("Thread " + Thread.currentThread() + " Ended");
	}

}

//Output:
//Thread Thread[first-child-thread,5,main] Started
//Thread Thread[second-child-thread,5,main] Started
//Thread Thread[first-child-thread,5,main] Ended
//Thread Thread[second-child-thread,5,main] Ended

//Explanation:
//
//Here, we create two threads, t1 and t2.
//As we can observe from the output, thread t1 start executing first. 
//When the yield() method is invoked, thread t1 goes to the Ready state from the Running state, 
//and thread t2 starts executing.
//Then t2 goes in Ready state because yield() is called on it.
//Now, thread t1 resumes its execution and terminates. 
//The execution of the second thread follows this because it was in a Ready state.
