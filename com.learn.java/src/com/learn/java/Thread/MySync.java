package com.learn.java.Thread;

public class MySync {
	static int count = 0;
	
	public static synchronized void inc() {
		count++;
	}
	
	public static void main(String[] args) {
	
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			for(int i=0;i<5000;i++)
				inc();
			}
		});
		
Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			for(int i=0;i<5000;i++)
				inc();
			}
		});
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(count);
	}
	
}
