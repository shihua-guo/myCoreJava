package com.briup.java_day16.course;

public class ThreadTest extends Thread{
	
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName()+"------"+i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		System.out.println(currentThread().getName()+"hello");
//		1.main to start a new thread 
//		2.the new thread to execute the run() method
		try {
			t.start();
			t.sleep(931);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(currentThread().getName()+"world");
	}
}
