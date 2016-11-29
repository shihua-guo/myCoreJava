package com.briup.java_day21;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import com.briup.bean.Student;
public class ServerSocketTest2 {
	public static void main(String[] args) {
		ServerSocket server = null;
		InputStream in = null;
		ObjectInputStream ois  =null;
		try {
			//创建ss对象表示的就是服务端链接的端口号
			server = new ServerSocket(8888);//固定的IP。port不要1024以下的
			//accept代表server端就收客户端发送过来的网络请求
			//返回的是socket类型对象。代表客户端的
			
			System.out.println("服务端开启，等待客户端连接");
			Socket client = server.accept();//accept阻塞方法，如果没有client链接，一直等待
			System.out.println("Client:"+client.getInetAddress()+"has connect the server");
			in = client.getInputStream();
			ois = new ObjectInputStream(in);
			List<Student> list = (List<Student>) ois.readObject();
			for(Student stu:list){
				System.out.println(stu.toString());
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
