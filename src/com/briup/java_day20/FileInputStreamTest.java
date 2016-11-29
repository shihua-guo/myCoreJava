package com.briup.java_day20;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileInputStreamTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		OutputStream out = null;
		try {
			fis = new FileInputStream("src/com/briup/java_day19/ch11/FileTest.txt");
			fos = new FileOutputStream("doc/FileBuffer.txt");
			
//			BufferedInputStream 
			long start = System.currentTimeMillis();
//			out = System.out;
			/*long start = System.currentTimeMillis();
			int data =1;
			while(-1!=(data=fis.read())){
				System.out.print((char)data);
			}*/
			/*byte[] b = new byte[512];
			int len = 0;
			long start = System.currentTimeMillis();
			while(-1!=(len = fis.read(b))){
				out.write(b,0,len);
			}*/
			long end = System.currentTimeMillis();
			System.out.println(end-start);
//			out.write(b, 0, len);//写到控制台
			System.out.println("---------------");
			
			
			
			
			
			
			out.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				fis.close();
			}
		}

	}
}
