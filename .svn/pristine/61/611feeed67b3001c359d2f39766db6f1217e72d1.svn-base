package com.briup.java_day17.exercise.exercise1;

public class RabbitAndTurtle extends Thread{
	private static boolean isOver;
	public RabbitAndTurtle(){}
	public RabbitAndTurtle(String name){
		super(name);
	}
	@Override
	public void run(){
		for (int i = 0; i <= 100;) {
			if(isOver){
				break;
			}
			else{
				if (Math.random() <= 0.3 && currentThread().getName().equals("Rabbit")) {
					i += 2;
					System.out.println(currentThread().getName()+i);
				} else {//if (Math.random() > 0.3 && currentThread().getName().equals("Turtle"))
					i++;
					System.out.println(currentThread().getName()+i);
				} 
			}
			if ( i==100){
				isOver=true;
				System.out.println(currentThread().getName()+" has win!!");
				break;
			}
		}
	}

}
