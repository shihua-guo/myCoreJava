package com.briup.java_day19.ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties p =new Properties();
//		p.setProperty("age","20");
//		p.setProperty("name", "zhangsan");
//		p.setProperty("school", "河南大学");
//		System.out.println(p.getProperty("age"));
//		p.list(System.out);
		try {
//			p.store(new FileOutputStream("doc/Properties.txt"),"这是一个表");
			p.load(new FileInputStream("doc/Properties.txt"));
			System.out.println(p.getProperty("age"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Enumeration<String> en = (Enumeration<String>)p.propertyNames();
		while(en.hasMoreElements()){
			String key = en.nextElement();
			String value = p.getProperty(key);
			System.out.println("K:"+key+" V:"+value);
		}
		/*Set<Object> set = p.keySet();
		for(Object o:set){
			System.out.println((String)o);
		}*/
	}
}
