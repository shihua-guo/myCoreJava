package com.briup.java_day19.ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/com/briup/java_day19/ch11/FileOutputStreamTest.txt");
			fos = new FileOutputStream("src/com/briup/java_day19/ch11/Destination.txt");
			int bs = fis.available();//可以读取多少字节
			fis.skip(bs/2+2);//跳一半，中文被分开。
			byte[] b = new byte[64];
			int len=0;
			while(-1!=(len=fis.read(b))){
				fos.write(b,0,len);
				fos.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
