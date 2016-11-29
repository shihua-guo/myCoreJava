package com.briup.java_day19.ch11;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamTest2 {
	public static void main(String[] args) throws Exception{
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		System.out.println(bao.size());//length is 0 ,no data because to save the space
		bao.write("hello".getBytes(),0,"hello".length());
		for(int i = 0;i<100;i++){
			bao.write(104);
		}
		byte[] arr = bao.toByteArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(bao.size());//length is 5 dynamic change like the array 
		bao.flush();
	}
}
