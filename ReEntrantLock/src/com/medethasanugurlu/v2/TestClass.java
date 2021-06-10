package com.medethasanugurlu.v2;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestClass {
	private Lock lock = new ReentrantLock();  // Use for synchorized case
	
	Condition condition = lock.newCondition();
	

	private int sayi = 0;

	public void arttir() {

		for (int i = 0; i < 1000; i++) {
			sayi++;

		}
	}

	public void arttır1() {

		try{
		lock.lock(); // It means only one thread goes to under code and method for isntance thread 2 dont use the arttir() method.
		System.out.println("Thread 1 ilk calisma basladi");
		System.out.println("Thread 1 uyarılmayi bekliyor");
		condition.await();
		System.out.println("Thread 1 calısıyor");
		
		arttir()		;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		lock.unlock();
		}
	}

	
	
	public void arttır2() {

		try {
			
			Thread.sleep(1000);
			System.out.println("Thread 2 calisti");
			Scanner sc = new Scanner(System.in);
			System.out.println("Thread 1 uyarnak için tuşa basınız");
			if(sc.nextLine() != null) {
				condition.signal();	
			}
			
			lock.lock();
			arttir();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
			
		}
		

	}

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}

	public void sayiDisplay() {

		System.out.println("Sayinin son hali " + sayi);
	}

}
