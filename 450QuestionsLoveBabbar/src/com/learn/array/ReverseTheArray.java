package com.learn.array;

import java.util.Scanner;

public class ReverseTheArray {
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
		
		for(int i = size-1; i<=0;i++) {
			System.out.print("Value at index"+" "+i+" "+"is"+" ");
			System.out.println(array[i]);
		}
	}

}