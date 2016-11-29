package com.briup.ch06;

public class ModifierTest {
	public String name;
	protected int age;
	private String sex;
	int count;
	public void test(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(count);
	}
	public static void main(String[] args) {
		Sub2 sub = new Sub2();
		sub.show();
	}
}

class Sub1 extends ModifierTest{
	public void test(){
		System.out.println(name);
		System.out.println(age);
		//System.out.println(sex);
		System.out.println(count);
	}
}

class Sub2 extends ModifierTest{
	public void show(){
		System.out.println(name);
		System.out.println(age);
		//System.out.println(sex);
		System.out.println(count);
	}
}