package com.briup.java_day14.exercise.exercise5;

import com.briup.java_day14.IdException;

public class Worker {
	private int id;
	private String name;
	private int age;
	private double salary;
	private String idCard;
	private int workerNum;
	private double totalSalary;
	public Worker(int id, String name, int age) throws Exception{
		if(age<18){
			throw new AgeLowException();
		}
		if(age>60){
			throw new AgeHighException();
		}
		if( name==null || name==""){
			throw new BlankException();
		}
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Worker(double salary, String idCard) throws Exception{
		if(salary<600){
			throw new SalaryLowException();
		}
		if(idCard.length()!=18){
			throw new IdException();
		}
		this.salary = salary;
		this.idCard = idCard;
	}
	
	public void addSalary(double addSalary) throws SalaryHighException{
		if( (addSalary+salary) - totalSalary > 0){
			throw new SalaryHighException();
		}
		salary += addSalary;
	}
	public void minusSalary(double minusSalary) throws SalaryLowException {
		if( (salary-minusSalary)-600 < 0 ){
			throw new SalaryLowException();
		}
	}
	public void showTotalSalary() throws BlankException {
		if(totalSalary==0){
			throw new BlankException();
		}
	}
	public void showTotalEmployee() throws BlankException{
		if(workerNum==0){
			throw new BlankException();
		}
	}
}
