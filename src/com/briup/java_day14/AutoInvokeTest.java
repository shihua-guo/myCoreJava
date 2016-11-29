package com.briup.java_day14;

import java.util.Date;

public class AutoInvokeTest {
	public static void main(String[] args) throws Exception{
	Student o =  new Student (); 
	o.setAge(10);
    o.putValue("Name", "tom");  
    o.putValue("Email", "abc@163.com");  
    o.putValue("Phone", "19999999");  
    o.putValue("Address", "地址");  
    o.putValue("Age", 24);  
    o.putValue("Birthday", new Date());  
    System.out.println(o); 
	System.out.println("----------------");
	System.out.println(o.outValue("name"));
	System.out.println(o.outValue("email"));
	System.out.println(o.outValue("phone"));
	
	}
}
