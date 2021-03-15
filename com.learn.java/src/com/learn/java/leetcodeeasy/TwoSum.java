package com.learn.java.leetcodeeasy;

public class TwoSum {
	public static void main(String[] args) {
		int num[] = {2,7,11,15};
		int target = 9;
		twoSum(num, target);
		
		
	}
	
	public static int[] twoSum(int[] num, int target) {
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j] == target) {
					System.out.println(i);
					System.out.println(j);
					
				}
				return new int[] {i,j};
			}
			
		}
		return new int[] {0,0};
		
	}
}
