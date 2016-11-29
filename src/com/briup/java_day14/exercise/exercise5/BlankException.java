package com.briup.java_day14.exercise.exercise5;

public class BlankException extends Exception{
	public BlankException(){
		System.out.println("BlankException");
	}
}
class BlanExceptionSon extends BlankException{
	public BlanExceptionSon(){
		System.out.println("BlanExceptionSon");
	}
}
