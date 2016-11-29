package com.briup.java_day13.exercise.exercise1;

public abstract class Animal {
	protected int legs;
	public Animal(){}
	protected Animal(int legs){
		System.out.println("i am animal");
		this.legs = legs;
	}
	public void walk(){
		System.out.println("walk......");
	}
	public abstract void eat();
}
