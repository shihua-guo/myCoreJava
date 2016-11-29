package com.briup.java_day13.exercise.exercise5;

import java.util.ArrayList;

public class MyQueue {
	private ArrayList queue;
	public MyQueue(){
		queue = new ArrayList();
	}
	public void in(Object obj){
		queue.add(obj);
	}
	public Object out(){
		if (isEmpty()) {
			return null;
		}
		return queue.remove(0);
	}
	public boolean isEmpty(){
		if (queue.size()<=0) {
			System.err.println("Empty!");
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.in("alan");
		System.out.println(mq.out());
		for (int i = 0; i < 10; i++) {
			mq.in(i+"abc");
		}
		for (int i = 0; i < 13; i++) {
			if( !mq.isEmpty()){
				System.out.println(mq.out());
			}
		}
	}
}
