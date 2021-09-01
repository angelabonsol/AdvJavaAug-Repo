package com.cognixia.jump.corejava.collectionsgenerics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		Set<String> fruitsTree = new TreeSet<String>();
		
		Set<String> fruitsHash = new HashSet<String>();
		
		String[] fruitsArr = {"Kiwi", "Watermelon", "Green Apple", "Nectarine"};
		
		
		for(String fruit: fruitsArr) {
			fruitsTree.add(fruit);
			fruitsHash.add(fruit);
		}
		
		
		System.out.println("<== 'fruitsTree' after '.add() ==>\n" + fruitsTree);
		System.out.println("<== 'fruitsHash' after '.add() ==>\n" + fruitsHash);
		
		System.out.println(fruitsTree.size());
		fruitsTree.clear();
		
		if(fruitsTree.isEmpty()) {
			System.out.println("<== 'fruitsTree' isEmpty() ==> TRUE");
		}
		else {
			System.out.println("<== 'fruitsTree' isEmpty() ==> FALSE\n");
		}
		
		Iterator<String> iterFruit = fruitsHash.iterator();
		
		System.out.println("<== Utilizing Iterator object to read elements from 'fruitsHash' ==>\n");
		while(iterFruit.hasNext()) {
			System.out.println(iterFruit.next());
		}
		
		
		
		
		
		
		
	}

}
