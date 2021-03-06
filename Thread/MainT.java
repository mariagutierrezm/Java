package org.mycode.threads;

/*
 * simple way to create a thread
 * to use this in an application you will need to make sure to cancel your thread when the work is done
 * and you have to be aware of deadlock, race conditions, etc.
 * 
 * */
public class MainT {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable( ) {
			@Override
			public void run () {
				System.out.println("Hello fae another thread");
				for(int i = 0; i<5; i++) {
					System.out.println("printing " + i + " in the thread inside main");
					try {
						Thread.sleep(1000); //wait one second for the next i to be print
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		});
		
		thread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("print " + i + " in main thread"); //called main thread or ui thread
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
	}

}
