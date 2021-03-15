package com.learn.java.Array;

import java.util.Scanner;

//Find the minimum and maximum element in an array.
public class BabbarArray3 {
	public static void main(String[] args) {
		System.out.println("Hello world!!");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the Array");
		int size = scan.nextInt();
		int array[] = new int [size];
		System.out.println("Enter values of array");
		for(int i =0; i<size;i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		
		int max = array[0],min = array[0];

		//res = Math.max(res, arr[i]);
		// res = Math.min(res, arr[i]);
		for(int i =0; i<size;i++) {
			
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("Max=" + " " + max);
		System.out.println("Min=" + " " + min);
	}

}
