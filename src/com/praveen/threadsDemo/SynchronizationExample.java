package com.praveen.threadsDemo;

class  counter{
	private int count = 0;
	synchronized void increment() {
		 count++;
	 }
	 
	 int getCount() {
		 return count;
	 }
}

public class SynchronizationExample   {

	public static void main(String[] args) throws InterruptedException {
		counter c = new counter();
		
		Runnable task = () ->{
			for(int i=1 ; i<=1000 ; i++) {
				c.increment();
			}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t1.join();
		
		

		t2.start();
		t2.join();
		
		
		System.out.println(c.getCount());
		

	}

}
