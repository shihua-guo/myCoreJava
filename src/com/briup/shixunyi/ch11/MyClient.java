package com.briup.shixunyi.ch11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

	
public class MyClient {
	MyClientSocketThread myCST;
	//窗口
	MyWindow clientWindow = new MyWindow();
	
	//构造器
	
	public static void main(String[] args){
		//final MyWindow myWindow = new MyWindow();//窗口的定义
		final MyClient clientFrame = new MyClient();//加入一个窗口
		//clientFrame.clientWindow = new MyWindow();
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1",8888);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		final MyClientSocketThread myCST = new MyClientSocketThread(socket, clientFrame);
		myCST.start();
		clientFrame.myCST = myCST;
		clientFrame.clientWindow.sentButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Date date = new Date();
				String str = date.toString()+":";//加上日期
				str += clientFrame.clientWindow.inPutJTextArea.getText();
					try {
						myCST.oos.writeObject(str);
						myCST.oos.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
			}
		});

		/*
		try {
			Socket socket = new Socket("127.0.0.1",8888);//
			//输出流
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(myWindow.inPutJTextArea.getText());//获取输入的
			oos.flush();
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			String str = null;
			try {
				str = (String)ois.readObject();
				myWindow.outPutJTextArea.setText(str);
			} catch (ClassNotFoundException e) {
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
		*/
	}
}
class MyClientSocketThread extends Thread{
	Socket socket;
	MyClient clientFream;//窗口
	ObjectInputStream ois;
	ObjectOutputStream oos;
	
	public MyClientSocketThread (Socket socket,MyClient clientFream){
		this.socket = socket;//?
		this.clientFream = clientFream;
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run(){
		while (true){
			String str;
			try {
				str = (String)ois.readObject();
				clientFream.clientWindow.outPutJTextArea.setText(clientFream.clientWindow.outPutJTextArea.getText()+str+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}