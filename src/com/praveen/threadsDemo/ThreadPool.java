package com.praveen.threadsDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Runnable  task = () -> System.out.println("Thread name: "+Thread.currentThread().getName());
		
		for(int i=0 ;i<5 ; i++) {
			service.submit(task);
		}
		
		service.shutdown();

	}

}
