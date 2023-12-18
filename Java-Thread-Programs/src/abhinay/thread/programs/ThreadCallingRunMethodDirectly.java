package abhinay.thread.programs;

public class ThreadCallingRunMethodDirectly {

	public static void main(String[] args) {
		AbhinayThread athread = new AbhinayThread();
		athread.start(); // Thread execution started on the.......Thread-0
		athread.run(); // Thread execution started on the.......main
	}

}

/*
 * If we try to directly call the run() associated with thread, the execution
 * will happen on the existing main thread, instead of the child thread. This
 * can be clarified by printing the name of the current thread inside the
 * Overridden run() of the class (which extends Thread class)
 * 
 * If we call the start() associated with the thread, then the execution will
 * happen on the child thread, instead of the existing main thread. This can be
 * clarified by printing the name of the current thread inside the Overridden
 * run() of the class (which extends Thread class)
 */
class AbhinayThread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread execution started on the......." + Thread.currentThread().getName());
	}

}
