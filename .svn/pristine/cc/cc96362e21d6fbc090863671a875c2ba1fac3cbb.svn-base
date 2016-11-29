package com.briup.java_day18.course;

import java.io.InputStream;

public class InputStreamTest2 {
	public static void main(String[] args) throws Exception {
		InputStream  in = System.in;//stander input-stream
		int data = -1;
		//bye 98 121 101
		String str ="";
		while (-1 != (data=in.read()) ){
			if (data==13) {//输入回车的时候再清空
				if ("98121101".equals(str)) {
					break;
				} else {
					str = "";
				} 
			}
			System.out.println(data);
			if(data!=13 && data!=10){
				str+=data;
			}
			System.out.println(str);
		}
	}
}
