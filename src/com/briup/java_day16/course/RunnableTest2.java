package com.briup.java_day16.course;

public class RunnableTest2 {
	public static void main(String[] args) {
		Runnable r = new Run();
		Thread t = new Thread(r);//pass r???
		Thread tt = new Thread(r);//pass r???
		t.start();
		tt.start();
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
		
	}
}
class Run implements Runnable{
	int i =0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (; i < 10; i++) {
			System.out.println("i am ThreadTest4 "+i);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
