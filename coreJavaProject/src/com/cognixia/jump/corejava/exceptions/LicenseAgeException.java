package com.cognixia.jump.corejava.exceptions;

public class LicenseAgeException extends Exception{
	
	private static final long serialVersionUID = 6705903823000117293L;
	
	private static int minAge = 16; 
	
	public LicenseAgeException(int age) {
		super("Must be at least 16 years old to register for the BMV Driver License Exam!! You have " + (minAge - age) + " years to wait sadly!!");
		
	}
	
}
