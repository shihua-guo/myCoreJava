package com.briup.java_day17.course;

public class MyDead implements Runnable{
	private static Object o1 = new Object();
	private static Object o2 = new Object();
	public boolean flag ;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag){
			//lock o1
			synchronized (o1){
				System.out.println("o1 is locked");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("o2 is locked");
				}
			}
		}
		else{
			synchronized (o2){
				System.out.println("o2 is locked");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("o1 is locked");
				}
			}
		}
		/* �ͷ���
		 * synchronized (o1) {
			System.out.println("o1 is locked");
		}*/
	}
	public static void main(String[] args) {
		MyDead d1 = new MyDead();
		MyDead d2 = new MyDead();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		d1.flag = true;
		d2.flag = false;
		
		t1.start();
		t2.start();
	}
	
}
