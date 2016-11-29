package com.briup.java_day16.course;

public class ThreadTest4 extends Thread{
	public ThreadTest4(Thread tt){
		tt.interrupt();
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("i am ThreadTest4"+i);	
			try {
				
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println(currentThread().getName()+"hello");
		Thread tm = currentThread();
		ThreadTest4 tt = new ThreadTest4(tm);
		tt.start();
		try {
			tt.join();//main thread execute this code then main into a blocked statues to wait 
			//�ȴ�tt�������߳�ִ�����ٿ���
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tt.interrupt();//who execute this code then interrupt who : interrupt tt
		System.out.println(currentThread().getName()+"world");
	}

}
