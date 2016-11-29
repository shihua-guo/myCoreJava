package com.briup.java_day14.exercise.exercise6;


public class Exercise6 {
	
	public void noStatic () throws BlankException{
		System.out.println("i am dad.....");
		throw new BlankException();
	}
	
	//overload
	public int noStatic(int i)  throws Exception{
		throw new Exception();
	}
	public static void main(String[] args) throws Exception {
		Exercise6 e = new Exercise6();
//		e.noStatic(1);
		e = new Exercise6Son();
		e.noStatic();
	}
}

class Exercise6Son extends Exercise6{
	/**
	 * for overwrite need to more specific exception
	 */
	/*public void noStatic() throws Exception{
		System.out.println("i am son......");
		throw new Exception();
	}*/
	/*public void noStatic() throws BlankException{
		System.out.println("i am son......");
		throw new BlankException();
	}*/
	public void noStatic() throws BlanExceptionSon{
		System.out.println("i am son......");
		throw new BlanExceptionSon();
	}
}