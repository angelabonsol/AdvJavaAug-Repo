package com.cognixia.jump.corejava.collectionsgenerics;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> mapTree = new TreeMap<Integer, String>();
		Map<Integer, String> mapHash = new TreeMap<Integer, String>();

		String[] fruitsArr = {"Kiwi", "Watermelon", "Green Apple", "Green Apple", "Nectarine"};
		
		for(int id = 1; id <= fruitsArr.length; id++) {
			mapTree.put(id, fruitsArr[id-1]);
			mapHash.put(id, fruitsArr[id-1]);

		}
		
		System.out.println("<== 'mapTree' ==> " + mapTree);
		System.out.println("<== 'mapHash' ==> " + mapHash);
		
		
		//Prints out each element with Key Value 
		for(Map.Entry<Integer, String> fruit: mapTree.entrySet()) { 
			System.out.println(fruit);
		}
		
		//Second Way to do it 
		for(Map.Entry<Integer, String> fruit: mapTree.entrySet()) { 
			System.out.println("Key: " + fruit.getKey() + ", Value: " + fruit.getValue());	
		}
		
		
		mapTree.remove(2);
		System.out.println("<== 'mapTree' ==> " + mapTree);
		System.out.println(mapTree.size());
		
		
		
	}

}
