package com.briup.java_day14.course;
import java.util.List;

import com.briup.java_day12.exercise.exercise1.ArrayList;;
public class GenericTest {
	public void test(Point<?> p){}
	public void test5(Point<ArrayList> point){
		
	}
	public void test4(List<? > list){
		
	}
	public void test3(Point<? extends Number> p){
		
	}
	
	public static void main(String[] args) {
		GenericTest gt = new GenericTest();
		gt.test(new Point<Integer>());
		gt.test5(new Point<ArrayList>());
		gt.test4((List<?>) new ArrayList());
		Integer in = new Integer(100);
//		gt.test3(new Integer(100));
	}
}
class Point <T>{
	T x;
	T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}