package com.celcom.day7;

public class ThreadExample3 implements Runnable{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " Thread Running.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new ThreadExample3());
		//System.out.println(t1.getState());
		t1.setName("T1");
		//System.out.println(t1.getName());
		//System.out.println(t1.getPriority());
		
		Thread t2 = new Thread(new ThreadExample3());
		t2.setName("T2");
		
		t1.start();
		t2.start();
		
		//Thread.sleep(3000);
		
		//System.out.println("END");
		
		//t1.suspend();
		//System.out.println(t1.getState());
		
		//t1.resume();
		
		

	}

}
