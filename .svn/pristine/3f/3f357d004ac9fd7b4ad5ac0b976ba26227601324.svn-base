package com.briup.shixunyi.ch11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class MyServer{	
	static MySocketThread[] myST = new MySocketThread[2];
	static int st_count = 0;//st计数器
	MyWindow serverWindow;
	//入口
	public static void main(String[] args){
		//final MyWindow myWindow = new MyWindow();//窗口的定义
		final MyServer serverFrame = new MyServer();
		serverFrame.serverWindow = new MyWindow();
		serverFrame.serverWindow.sentButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Date date = new Date();
				String str = date.toString()+":";//加上日期
				str += serverFrame.serverWindow.inPutJTextArea.getText();
				for (int i = 0; i < st_count; i++) {
					try {
						myST[i].oos.writeObject(str);
						myST[i].oos.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		//ServerSocket serverSocket = null;//定义属性
		try {//处理异常
			ServerSocket serverSocket = new ServerSocket(8888);//new 一个ServerSocket
			MyServerThread serverThread = new MyServerThread(serverSocket,serverFrame);
			serverThread.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		/*
		//线程循环，接受和发送流
		while(true){			
			try {
			//接受流
				Socket socket = serverSocket.accept();
				//包装成Object输入流
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				String str = null;//
				try {
					str = (String)ois.readObject();//把接受到的流装换为String
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println(str);//输出str
				myWindow.outPutJTextArea.setText(str);
				
			//发送流
				//包装成Object输出流
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(myWindow.getDateTime()+"  "+myWindow.inPutJTextArea.getText());//获取输入的文本
				oos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
	}
}
class MyServerThread extends Thread{
	MyServer serverFrame;//窗口
	ServerSocket server;//??
	public MyServerThread(ServerSocket server, MyServer serverFrame){
		this.server = server;
		this.serverFrame = serverFrame;
	}
	public void run(){
		while(true){
			Socket socket;
			try {
				socket = server.accept();
				MySocketThread socketThread = new MySocketThread(socket,serverFrame);
				socketThread.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}						
		}
	}
}
class MySocketThread extends Thread{//
	Socket socket;
	MyServer serverFrame;//窗口
	ObjectInputStream ois;//接受流
	ObjectOutputStream oos;//输出流
	public MySocketThread(Socket socket, MyServer serverFrame){
		this.socket = socket;
		this.serverFrame = serverFrame;
		try {
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run(){
		while(true){
			String str;
			try {
				str = (String)ois.readObject();
serverFrame.serverWindow.outPutJTextArea.setText(serverFrame.serverWindow.outPutJTextArea.getText()+str+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//获取输入

		}
	}
}