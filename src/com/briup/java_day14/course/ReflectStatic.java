package com.briup.java_day14.course;

import java.lang.reflect.*;
import com.briup.java_day14.course.Student;

public class ReflectStatic {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("com.briup.java_day14.course.Student");
		Field f = c.getDeclaredField("tall");
		f.setAccessible(true);
		f.set(Student.tall, 123);
		System.out.println(Student.tall);
		Method m = c.getDeclaredMethod("say");
		m.invoke(null);
	}
}
