package com.cognixia.jump.excersises;

import java.util.Scanner;

public class fibonacci {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Up to what term would you like to see the Fibonacci Series?");
		
		int num = scan.nextInt();
		
		System.out.println("------The Fibonacci series up to the " + num + "th term-----");
		printFib(num);
		
	}
	
	private static int fib(int term) {
		
		if(term <= 1)
			return term;
		
		else if (term == 2)
			return 1;
		
		return fib(term-1) + fib(term-2);
	}
	
	private static void printFib(int term) {
		int num = 0;
		
		if(term <= 0)
			System.out.println("Only enter positive numbers ");
		
		for (int i=1; i<= term; i++) {
			System.out.print(fib(i) + " ");
		}
		
		
	}
	

}
