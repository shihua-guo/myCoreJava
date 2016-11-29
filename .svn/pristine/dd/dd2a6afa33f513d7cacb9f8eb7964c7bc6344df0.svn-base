package com.briup.java_day14.course;

import java.lang.reflect.Method;

import com.briup.ch06.Student;

public class ReflectionStudent {
	public void test(Object o,String msg) throws Exception{
		String[] devide = msg.split("=");
		String methodName = "set"+devide[0].substring(0,1).toUpperCase()+devide[0].substring(1);
		//int param 
		if( devide[0].equals("id")){
//			int id = Integer.parseInt(devide[1]);
			long id = Long.parseLong(devide[1]);
//		System.out.println(int.class);
			Method m = o.getClass().getMethod(methodName, long.class);
//		Method m = o.getClass().getMethod(methodName, Class.forName("java.lang.long"));
			m.invoke(o, id);
//		Student stu = (Student)o;
//		System.out.println(stu.getId());
//		Method[] m = o.getClass().getDeclaredMethods();
//		for(Method tmpM : m){
//			if(tmpM.getName()==methodName){
//				o.getClass().getMethod(methodName,tmpM.getParameterTypes().getClass());
//			}
//		}
		//m.invoke(obj, args);
		}
		else if(devide[0].equals("age")){
			int age = Integer.parseInt(devide[1]);
			Method m = o.getClass().getMethod(methodName, int.class);
			m.invoke(o, age);
		}
		else if(devide[0].equals("name")){
			String name = devide[1];
			Method m = o.getClass().getMethod(methodName, String.class);
			m.invoke(o, name);
		}
		Student stu = (Student) o;
		System.out.println(stu.toString());
		System.out.println(stu.getAge());
	}
	public static void main(String[] args) throws Exception{
		Object o = new Student();
		String msg = "name=tom";
		ReflectionStudent rs = new ReflectionStudent();
		rs.test(o, msg);
		
	}
}
