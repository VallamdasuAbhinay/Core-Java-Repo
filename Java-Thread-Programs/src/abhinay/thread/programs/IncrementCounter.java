package abhinay.thread.programs;

public class IncrementCounter extends Thread {

	@Override
	public void run() {
		System.out.println("Called run() method in IncrementCounter Class");
	}
	
	public IncrementCounter(Counter counterObj, int increment_counter) {
		for(int i=1; i<=increment_counter; i++) {
			counterObj.incrementCount();
		}
	}

}
