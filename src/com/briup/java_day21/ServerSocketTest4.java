package com.briup.java_day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import com.briup.bean.Student;

public class ServerSocketTest4 {
	public static void main(String[] args) {
		ServerSocket server = null;
		InputStream in = null;
		OutputStream out = null;
		Socket client = null;
		// ObjectInputStream ois =null;
		try {
			// 创建ss对象表示的就是服务端链接的端口号
			server = new ServerSocket(9999);// 固定的IP。port不要1024以下的
			// accept代表server端就收客户端发送过来的网络请求
			// 返回的是socket类型对象。代表客户端的

			System.out.println("服务端开启，等待客户端连接");
			client = server.accept();// accept阻塞方法，如果没有client链接，一直等待
			System.out.println("Client:" + client.getInetAddress() + "has connect the server");
			in = client.getInputStream();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(in));
			out = client.getOutputStream(); 
			PrintWriter pw = new PrintWriter(out,true);//auto flush
			String line = null;
			while((line=br.readLine())!=null){
				
				pw.write(line.toUpperCase());
				pw.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (client != null)
					client.close();
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
