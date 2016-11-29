package com.briup.java_day14.exercise.exercise5;

public class TestWorkerException {
	public static void main(String[] args) throws Exception {
//		Worker w = new Worker(500, "123");
		Worker w = new Worker(5000, "1234567890qwertyui");
//		w = new Worker(1, null, 23);
		w = new Worker(1, "zhangsan", 23);
		w.addSalary(6999);
	}
}
