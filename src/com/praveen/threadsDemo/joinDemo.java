package com.praveen.threadsDemo;

public class joinDemo   {

	public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
        	System.out.println("Thread  T1 start");
        	 try { Thread.sleep(2000); } catch (InterruptedException e) {}
        	    System.out.println("Thread 1 done");
        });
		
        Thread t2 = new Thread(() ->{
        	  System.out.println("Thread T2 is start");
        	try {
        		Thread.sleep(2000);
        	}catch(InterruptedException e){}
        	System.out.println("Thread T2 Done");
        });
        
        t1.start();
        t1.join();
        
        t2.start();
        t1.join();

	}

}

