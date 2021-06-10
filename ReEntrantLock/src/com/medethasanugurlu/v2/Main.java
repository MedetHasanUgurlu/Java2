package com.medethasanugurlu.v2;

public class Main {

	public static void main(String[] args) {
		
		TestClass testClass = new TestClass();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				testClass.arttır1();
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				testClass.arttır2();
			}
		});
		
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			
			testClass.sayiDisplay();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}
