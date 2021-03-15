package com.learn.java.Array;

import java.util.Scanner;

//Check whether n is present in an array of size m or not.
public class BabbarArray2 {
	public static void main(String[] args) {
		System.out.println("Enter number to be searched in array");
		
		Scanner scan = new Scanner(System.in);
		int find = scan.nextInt();
		System.out.println("Enter size of the Array");
		int size = scan.nextInt();
		int array[] = new int [size];
		System.out.println("Enter values of array");
		for(int i =0; i<size;i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		boolean flag = false;
		for(int i =0; i<size;i++) {
			if(array[i] == find)
				flag = true;
		}
		System.out.println(flag);
	}

}
