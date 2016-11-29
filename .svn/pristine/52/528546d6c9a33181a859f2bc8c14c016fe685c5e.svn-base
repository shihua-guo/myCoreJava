package com.briup.java_day17.course;

public class Synchronize2 {
	public static void main(String[] args) {
		SynThread2 t1 = new SynThread2();
		SynThread2 t2 = new SynThread2();
		t2.start();
		t1.start();
	}
}

class SynThread2 extends Thread{
	private static int i;
	@Override
	public void run(){
		synchronized (SynThread2.class) {
			for (; i <= 10; i++) {
				System.out.println(currentThread().getName()+":"+i);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
