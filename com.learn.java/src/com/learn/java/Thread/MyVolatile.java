package com.learn.java.Thread;

import java.util.Scanner;

class MakeVolatile extends Thread {
	private volatile boolean bool = true;
	@Override
	public void run() {
		while(bool) {
			System.out.println("Method is called!!");
			System.out.println("Name="+Thread.currentThread().getName());
			System.out.println("State"+Thread.currentThread().getState());
			System.out.println("Thread group"+Thread.currentThread().getThreadGroup());

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	 
			
		}	

	}
	

public void stopThread() {
	bool = false;
}
}

public class MyVolatile {
 public static void main(String[] args) {
	
	 MakeVolatile t1 = new MakeVolatile();
	 			t1.start();
	 			System.out.println("My thread called!!");
	 			System.out.println("Name="+Thread.currentThread().getName());
				System.out.println("State"+Thread.currentThread().getState());
				System.out.println("Thread group"+Thread.currentThread().getThreadGroup());
	 			Scanner scan = new Scanner(System.in);
	 			scan.nextLine();
	 			t1.stopThread(); 
}

}
