package com.briup.java_day21;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerSocketTest {
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			//创建ss对象表示的就是服务端链接的端口号
			server = new ServerSocket(8888);//固定的IP。port不要1024以下的
			//accept代表server端就收客户端发送过来的网络请求
			//返回的是socket类型对象。代表客户端的
			System.out.println("服务端开启，等待客户端连接");
			Socket client = server.accept();//accept阻塞方法，如果没有client链接，一直等待
			System.out.println("Client:"+client.getInetAddress()+"has connect the server");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
