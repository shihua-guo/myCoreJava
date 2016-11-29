package com.briup.java_day16.exercise.exercise1;

import com.briup.java_day16.course.ActionListener;

public class Timer implements Runnable{
	private int delay;
	private int stop;
	private ActionListener listener;
	public Timer(int delay, int stop, ActionListener listener) {
		//完成代码
		this.delay = delay;
		this.stop  = stop;
		this.listener =  listener;
		
	}
	public Timer(int delay, ActionListener listener){
		this.delay = delay;
		this.listener =  listener;
	}
	public void start(){
		//完成代码
	}
	
	public void stop(){
		//完成代码
		try {
			Thread.sleep(stop);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.interrupted();
	}
	
	public void setDelay(int delay){
		//完成代码
		this.delay = delay;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			for(int i=1;i<=delay;i++){
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			listener.actionPerformed();
		}
	}
	
	public static void main(String[] args) {
		ActionListener al = new ActionListenerImpl("Hello World!");
		Timer t = new Timer(3,al);
		Thread tt = new Thread(t);
		tt.start();
		t.stop();
	}
}
class ActionListenerImpl implements ActionListener{
	private String output;
	public ActionListenerImpl(String output){
		this.output  = output;
	}
	@Override
	public void actionPerformed() {
		// TODO Auto-generated method stub
		System.out.println(output);
	}
	
	
}
