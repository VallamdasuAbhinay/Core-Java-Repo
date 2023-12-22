package abhinay.thread.programs;

public class Thread_Yield_Example_Using_Two_Child_Threads_Different_Priority implements Runnable {

	public static void main(String[] args) {
		Thread_Yield_Example_Using_Two_Child_Threads_Different_Priority obj1 = new Thread_Yield_Example_Using_Two_Child_Threads_Different_Priority();
		Thread t1 = new Thread(obj1, "first-child-thread");

		Thread_Yield_Example_Using_Two_Child_Threads_Different_Priority obj2 = new Thread_Yield_Example_Using_Two_Child_Threads_Different_Priority();
		Thread t2 = new Thread(obj2, "second-child-thread");
		
		// assigning priority to threads
        t1.setPriority(4);
        t2.setPriority(8);
        
        // this will execute the overridden run method
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
//Thread Thread[second-child-thread,8,main] Started
//Thread Thread[first-child-thread,4,main] Started
//Thread Thread[second-child-thread,8,main] Ended
//Thread Thread[first-child-thread,4,main] Ended
//
//Explanation:
//Here, the priority of thread t1 is 4, whereas the priority of the second thread t2 is 8. 
//Because the second thread has the highest priority so thread selector executes it first.
//When the yield() method is called on thread t2, t2 returns to the Ready state. 
//Now, the selector selects thread t1 for its execution.
//When yield() is called on t1 because t2 has the highest priority, 
//so t2 executes again, and after its execution finishes, thread t1 resumes its execution.
