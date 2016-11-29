package com.briup.java_day16.exercise.exercise2;

public class NumThread implements Runnable{
	static private boolean ifOver=false;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++){
			if(ifOver){
				break;
			}
			if(i==100){
				ifOver = true;
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep((long)(Math.random()*2000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new NumThread()); 
		Thread t2 = new Thread(new NumThread()); 
		t1.start();
		t2.start();
	}
}
