package com.briup.java_day18.course;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class ByteArrayInputStreamTest {
	public static void main(String[] args) throws Exception {
		byte[] buf = "helloworld".getBytes();
		InputStream in = new ByteArrayInputStream(buf);
//		in.read();
//		int re =  in.read();
		System.out.println("is support mark "+in.markSupported());
		
		int len = in.available();
		int data ;
//		System.out.println((char)data);
		System.out.println("mark start:");
		in.mark(2);//buf数组能够保存多少个就是多少
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		System.out.println("rest:");
		in.reset();
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		
		long num = in.skip(5);//要跳多少个，返回真实跳多少个（如果超过）
		System.out.println(num);
		data = in.read();
		System.out.println((char)data);
		
		
		
//		System.out.println("len:"+len+"data:"+re);
		
	}
}
