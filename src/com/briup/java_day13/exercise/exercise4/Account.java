package com.briup.java_day13.exercise.exercise4;

public class Account {
	protected double balance;
	public Account(){}
	public Account(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public boolean deposit(double amount){
		if (amount<=0) {
			System.out.println("Illegal amount:less than 0!");
			return false;
		}
		else{
			System.out.println("Deposit succeed!");
			balance += amount;
			return true;
		}
	}
	public boolean withdraw(double amount){
		if(amount>balance){
			System.out.println("Illegal amount:over than balance!");
			return false;
		}
		else {
			System.out.println("Withdraw succeed!");
			balance -= amount;
			return true;
		}
	}
}
