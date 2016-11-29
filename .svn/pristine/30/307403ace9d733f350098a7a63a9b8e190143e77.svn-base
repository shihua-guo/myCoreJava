package com.briup.java_day18.exercise.exercise1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws IOException {
		/*MyWriter mw = new MyWriter();
		MyRead mr = new MyRead();
		byte[] buf = "hello world!".getBytes();
		int data;
		while( -1 != (data=mr.read())){
			System.out.println("data:"+(char)data);
			mw.write(data);
		}
		
		
		try {
			mw.write(buf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(mw);*/
		MyWriter mw = new MyWriter();
		MyRead mr = new MyRead();
		byte[] b = new byte[64];
		InputStream is = new BufferedInputStream(System.in);
		mr.setIn(is);
		int len=mr.read(b);
		mw.setOut(System.out);
		System.out.println("=============");
		mw.write(b);
		mw.getOut().flush();
	}
}
