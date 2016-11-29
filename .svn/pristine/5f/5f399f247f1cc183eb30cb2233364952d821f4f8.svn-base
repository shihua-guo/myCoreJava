package com.briup.java_day16.course;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		Thread th = Thread.currentThread();
		System.out.println(th.getName());
		System.out.println("hello");
		System.out.println("test1 before.....");
		t.test1();
		System.out.println("test1 after.....");
		System.out.println("world!");
	}
	public void test1(){
		Thread th = Thread.currentThread();
		System.out.println(th.getName()+"test2 before.....");
		test2();
		System.out.println(th.getName()+"test2 after.....");
	}
	public void test2(){
		Thread th = Thread.currentThread();
		System.out.println(th.getName()+"test2 before.....");
		test3();
		System.out.println(th.getName()+"test2 after.....");
	}
	public void test3(){
		Thread th = Thread.currentThread();
		System.out.println(th.getName()+"test3 before.....");
		System.out.println("over");
		System.out.println(th.getName()+"test3 after.....");
	}
}
