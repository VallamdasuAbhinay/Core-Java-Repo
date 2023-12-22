package abhinay.thread.programs;

public class Thread_Example_Showing_Concurrency_Problem implements Runnable {

	public static int amount = 0;

	public static void main(String[] args) {
		Thread_Example_Showing_Concurrency_Problem obj = new Thread_Example_Showing_Concurrency_Problem();
		Thread threadObj = new Thread(obj);
		threadObj.start();
		System.out.println("Iteration#1 Value of amount variable...." + amount);
		amount++;
		System.out.println("Iteration#2 Value of amount variable...." + amount);
	}

	@Override
	public void run() {
		amount++;
	}

}
/*
 * Because threads run at the same time as other parts of the program, there is
 * no way to know in which order the code will run. When the threads and main
 * program are reading and writing the same variables, the values are
 * unpredictable. The problems that result from this are called concurrency
 * problems.
 * 
 * Here, the value of the variable "amount" will be different when we execute
 * the same program multiple times, because the statement "amount++" inside the
 * run() method will be executed in the unpredicted order.
 * 
 * The following are the various outputs of above program:
 * 
 * Iteration#1 Value of amount variable....1 Iteration#2 Value of amount
 * variable....2
 * 
 * Iteration#1 Value of amount variable....0 Iteration#2 Value of amount
 * variable....2
 * 
 */
