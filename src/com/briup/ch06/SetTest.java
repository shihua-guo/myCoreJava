package com.briup.ch06;

import java.util.ArrayList;
import java.util.Collection;

public class SetTest {
	public static void main(String[] args) {
		Collection array = new ArrayList();
		Collection array2 = new ArrayList();
		array.add("name");
		array.add(123);
		array.add("String");
		array.add(new Student());//store the reference
		System.out.println(array);
		array2.add("this");
		array2.add("that");
		array2.addAll(array);
		System.out.println(array2);
	}
}
