package com.briup.java_day20.exercise2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.swing.text.DateFormatter;

public class PropertiesFile {
	private Properties p ;
	public PropertiesFile(){
		p = new Properties();
	}
	public static void main(String[] args) {
		/*try {
			p.load(new FileReader("doc/message"));
			byte[] b = new byte[10];
			int len = System.in.read(b);
			String value = p.getProperty(new String(b,0,len-2));
			System.out.println(new String(b,0,len-2)+":"+value);
//			System.out.println(new String(b,0,len-2));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		PropertiesFile pf = new PropertiesFile();
		pf.store();
		pf.find();
		
		
	}
	public void find(){
		try {
			p.load(new FileReader("doc/message"));
			byte[] b = new byte[10];
			while (true) {
				System.out.println("输入你要查找的属性名:");
				int len = System.in.read(b);
				String value = p.getProperty(new String(b, 0, len - 2));
				System.out.println(new String(b, 0, len - 2) + ":" + value);
				System.out.println("是否继续？1继续 2退出");
				System.in.read(b);
				if(b[0]=='2'){
					break;
				}
				//			System.out.println(new String(b,0,len-2));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void store(){
		try {
			
			//未解决问题：1.如果属性名字重复了，暂时没有加入判断功能
//			boolean ifContinue = true;
			while (true) {
				System.out.println("输入要存入的属性名:");
				byte[] b = new byte[10];
				int lenK = System.in.read(b);
				String key = new String(b, 0, lenK-2);
				System.out.println("输入要存入的属性名:");
				int lenV = System.in.read(b);
				String value = new String(b, 0, lenV-2);
				p.setProperty(key, value);
				System.out.println("是否继续？1继续 2退出");
				System.in.read(b);
				if(b[0]=='2'){
					break;
				}
			}
			Date date = new Date();
			DateFormat dateFor = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = dateFor.format(date);
			p.store(new FileOutputStream("doc/message",true),time);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
