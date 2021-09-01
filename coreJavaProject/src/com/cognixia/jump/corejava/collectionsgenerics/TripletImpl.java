package com.cognixia.jump.corejava.collectionsgenerics;

public class TripletImpl<T> implements Triplet<T>{
	
	private T youngest = null;
	private T middle = null; 
	private T oldest = null;
	
//	public TripletImpl(T youngest, T middle, T oldest) {
//		super();
//		
//	}
	
	@Override
	public boolean add(T child) {
		
		if(oldest == null) {
			oldest = child; 
			return true;
		}
		else if (middle == null) {
			middle = child; 
			return true;
		}
		else {
			youngest = child; 
			return true;
		}
	
	}

	@Override
	public T get(int child) {

		if (child % 3 == 0 ) { //if could be divided by 3, no remainders
			return youngest; 
		}
		else if(child %2 == 0) {
			return middle;
		}
		else {
			return oldest;
		}
		

	}

	@Override
	public String toString() {
		return "TripletImpl [youngest=" + youngest + ", middle=" + middle + ", oldest=" + oldest + "]";
	}
	
	


}
