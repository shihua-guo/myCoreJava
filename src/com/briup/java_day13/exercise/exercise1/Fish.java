package com.briup.java_day13.exercise.exercise1;

public class Fish extends Animal implements Pet{
	private String name;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Fish playing.......");
	}
	public void walk(){
		System.out.println("Fish walking.......");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish eatting.......");
		
	}

}
