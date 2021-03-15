package com.learn.java.Array;

public class SingleDimArray {
	
	int array[] = null;
	
	public SingleDimArray(int size) {
		array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = Integer.MIN_VALUE;
		}
		
	final void traverseArray() {
		try{
			for(int i=0;i<array.length;i++) {
		}
			System.out.println(array[i]+" ");
			}
		catch (Exception e) {
			System.out.println("Array no longer exists!!");
			
			
		}
	}
		
		
	}

}
