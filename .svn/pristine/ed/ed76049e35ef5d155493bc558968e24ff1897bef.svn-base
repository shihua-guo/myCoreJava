package com.briup.java_day14.course;

public enum EnumTest {
	MALE,FEMALE;
	private String name;
	private int age;
	private EnumTest(){}
	private EnumTest(String name,int age){
		this.age = age;
		this.name = name;
	}
	public void say(){
		System.out.println("say......");
	}
	public static void main(String[] args) {
		EnumTest[] vs = EnumTest.values();
		for(EnumTest e:vs){
			System.out.println(e.ordinal());
		}
		//ENumTest.FEMALE;
		EnumTest et = EnumTest.valueOf(EnumTest.class,"MALE");
		System.out.println(et);
	}
}
