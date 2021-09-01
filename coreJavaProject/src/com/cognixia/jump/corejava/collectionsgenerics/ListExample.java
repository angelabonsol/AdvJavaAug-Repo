package com.cognixia.jump.corejava.collectionsgenerics;

import java.util.List;
import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Vector;

public class ListExample {
	
	public static void main(String[] args) {
		
		
		List<String> fruits = new ArrayList<>(10);
		
//		List<String> fruits = new LinkedList<>();
		
//		List<String> fruits = new Vector<>();
		
		
		fruits.add("Kiwi");
		fruits.add("Watermelon");
		fruits.add("Green Apple");
		fruits.add("Nectarine");
		
		System.out.println("<== forEach Loop Example ==>");
		for(String fruit : fruits){
			System.out.println(fruit);
		}
		
		System.out.println("\n<== for Loop Example ==>");
		for(int idx= 0; idx < fruits.size(); idx++) {
			System.out.println(fruits.get(idx));
		}
		
		fruits.remove(3); 
		
		System.out.println("<== Called remove() on 'Nectarine' ==>\n" + fruits);
		
		fruits.remove("Kiwi");

		System.out.println("<== Called remove() on 'Kiwi' ==>\n" + fruits);
		
		fruits.clear();
		
		System.out.println("<== 'fruits'  after calling '.clear()' ==>\n" + fruits);
		
		
		if(fruits.isEmpty()) {
			System.out.println("<== 'fruits' contains no elements!! ==>");
		}
		else {
			System.out.println("<== 'fruits' contains at least one element!! ==>");
		}
		
		
	}

}
