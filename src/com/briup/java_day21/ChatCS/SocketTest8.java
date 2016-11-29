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
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import com.briup.java_day21.ChatCS.MyWindow;

public class SocketTest8 {
	public static void main(String[] args) {
//		"192.168.10.131"
		String localHost = "127.0.0.1";
		Socket client = null;
		try {
			client = new Socket(localHost, 9999);
			final ClientThread thClient  = new ClientThread(client,new MyWindow());
			thClient.start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class ClientThread extends Thread{
	private Socket client = null;
	private OutputStream out = null;
	private InputStream in  =null;
	private BufferedReader br=null;
	private PrintWriter pw=null;
	private MyWindow clientWindow = null;
	private int count;
	private String sendName;
	public ClientThread(Socket client, MyWindow clientWindow){
		this.client = client;
		this.clientWindow  = clientWindow;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// 创建一个socket对象
			
			in = client.getInputStream();
			out = client.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in, "GBK"));
			pw = new PrintWriter(new OutputStreamWriter(out,"GBK"),true);
			
			clientWindow.sentButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					String str =MyWindow.getTime()+"\r\n"+clientWindow.inPutJTextArea.getText();
					if(!clientWindow.inPutJTextArea.getText().equals("")){
						if(count==0){
							sendName = clientWindow.inPutJTextArea.getText();
						}
						clientWindow.outPutJTextArea.setText(clientWindow.outPutJTextArea.getText()+str+"\r\n");
						count++;
					}
					
					pw.println(sendName+":"+new String(clientWindow.inPutJTextArea.getText().getBytes()) );
					pw.flush();
					clientWindow.inPutJTextArea.setText("");
				}
			});
			while(true ){
				/*pw.write(new String(input.getBytes()) );
				pw.flush();*/
				
				clientWindow.outPutJTextArea.setText(clientWindow.outPutJTextArea.getText()+"\r\n"+MyWindow.getTime()+"\r\n"+br.readLine());
			}
//			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pw!=null){
					pw.close();
				}
				if (br != null) {
					br.close();
				}
				if(in!=null){
					in.close();
				}
				if (client != null) {
					client.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
