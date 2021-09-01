package com.cognixia.jump.corejava.collectionsgenerics;

public class GenericsExample {

	public static void main(String[] args) {
	
		TripletImpl<String>  tripletString = new TripletImpl<String>();
		
		tripletString.add("FooBar # 1");
		tripletString.add("FooBar # 2");
		tripletString.add("FooBar # 3");
		
		System.out.println("<== Calling '.get()' on 'tripletString' ==>\n" + tripletString.get(0));
		
		System.out.println("<== Calling '.get()' on 'tripletString' ==>\n" + tripletString.get(2));
		
		TripletImpl<Integer> tripletInteger = new TripletImpl<Integer>();
		
		tripletInteger.add(1);
		tripletInteger.add(2);
		tripletInteger.add(3);

		System.out.println("\nCalling '.get()' on 'tripletString' ==>\n" + tripletString.get(0));
		
		System.out.println("\nCalling '.get()' on 'tripletString' ==>\n" + tripletString.get(2));
		
		
	}

}
