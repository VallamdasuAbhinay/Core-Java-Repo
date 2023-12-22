package abhinay.thread.programs;

public class Thread_Yield_Example_Using_Main_Child_Threads {

	public static void main(String[] args) {
		MyCustomThread1 threadObj = new MyCustomThread1();
		threadObj.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread Executing.....Iteration# " + i + " on " + Thread.currentThread().getName());
		}
	}
}

//One of the ways to pause the execution of create thread is by making use of the yield method
//The yield() method is used in Java to hint the task scheduler to move the 
//currently executing task or thread to Ready state and move another task or thread (which are in waiting status)
//to the running state. 
//The task scheduler is free to ignore the hint.
//Through the yield() method, a thread is willing to yield or relinquish its 
//current use of the processor
//If there is no thread in waiting status or all the waiting threads have lower priority, 
//then again the same thread is given chance to execute.
//Again this decision will be made by Thread Scheduler and we cannot guarantee the exact order of threads execution.
//Since, yield() is the static method, we can call it directly using Thread class name.
//In this program, child thread calls the yield() method, so that main thread gets the chance
//to execute more number of times.
//Hence, there is a chance of completing main thread first.
class MyCustomThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			Thread.yield();
			System.out.println("Thread Executing.....Iteration# " + i + " on " + Thread.currentThread().getName());
		}

	}

}
