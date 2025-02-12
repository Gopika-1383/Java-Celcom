package com.celcom.day7;

class TwoTable extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i + " * 2 = " + (i * 2));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class FiveTable implements Runnable {
	public void run() {
		for(int i=0; i<=10; i++) {
			System.err.println(i + " * 5 = " + (i * 5));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample4 {

	public static void main(String args[]) throws InterruptedException {
		
		TwoTable two = new TwoTable();
		Thread five = new Thread(new FiveTable());
		
		two.start();
		
		two.join();
		System.out.println("END");
		
		five.start();
	}
}
