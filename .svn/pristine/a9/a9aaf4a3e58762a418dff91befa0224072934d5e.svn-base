package com.briup.shixunyi.ch11;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args){
		try {
			Socket socket = new Socket("127.0.0.1",8888);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject("server i am client2");//дһ������������
			oos.flush();
			//Thread.sleep(200);//�̹߳���200ms
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			String str = null;
			try {
				str = (String)ois.readObject();
				System.out.println(str);
			} catch (ClassNotFoundException e) {//���޷��ҵ��쳣
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}