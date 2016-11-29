package com.briup.java_day14.course;

public class Student {
	static int tall;
	private long id;
	private String name;
	private int age;
	public Student(){}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void say(){
		System.out.println("say.......");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		Student stu = new Student("zhangsan",20);
		System.out.println(stu.getAge());
		Student stu2p = new Student("lisi",23);
		System.out.println(stu.getClass());
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
