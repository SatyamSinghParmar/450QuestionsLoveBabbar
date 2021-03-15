package com.learn.java.Thread;

 class MyThread extends Thread{
	@Override
	public void run() {
		
		for(int i=0;i<11;i++) {
		System.out.println("Extend thread is running" +i);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}

public class ExtendVSRunnable {
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyThread t2 = new MyThread();
		t2.start();
		
	}

}
