package abhinay.thread.programs;

public class ThreadCallingStartMethodTwice {

	public static void main(String[] args) {
		MyThread mthread = new MyThread();
		System.out.println("before calling....");
		mthread.start();
		mthread.start();
		System.out.println(mthread.getName() + "----" + Thread.currentThread().getName());
	}

}

/*
 * Once the thread is started, we cannot start it again. If we call the start()
 * on the thread object multiple times, it will not show the compile time error,
 * but when we run the application it will give the following Runtime exception:
 * java.lang.IllegalThreadStateException
 */
class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread execution started..........");
	}

}
