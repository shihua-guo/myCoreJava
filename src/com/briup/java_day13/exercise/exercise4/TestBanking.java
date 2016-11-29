package com.briup.java_day13.exercise.exercise4;

import java.util.HashMap;

public class TestBanking 
{
	public static void main(String[] args) 
	{
		Bank bank = new Bank(new HashMap());

		bank.addCustomer(new Customer("steven"));
		bank.addCustomer(new Customer("kevin"));

		Customer cust1 = bank.getCustomer(0);
		Customer cust2 = bank.getCustomer(1);
		
		cust1.addAccount(new SavingAccount(10000.0, 2.1));
		cust2.addAccount(new CheckingAccount(10000.0, 5000.0));

		Account acc1 = cust1.getAccount(0);
		System.out.println(cust1.getName() + "'s account balance is " + acc1.getBalance());
		acc1.deposit(1000.0);
		System.out.println(cust1.getName() + "'s account balance is " + acc1.getBalance());
		acc1.withdraw(20000.0);
		System.out.println(cust1.getName() + "'s account balance is " + acc1.getBalance());
		acc1.withdraw(10000.0);
		System.out.println(cust1.getName() + "'s account balance is " + acc1.getBalance());

		CheckingAccount acc2 = (CheckingAccount)cust2.getAccount(0);
		System.out.println(cust2.getName() + "'s account balance is " + acc2.getBalance() + " and overdraft is " + acc2.getOverdraft());
		acc2.deposit(1000.0);
		System.out.println(cust2.getName() + "'s account balance is " + acc2.getBalance() + " and overdraft is " + acc2.getOverdraft());
		acc2.withdraw(20000.0);
		System.out.println(cust2.getName() + "'s account balance is " + acc2.getBalance() + " and overdraft is " + acc2.getOverdraft());
		acc2.withdraw(3000.0);
		System.out.println(cust2.getName() + "'s account balance is " + acc2.getBalance() + " and overdraft is " + acc2.getOverdraft());
		acc2.withdraw(10000.0);
		System.out.println(cust2.getName() + "'s account balance is " + acc2.getBalance() + " and overdraft is " + acc2.getOverdraft());
	}
}

