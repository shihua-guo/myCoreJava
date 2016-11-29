package com.briup.ch06;

public class InstanceOutterClass {
	public String name;
	public static int age;
	public void test(){
		
	}
	public void show(){
		System.out.println("outter show");
	}
	class InnerClass{
		private String name;
		public void test(){
			System.out.println("inner test2");
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(InnerClass.this.name);
			System.out.println(InnerClass.this.name);
//			InstanceOutterClass.name;
//			InstanceOutterClass.show();
		}
	}
	
	public static void main(String[] args) {
		InnerClass ic = new InstanceOutterClass().new InnerClass();
		InstanceOutterClass ioc = new InstanceOutterClass();
		InnerClass ic2 = ioc.new InnerClass();
		ic.test();
		ioc.test();
	}
}
