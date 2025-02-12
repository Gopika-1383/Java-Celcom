package com.celcom.day7;

public class ThreadExample2 extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("My Thread Running.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadExample2 t1 = new ThreadExample2();
		System.out.println(t1.getState());
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.start();
		
		Thread.sleep(3000);
		
		System.out.println("END");

	}

}
