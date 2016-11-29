package com.briup.java_day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Student;

public class SocketTest7 {
	public static void main(String[] args) {
		Socket client = null;
		OutputStream out = null;
		InputStream in  =null;
		BufferedReader input  =null;
		BufferedReader br=null;
		PrintWriter pw=null;
//		ObjectOutputStream oos = null;
		
		try {
			// 创建一个socket对象
			String localHost = "127.0.0.1";
			client = new Socket(localHost, 9999);
			in = client.getInputStream();
			out = client.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in, "GBK"));
			pw = new PrintWriter(new OutputStreamWriter(out,"GBK"),true);
			input = new BufferedReader(new InputStreamReader(System.in, "GBK"));
			byte[] b = new byte[128];
			int len = 2;
			String inStr = "";
			//!inStr.equals("bye")
			input.read();
			pw.write("fdsfd");
			System.out.println();
			while(true ){
				break;
				
				/*
//				if(inStr.equals(""))
//				len=input.read(b, 0, len);
//				input.readLine();
				inStr  = input.readLine();
				pw.write(inStr);
				System.out.println(inStr);
//				System.out.println(new String(b,0,len));
				pw.flush();
				System.out.println(br.readLine());*/
			}
//			out.write("hello\r\n".getBytes(),0,"hello\r\n".length());
//			oos = new ObjectOutputStream(out);
			
//			int len = in.read(b);
//			System.out.println(new String(b, 0, len));
//			oos.flush();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pw!=null){
					pw.close();
				}
				if (br != null) {
					br.close();
				}
				if(in!=null){
					in.close();
				}
				if (client != null) {
					client.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

