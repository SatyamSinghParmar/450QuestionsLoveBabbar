package com.learn.java.leetcodeeasy;

public class IsPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		
	}
	 public static boolean isPalindrome(int x) {
		 int isPalin=0,rem=0;
		 /*if(x<0) {
			 return false;
		 }*/
		  {
			 while(isPalin<x) {
			  rem = x%10;
			 x = x/10;
			 isPalin = (isPalin*10)+rem;
			 
			 } 
			 if(isPalin == x) {
				 return true;
			 }
			 else
				 return false;
		 }
	 }

}
