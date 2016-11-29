package com.briup.java_day17.exercise.exercise3;

public class MyDeadLock implements Runnable{
	private  boolean flag;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag){
			synchronized (Lock1.class){
				System.out.println(flag+"i am "+Thread.currentThread().getName()+" i got Lock1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (Lock2.class){
					System.out.println(flag+"i am "+Thread.currentThread().getName()+" i got Lock2");
				}
			}
		}
		else{
			synchronized (Lock2.class){
				System.out.println(flag+"i am "+Thread.currentThread().getName()+" i got Lock2");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (Lock1.class){
					System.out.println(flag+"i am "+Thread.currentThread().getName()+" i got Lock1");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		MyDeadLock md1 = new MyDeadLock();
		md1.flag=true;
		MyDeadLock md2 = new MyDeadLock();
		Thread t1 = new Thread(md1);
		Thread t2 = new Thread(md2);
		t1.start();
		t2.start();
	}
}
class Lock1{
}
class Lock2{
}
