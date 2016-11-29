package com.briup.java_day21;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Student;

public class SocketTest3 {
	public static void main(String[] args) {
		Socket client = null;
		OutputStream out = null;
		ObjectOutputStream oos = null;
		try {
			// 创建一个socket对象
			String localHost = "127.0.0.1";
			client = new Socket(localHost, 9999);
			out = client.getOutputStream();
			out.write("hello".getBytes(),0,5);
			oos = new ObjectOutputStream(out);
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
