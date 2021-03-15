package com.learn.java.leetcodeeasy;

public class ReverseInt {

	public static void main(String[] args) {
		System.out.print(reverse(1534236469));
	}
	public static int reverse(int x){
		long sum = 0;
        while(x !=0){
        	 
            int rem = x%10;
            x = x/10;
            sum = (sum * 10) + rem;
            
            //System.out.println(rem);
            
        }
       if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)sum;
        }
        
    }
}
