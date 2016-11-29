package com.briup.java_day17.exercise.exercise2;

public class Counter extends Thread{
	@Override
	public void run(){
		while (true) {
			Storage.num = (int) (Math.random()*99);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
