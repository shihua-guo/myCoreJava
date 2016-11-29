package com.briup.java_day21;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Student;

public class SocketTest2 {
	public static void main(String[] args) {
		Socket client = null;
		OutputStream out = null;
		ObjectOutputStream oos = null;
		try {
			// 创建一个socket对象
			String localHost = "192.168.10.85";
			client = new Socket(localHost, 9999);
			out = client.getOutputStream();
			oos = new ObjectOutputStream(out);
			List<Student> list = new ArrayList<Student>();
			list.add(new Student("alan", 23));
			list.add(new Student("jade", 18));
			list.add(new Student("bob", 23));
			oos.writeObject(list);
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
