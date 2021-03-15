package com.learn.java.projectEuler;

import java.util.Scanner;

public class Multiple35 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
			int sum = multiple(n);
			System.out.println(sum);

		}
		in.close();

	}

	public static int multiple(int num) {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			if ((i % 3) == 0 && (i % 5) == 0) {
				sum = sum + i;
			} else if ((i % 3) == 0) {
				sum = sum + i;
			} else if ((i % 5) == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
