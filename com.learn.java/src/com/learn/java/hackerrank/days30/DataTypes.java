package com.learn.java.hackerrank.days30;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String[] args) {
		int i; double j; String k;
		
		Scanner scan = new Scanner(System.in);
		
		i = scan.nextInt();
		j = scan.nextDouble();
		k = scan.nextLine();
		
		scan.close();
		
		System.out.println(i+ 4);
		System.out.println(j + 4.0);
		System.out.println("HackerRank" + k);
	}

}
