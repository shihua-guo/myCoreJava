package com.briup.java_day18.course;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayInputStreamTest2 {
	public static void main(String[] args) throws Exception {
		byte[] buf = "helloworld".getBytes();
		
		System.out.println(Arrays.toString(buf));
		InputStream in = System.in ;
		OutputStream out = System.out ;
		out.write(in.read());
		System.out.println("out: "+out.toString());
		int data = 0;
		while(-1!=(data=in.read()) ){
			System.out.println("data: "+data);
		}
		byte[] b = new byte[15];
		
		int len = in.read(buf);
//		System.out.println("len:"+len);
		len = in.read(buf,0,8);
		System.out.println(len);
		len = in.read(b);
		System.out.println(Arrays.toString(b));
		System.out.println("len:"+len);
		
		in.close();
		out.close();
		
	}
}
