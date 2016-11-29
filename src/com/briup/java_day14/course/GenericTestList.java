package com.briup.java_day14.course;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GenericTestList {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<String> list = new ArrayList<String>();
		list.add("alan");
		list.add("bob");
		list.add("cat");
		
		Method m = list.getClass().getMethod("add",Object.class);
		m.invoke(list, 1);
		Object o = list.get(3);
		System.out.println(o);
		for(String str:list){
			System.out.println(str);
		}
		
	}
}
