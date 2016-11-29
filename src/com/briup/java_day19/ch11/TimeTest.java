package com.briup.java_day19.ch11;

public class TimeTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();//from 1970 1.1 00:00: time stamp
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();//from 1970 1.1 00:00: time stamp
		System.out.println(end-start);
	}
}
