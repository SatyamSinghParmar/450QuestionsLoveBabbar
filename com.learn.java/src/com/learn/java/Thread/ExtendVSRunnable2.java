package com.learn.java.Thread;

class MyRun implements Runnable{
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

public class ExtendVSRunnable2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRun());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread t2 = new Thread(new MyRun());
		t2.start();
	}
	
	

}
