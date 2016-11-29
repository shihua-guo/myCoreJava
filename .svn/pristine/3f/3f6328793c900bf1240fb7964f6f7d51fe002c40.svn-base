package com.briup.java_day17.course;

public class Synchronize {
	public static void main(String[] args) {
		SynThread t1 = new SynThread();
		SynThread t2 = new SynThread();
		t2.start();
		t1.start();
	}
}

class SynThread extends Thread{
	private static int i;
	@Override
	public void run(){
		synchronized (SynThread.class) {
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
