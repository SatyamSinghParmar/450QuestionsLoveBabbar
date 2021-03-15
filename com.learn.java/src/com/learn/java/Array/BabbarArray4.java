package com.learn.java.Array;

import java.util.Scanner;

//Write a program to reverse the array.
public class BabbarArray4 {

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
		
		for(int i =0; i<size;i++) {
			System.out.print("Value at index"+" "+i+" "+"is"+" ");
			System.out.println(array[i]);
		}
	}



}
