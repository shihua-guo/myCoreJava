package com.briup.java_day13.exercise.exercise4;

import java.util.HashMap;

public class Bank {
	private HashMap customers;
	private int custNum;
	public Bank(){}
	public Bank(HashMap customers){
		this.customers = customers;
	}
	public void addCustomer(Customer customer){
		customers.put(custNum++, customer);
	}
	public Customer getCustomer(int index){
		System.out.println(customers.get(index).toString());
		return (Customer) customers.get(index);
	}
	public HashMap getAllCustomer(){
		return customers;
	}
	public int getCustomerNum(){
		return custNum;
	}
	
}
