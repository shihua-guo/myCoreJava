package com.briup.ch06;

public class Hello {
	public String name = "lisi";
	public Hello(){
		print();
	}
	public void print(){
		System.out.println("name"+name);
	}
	public static void main(String[] args) {
		Hello h = new Hello();
		h = new Sub();
		h.print();
		System.out.println("h="+h.name);
	}
}
class Sub extends Hello{
	private String name = "zhangsan";
	public void print(){
		System.out.println("name2"+name);
		System.out.println("name_father"+super.name);
	}
}
