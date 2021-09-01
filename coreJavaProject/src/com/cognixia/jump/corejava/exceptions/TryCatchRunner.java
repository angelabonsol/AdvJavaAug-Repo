package com.cognixia.jump.corejava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchRunner {

	public static void main(String[] args) {
		
		int num; 
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Please enter an 'int' value: \n");
			num = sc.nextInt(); 
			System.out.println("SUCCESS: Executed 'nextInt()'! You entered " + num);
			
		} catch(InputMismatchException e) {
			
			System.out.println("Exception: You did not enter an 'int' value :( ");
			
		} catch(Exception e) {
			System.out.println("Exception: General Exception thrown/caught!!!");
			e.printStackTrace();
		} finally {
			System.out.println("Hello there from the 'finally' block!! I will always print :) ");
		}

		
		
		
	}

}
