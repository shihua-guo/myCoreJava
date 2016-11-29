package com.briup.java_day14.course;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.briup.ch06.Student;

public class CreateObjectByParam {
	public Object test(String className) throws Exception {
		Class<?> c = Class.forName(className);
		//new the instance
		Constructor<?> con = c.getConstructor();
		Object stu = (Student)con.newInstance();

		Method m = c.getMethod("setName", String.class);
		m.invoke(stu,"zhangsan");
		m = c.getMethod("getName");
		System.out.println(m.invoke(stu));
		m = c.getMethod("setAge", int.class);
		m.invoke(stu,20);
		m = c.getMethod("getAge");
		System.out.println(m.invoke(stu));
		return stu;
	}
	
//	public void getMethod(Class<?> c) throws Exception {
//		Method[] m = c.getDeclaredMethods();
//		for(Method tmpM : m){
//			tmpM.invoke(tmpM, m);
//		}
//	}
	public static void main(String[] args) throws Exception{
		CreateObjectByParam co = new CreateObjectByParam();
		Student stu = (Student) co.test("com.briup.ch06.Student");
		System.out.println(stu.getAge());
		System.out.println(stu.getName());
	}
}
