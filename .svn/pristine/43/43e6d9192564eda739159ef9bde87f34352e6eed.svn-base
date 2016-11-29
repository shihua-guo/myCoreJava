package com.briup.java_day21.exercise2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Student;

public class ServerObject {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		ObjectInputStream ois =null;
		ObjectOutputStream oos = null;
		try {
			System.out.println("server started");
			server = new ServerSocket(9999);
			client = server.accept();
			System.out.println("client connected");
			ois = new ObjectInputStream(client.getInputStream());
			oos = new ObjectOutputStream(new FileOutputStream("doc/SocObject.txt"));
			List<Student> list = (ArrayList<Student>)ois.readObject();
			System.out.println("writting Obj to File");
			oos.writeObject(list);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(oos!=null){
					oos.close();
				}
				if(ois!=null){
					ois.close();
				}
				if(client!=null){
					client.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
