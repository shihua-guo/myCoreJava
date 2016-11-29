package com.briup.java_day16.course;

import javax.management.RuntimeErrorException;

public class ThreadTest5 extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("i am ThreadTest4 "+i);	
			try {
				
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			throw new RuntimeException("this is runtime ");
			
		}
	}
	public static void main(String[] args) {
		System.out.println(currentThread().getName()+"hello");
		Thread tm = currentThread();
		ThreadTest5 tt = new ThreadTest5();
		tt.start();
//		try {
//			//˭����˭���������̵߳��ã����߳�����
//			tt.join();//main thread execute this code then main into a blocked statues to wait 
//			//�ȴ�tt�������߳�ִ�����ٿ���
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		tt.interrupt();//who execute this code then interrupt who : interrupt tt
		System.out.println(currentThread().getName()+"world");
	}

}
