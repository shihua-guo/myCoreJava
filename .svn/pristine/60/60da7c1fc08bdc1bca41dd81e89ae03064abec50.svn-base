package com.briup.java_day19.exercise2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("doc/buffered.txt"));
		byte[] b = new byte[512];
		int len =0;
		long start = System.currentTimeMillis();
		while(-1!=(len=bis.read(b))){
			System.out.write(b);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}
}
