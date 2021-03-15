package com.learn.java.hackerrank.days30;

import java.util.Scanner;

public class Conditionalstmt {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";
		if (n % 2 != 0) {
			ans = "Weird";
		} else if (n % 2 == 0) {
			if (n >= 2 && n <= 5) {
				ans = "Not Weird";
			}
			if (n >= 6 && n <= 20) {
				ans = "Weird";
			}
			if (n >= 20) {
				ans = "Not Weird";
			}
		}
		System.out.println(ans);
	}

}
