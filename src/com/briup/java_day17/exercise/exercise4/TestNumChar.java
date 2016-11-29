package com.briup.java_day17.exercise.exercise4;

public class TestNumChar {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			private int count;
			@Override
			public void run() {
				synchronized (Thread.class) {
					// TODO Auto-generated method stub
					for (int i=1; i <= 52; i++) {
						System.out.print(i+" ");
						count++;
						if (count == 2) {
							count = 0;
							Thread.class.notify();
							try {
								Thread.class.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					Thread.class.notify();
				}
			}
			
		});
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				synchronized (Thread.class) {
					// TODO Auto-generated method stub
					for (char i = 'A'; i <= 'Z'; i++) {
						System.out.print(i+" ");
						Thread.class.notify();
							try {
								Thread.class.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					Thread.class.notify();
				}
			}
			
		});
		t1.start();
		t2.start();
	}
}
