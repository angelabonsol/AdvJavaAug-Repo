package com.cognixia.jump.intermediateJava.threads;

public class NumThreadRunner {
	
	public static void main(String[] args) {
		System.out.println("Main Thread ID: " + Thread.currentThread().getId());
		
		//opens up 3 threads 
		for(int idx= 0; idx < 3; idx++) {
			new NumThread().start(); 
		}
		
		
	}

	
	
	
}
