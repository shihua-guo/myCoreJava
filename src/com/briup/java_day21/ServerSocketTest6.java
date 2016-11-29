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

public class ServerSocketTest6 {
	public static void main(String[] args) {
		ServerSocket server = null;
		InputStream in = null;
		OutputStream out = null;
		Socket client = null;
		PrintWriter pw=null;
		BufferedReader br =null;
		// ObjectInputStream ois =null;
		try {
			
			server = new ServerSocket(9999);// 固定的IP。port不要1024以下的
			// accept代表server端就收客户端发送过来的网络请求
			// 返回的是socket类型对象。代表客户端的
			// 创建ss对象表示的就是服务端链接的端口号
			
			System.out.println("服务端开启，等待客户端连接");
			while(true){
				client = server.accept();// accept阻塞方法，如果没有client链接，一直等待
				System.out.println("Client:" + client.getInetAddress() + "has connect the server");
				in = client.getInputStream();
				br= new BufferedReader(
						new InputStreamReader(in,"GBK"));
				out = client.getOutputStream(); 
				pw = new PrintWriter(out,true);//auto flush
				String line = null;
				pw.println("请输入昵称");
				while(!(line=br.readLine()).equals("bye")){
					pw.write(line.toUpperCase());
					pw.flush();
				}
				//关闭本次的client
				if(pw!=null){
					pw.close();
				}
				if(br!=null){
					br.close();
				}
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
