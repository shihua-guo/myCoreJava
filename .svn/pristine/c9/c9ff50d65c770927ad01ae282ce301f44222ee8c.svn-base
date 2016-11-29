package com.briup.java_day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.briup.bean.Student;

public class ServerSocketTest7 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		try {
			
			server = new ServerSocket(9999);// 固定的IP。port不要1024以下的
			System.out.println("服务端开启，等待客户端连接");
			while (true) {
				client = server.accept();// accept阻塞方法，如果没有client链接，一直等待
				
				Thread t =new ChatThread(client);
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (client != null)
					client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class ChatThread extends Thread{
	private Socket client=null;
	private BufferedReader br=null;
	private PrintWriter pw=null;
	private InputStream in =null;
	private OutputStream out = null;
	
	public ChatThread(Socket client){
		this.client = client;
	}
	public String getTime(){
		Date date = new Date();
		DateFormat dateFor = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFor.format(date);
	}
	@Override
	public void run() {
		
		try {
			in = client.getInputStream();
			out = client.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in, "GBK"));
			pw = new PrintWriter(new OutputStreamWriter(out, "GBK"), true);
			String line = null;
			String name = null;
			System.out.println("登陆时间："+getTime());
			pw.write("请输入你的昵称");
			pw.flush();
			name=br.readLine();
			pw.write(name+"，你好，时间："+getTime());
			pw.flush();
			while (!(line = br.readLine()).equals("bye")) {
				pw.write(name+":"+line.toUpperCase());
				pw.flush();
			} 
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			try {
				if (pw != null) {
					pw.close();
				}
				if (br != null) {
					br.close();
				}
				if (out != null) {
					out.close();
				} 
				if(in!=null){
					in.close();
				}
				if(client!=null){
					client.close();
				}
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}
	
}
/*class CharThread implements Runnable{
	private Socket client;
	private BufferedReader br = null;
	private PrintWriter pw = null;
	private String name;
	public CharThread(Socket client){
		this.client = client;
		
	}
	@Override
	public void run() {
		InputStream in = null;
		OutputStream out = null;
		try {
			in =client.getInputStream();
			out =  client.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in,"GBK"));
			pw = new PrintWriter(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		
	}
	
}*/
