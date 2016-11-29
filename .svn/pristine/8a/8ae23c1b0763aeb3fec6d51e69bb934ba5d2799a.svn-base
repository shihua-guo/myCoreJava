package com.briup.java_day13.exercise.exercise5;

import java.util.ArrayList;

public class MyStack {
	private ArrayList stack;
	public MyStack(){
		stack = new ArrayList();
	}
	public void push(Object obj){
		stack.add(obj);
	}
	public Object pop(){
		if (isEmpty()) {
			return null;
		}
		return stack.remove(stack.size()-1);
	}
	public boolean isEmpty(){
		if (stack.size()<=0) {
			System.err.println("Empty!");
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push("alan");
		System.out.println(ms.pop());
		for (int i = 0; i < 10; i++) {
			ms.push(i+"abc");
		}
		System.out.println(ms.stack.size());
		for (int i = 0; i < 13; i++) {
			if( !ms.isEmpty()){
				System.out.println(ms.pop());
			}
		}
	}
}
