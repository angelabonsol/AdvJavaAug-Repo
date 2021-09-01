package com.cognixia.jump.intermediateJava.threads;

public class Numbers {
	
	//Prints the ID of the current thread it is using 

	static public void print(int max) {
		
		for(int idx = 0; idx < max; idx++)
			System.out.println("Thread " + Thread.currentThread().getId() + ": " + idx); //gives a reference to current Thread
		
		
		
	}
	
		
	
	
	
	
	

}
