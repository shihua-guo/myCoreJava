package com.briup.java_day17.exercise.exercise5;

public class NumThread1 extends Thread{
	private int count;
	private static int i=1;
	private  int whoIs;
	private static int whoNext=1;
	public NumThread1 (){}
	public NumThread1 (String name,int whoIs){
		super(name);
		this.whoIs  =whoIs;
	}
	@Override
	public void run(){
		synchronized (NumThread1.class) {
			for(;i<=75;){
				if ( (whoNext%3) == this.whoIs) {
					System.out.println(currentThread().getName() + " : " + i++);
					count++;
				}
				else {
					NumThread1.class.notifyAll();
					try {
						NumThread1.class.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(count==5){
					count=0;
					whoNext++;
					NumThread1.class.notifyAll();
					try {
						NumThread1.class.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			NumThread1.class.notify();
		}
	}
	public static void main(String[] args) {
		Thread t1 = new NumThread1("线程1",1);
		Thread t2 = new NumThread1("线程2",2);
		Thread t3 = new NumThread1("线程3",0);
//		t1.setPriority(10);
//		t2.setPriority(1);
//		t3.setPriority(1);
		t1.start();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
