package com.briup.java_day16.course;

import javax.management.RuntimeErrorException;

public class ThreadTest6 extends Thread{
	static int i=0;
//	 int i=0;
	public void run(){
		for (; i < 10; i++) {
			System.out.println("i am ThreadTest4 "+i);	
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadTest6 tt = new ThreadTest6();
		ThreadTest6 tt2 = new ThreadTest6();
		System.out.println(currentThread().getName()+"hello");
		tt.start();
		tt2.start();
//		try {
//			//˭����˭���������̵߳��ã����߳�����
//			tt.join();//main thread execute this code then main into a blocked statues to wait 
//			//�ȴ�tt�������߳�ִ�����ٿ���
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		tt.interrupt();//who execute this code then interrupt who : interrupt tt
		System.out.println(currentThread().getName()+"world");
	}

}
