package com.briup.java_day14.course;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

public class ReflectTest {
	public static void main(String[] args) throws Exception {
		Worker worker = new Worker();
		Class c = worker.getClass();//c describe the class need to new a instance
		Class c2 = Worker.class;//way 2 to get class
		
		//recommend way to get class
		Class c3 = Class.forName("com.briup.ch06.Worker");//pass the class name by String
		
		//the same mirror compare the address
		System.out.println(c==c2);
		System.out.println(c==c3);
		System.out.println(c2==c3);
		
		System.out.println(c3.getField("name"));
		Field f = c3.getField("name");
		//get the modifier 1:public 
//		System.out.println(f.getModifiers());
//		System.out.println(f.getType());
//		System.out.println(f.getName());
//		System.out.println(f.get(worker));
		System.out.println(c3.getDeclaredField("age"));
		Field[] f2 = c3.getDeclaredFields();
		for(Field tempF : f2){
			System.out.println(tempF.getName());
			System.out.println(tempF.getType());
			System.out.println(f.get(worker));
		}
		Method[] m = c3.getMethods();
		for(Method tmp : m){
			System.out.println(tmp.getName() );
			System.out.println(tmp.getDeclaringClass());
			System.out.println(tmp.getModifiers());
			System.out.println(tmp.getReturnType());
//			System.out.println(tmp.getAnnotation(c).toString());
		}
		Method tmp = c3.getMethod("say");
		System.out.println(tmp.getName() );
		System.out.println(tmp.getDeclaringClass());
		System.out.println(tmp.getModifiers());
		System.out.println(tmp.getReturnType());
//		tmp = c3.getMethod("show",int.class,String.class);
//		System.out.println(tmp.getName() );
//		System.out.println(tmp.getDeclaringClass());
//		System.out.println(tmp.getModifiers());
//		System.out.println(tmp.getReturnType());
		
		tmp.invoke(worker);
		Worker w = (Worker) c3.newInstance();
		w.say();
		
		//use constructor to new a instance
		Constructor con = c3.getConstructor(String.class,int.class);
		Worker w2 = (Worker) con.newInstance("alan",10);
		System.out.println(w2);
		w2.say();
	}
}

class Worker{
	public String name = "zhangsan";
	private int age;
	public Worker(){
		System.out.println("no param construtor");
	}
	public Worker(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void say(){
		System.out.println("say......");
	}
	public void show(int i, String str){
		i=10;
		str="alan";
		System.out.println(i+str);
	}
	
}