package com.briup.java_day12.exercise.exercise1;

public interface List {
	void add(Object num);//add a new number to the list
	Object remove(int index);//remove the index of list
	Object set(int index,int num);//set/change a element of list
	Object get(int index);//get the element of index of list
	int size();//get the size of list
	boolean isEmpty();//judge if list empty
}
