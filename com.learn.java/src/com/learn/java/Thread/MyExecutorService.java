package com.learn.java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutorService {
	
	ExecutorService executorService = Executors.newSingleThreadExecutor();
	// submit(Runnable)
	// submit(Callable)
	
	Future future = executorService.submit(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Run method called!!");
		}
	});
	
	System.out.println("With future.get() we get :"+future);


}
}
