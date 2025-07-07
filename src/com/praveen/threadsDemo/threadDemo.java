package com.praveen.threadsDemo;

class Myclass extends Thread{
	public void run() {
		System.out.println("Current thread: "+Thread.currentThread().getName());
	} 
}

public class threadDemo {
	
	

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		Myclass t1 = new Myclass();
		Myclass t2 = new Myclass();
		Myclass t3 = new Myclass();
		Myclass t4 = new Myclass();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
