package com.briup.java_day21.ChatCS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerSocketTest8 {
	static List<ChatThread2> list = null;
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
				try {
			
			server = new ServerSocket(9999);// 固定的IP。port不要1024以下的
			System.out.println("服务端开启，等待客户端连接");
			list = new ArrayList<ChatThread2>();
			while (true) {
				client = server.accept();// accept阻塞方法，如果没有client链接，一直等待
				ChatThread2 t =new ChatThread2(client);
				list.add(t);
				ChatThread2.onlineNum++;
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
	
	public int getOnline(){
		int count=0;
		for(ChatThread2 client:list){
			
		}
		return count;
	}

}
class ChatThread2 extends Thread{
	private Socket client=null;
	private BufferedReader br=null;
	private PrintWriter pw=null;
	private InputStream in =null;
	private OutputStream out = null;
	public static int onlineNum;
	public ChatThread2(Socket client){
		this.client = client;
	}
	/*static public String getTime(){
		Date date = new Date();
		DateFormat dateFor = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFor.format(date);
	}*/
	//发送给自己
	public void sendMsgToSelf(String msg){
		pw.println(msg);
		pw.flush();
	}
	//群发
	public void sendMsgToAll(String msg){
		for(ChatThread2 ct:ServerSocketTest8.list){
			ct.sendMsgToSelf(msg);
		}
	}
	@Override
	public void run() {
		
		try {
			in = client.getInputStream();
			out = client.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in, "GBK"));
			pw = new PrintWriter(new OutputStreamWriter(out, "GBK"), true);
			String line = null;
			System.out.println("登陆时间："+MyWindow.getTime());
			sendMsgToSelf("Oneline:"+onlineNum+"  Please input your name:");
			line=br.readLine();
			sendMsgToSelf("Hi,"+line+"\r\n");
			while (!(line = br.readLine()).equals("bye")) {
				System.out.println(line);
				sendMsgToAll(line);
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
	public Socket getClient() {
		return client;
	}
	public void setClient(Socket client) {
		this.client = client;
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
