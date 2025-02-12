package com.celcom.day7;

public class ThreadExample {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("Current thread name : "+ t.getName());
		System.out.println("Current thread priorty : " + t.getPriority());
		System.out.println("Current thread priority : " + t.getId());
	}

}
