package com.briup.java_day14.exercise.exercise1;

public class OwnExceptionHandler {
	public static void main(String[] args) {
		try {
			OwnExceptionSource oe = new OwnExceptionSource();
			oe.a();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
