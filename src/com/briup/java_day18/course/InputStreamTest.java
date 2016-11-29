package com.briup.java_day18.course;

import java.io.InputStream;

public class InputStreamTest {
	public static void main(String[] args) throws Exception {
		InputStream  in = System.in;//stander input-stream
//		System.out.println(in.getClass());
//		System.out.println(in);
		int data = in.read();
		System.out.println(data);
		data = in.read();
		System.out.println(data);
		data = in.read();
		System.out.println(data);
		data = in.read();
//		System.out.println(data);
//		data = in.read();
		System.out.println(data);//enter 代表指向行首
		data = in.read();
		System.out.println(data);//换行 /r
		System.out.println("aa\rbb");
		
		/*byte[] b = "hello".getBytes();
		int length = in.read(b);
		System.out.println(length);*/
		data = -1;
		while (-1 != (data=in.read()) ){
			System.out.println(data);
		}
	}
}
