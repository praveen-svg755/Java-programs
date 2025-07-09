package com.praveen.threadsDemo;

public class ThreadGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup group = new ThreadGroup("MyGroup");
		
		Runnable task = () -> System.out.println("Running in group: "+Thread.currentThread().getName());
		
		Thread t1 = new Thread(group , task , "Thread1");
		Thread t2 = new Thread(group , task , "Thread2");
		
		t1.start();
		t2.start();
	 System.out.println("Active threads in group: " + group.activeCount());
		

	}

}
