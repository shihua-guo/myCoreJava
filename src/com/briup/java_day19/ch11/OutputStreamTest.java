package com.briup.java_day19.ch11;

import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) throws Exception{
		/*OutputStream out = System.out;//目标为console
//		out.write(97);
		byte[] b = "hello".getBytes();
		out.write(b);
		out.write(b,2,2);//exception for out of index 
		out.flush();*/
		OutputStream out = System.out;
		InputStream in = System.in;
		int len = 0;
		byte[] b = new byte[10];//最好是2的n次方
		while((len=in.read(b))!=-1){
			String s = new String (b,0,len-2);
			if("over".equals(s)){
				break;
			}
			out.write(b, 0, len);
			out.flush();
		}
		out.flush();
		out.close();
	}
}
