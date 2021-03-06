package com.cognixia.jump.corejava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LicenseRegistration {
	
	public static void main(String[] args) {
		
		
		try {
			
			int age = getAge();
			System.out.println("Amazing!! You are " + age + " years old and therefore, "
					+ "are eligible for the Driver License Exam!! "
					+ "Good luck on the parallel parking part :)");

			
		} catch(LicenseAgeException e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("EXCEPTION --> Please enter an 'int' value for your age!!");
		} catch(Exception e) {
			System.out.println("EXCEPTION --> General Excption block reached in 'main' method :(");
		}
		
		
	}
	
	public static int getAge() throws LicenseAgeException{		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Bureau of Motor Vehicles!!!" 
				+ "It appears you are wishing to register for the Driver License Exam: What is your age?? \n");
	
		int age = sc.nextInt();
		
		if (age < 16) {
			sc.close();
			throw new LicenseAgeException(age);
		}
		
		sc.close();
		
		return age;
		
	}

	
	
	
}
