package com.briup.java_day19.ch11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStreamTest fis = null;
		try {
			
//			File f = new File("src/com/briup/java_day19/ch11/FileOutputStreamTest.txt");
//			fos = new FileOutputStream(f);
			//设置追加为true
			fos = new FileOutputStream("src/com/briup/java_day19/ch11/FileOutputStreamTest.txt",true);
			
			fos.write("我是alan".getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
