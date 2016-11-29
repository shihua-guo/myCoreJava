package com.briup.java_day13.exercise.exercise4;

public class CheckingAccount extends Account{
	private double overdraft;
	public CheckingAccount(double balance, double overdraft){
		this.balance = balance;
		this.overdraft = overdraft;
	}
	public CheckingAccount(double balance){
		this.balance = balance;
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
	public double getOverdraft(){
		return overdraft;
	}

}
