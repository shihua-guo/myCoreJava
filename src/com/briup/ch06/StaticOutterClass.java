package com.briup.ch06;

public class StaticOutterClass {
	private String name="outtername";
	public static int age;
	public void test(){
		System.out.println("outter test");
		System.out.println();
	}
	
	public static void show(){
		System.out.println("this is outter show");
	}
	static class InnerClass{
		private String name = "zhangsan";
		public static int num;
		public void test2(){
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(InnerClass.this.name);
			System.out.println(StaticOutterClass.age);
//			System.out.println(StaticOutterClass.this.name);
			StaticOutterClass so  = new StaticOutterClass();
			System.out.println(so.name);
			System.out.println("inner test 2");
			so.test();
			StaticOutterClass.show();
		}
		public void show1(){
			System.out.println("inner show1");
		}
	}
	public static void main(String[] args) {
		StaticOutterClass soc = new StaticOutterClass();
		soc.test();
		InnerClass ic = new InnerClass();
		ic.test2();
	}
}
