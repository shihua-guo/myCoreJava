package com.briup.java_day21;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Student;

public class SocketTest4 {
	public static void main(String[] args) {
		Socket client = null;
		OutputStream out = null;
		InputStream in  =null;
		ObjectOutputStream oos = null;
		try {
			// 创建一个socket对象
			String localHost = "127.0.0.1";
			client = new Socket(localHost, 9999);
			out = client.getOutputStream();
			in = client.getInputStream();
			byte[] b = new byte[128];
			out.write("hello\r\n".getBytes(),0,"hello\r\n".length());
			oos = new ObjectOutputStream(out);
			
			int len = in.read(b);
			System.out.println(new String(b, 0, len));
			oos.flush();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (out != null) {
					out.close();
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
