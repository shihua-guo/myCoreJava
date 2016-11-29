package com.briup.java_day20.exercise1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadLine {
	private long skip=0;
	public static void main(String[] args) {
		ReadLine rl = new ReadLine();
		System.out.print(rl.readLine("doc/ReadLine.txt"));
//		System.out.print(rl.readLine("doc/ReadLine.txt"));
//		System.out.print(rl.readLine("doc/ReadLine.txt"));
//		System.out.print(rl.readLine("doc/ReadLine.txt"));
//		System.out.print(rl.readLine("doc/ReadLine.txt"));
//		System.out.print(rl.readLine("doc/ReadLine.txt"));
	}
	@SuppressWarnings("resource")
	public String readLine(String file){
		BufferedInputStream bis=null;
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			int b = 0;
			String str="";
			bis.skip(skip);
			while('\r'!=(b=bis.read()) ){
				str+=(char)b;
			}
			str+="\r"+"\n";
			skip+=str.length();
			return str;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(bis!=null){
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
