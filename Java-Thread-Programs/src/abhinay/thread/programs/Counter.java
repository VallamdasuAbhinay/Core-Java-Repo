package abhinay.thread.programs;

public class Counter {
	
	private int count = 0;
	
	public synchronized void incrementCount() {
		count++;
	}
	
	public int getCount() {
		return count;
	}

}
