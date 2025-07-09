package com.praveen.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Apple","Grapes","bananna","Mango","orange");
		
		System.out.println("Stream Example");
		
		names.stream().forEach(name ->{
			System.out.println(name+" - "+Thread.currentThread().getName());
		});
		
		System.out.println("Parallel Stream example:");
		
		names.parallelStream().forEach(n ->{
			System.out.println(n+" - "+Thread.currentThread().getName());
		});

	}

}
