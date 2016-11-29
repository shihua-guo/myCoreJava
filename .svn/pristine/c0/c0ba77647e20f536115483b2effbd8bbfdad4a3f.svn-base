package com.briup.java_day16.exercise.exercise3;

public class PriorityTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++){
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		});
		Thread t2 = new Thread(new Runnable(){
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++){
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		});
		Thread t3 = new Thread(new Runnable(){
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++){
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		});
		t1.setPriority(4);
		t2.setPriority(4);
		t3.setPriority(4);
		t1.start();
		t2.start();
		t3.start();
	}
}
