package com.briup.java_day16.course;

public class RunnableTest {
	public static void main(String[] args) {
		Runnable r = new ThreadTest2();
		Thread t = new Thread(r);//pass r???
		
		//son only run one time so you can use the anonymous 
		Thread t2 = new Thread(){
			public void run(){}
		};
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		}).start();//no return 
		
		
		t.run();
		t.start();
	}
}
class ThreadTest2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"this thread test2");
	}
	
}
