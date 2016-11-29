package com.briup.shixunyi.ch11;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TeacherServer {
	public static void main(String[] args){
		ServerSocket server = null;
		try {
			server = new ServerSocket(8888);
		} catch (IOException e) {
			try {
				server = new ServerSocket(9999);
			} catch (IOException e1) {
				System.out.println("error");
			}
		}
		while(true){
			try {
				Socket socket = server.accept();
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				String str = null;
				try {
					str = (String)ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(str);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject("client client  I am  server");
				oos.flush();
				//oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
class SocketThread extends Thread{
	Socket socket;
	
	
}
