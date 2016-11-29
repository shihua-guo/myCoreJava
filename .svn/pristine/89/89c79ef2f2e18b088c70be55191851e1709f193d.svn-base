package com.briup.java_day21;

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

import com.briup.java_day21.ChatCS.MyWindow;

public class SocketTest8 {
	public static void main(String[] args) {
		Socket client = null;
		OutputStream out = null;
		InputStream in  =null;
		BufferedReader br=null;
		PrintWriter pw=null;
//		ObjectOutputStream oos = null;
		MyWindow clientWindow = new MyWindow();
		clientWindow.sentButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String str =MyWindow.getTime()+"\r\n"+clientWindow.inPutJTextArea.getText();
				if(!clientWindow.inPutJTextArea.getText().equals(""))
					clientWindow.outPutJTextArea.setText(clientWindow.outPutJTextArea.getText()+str+"\r\n");
				clientWindow.inPutJTextArea.setText("");
			}
		});
		try {
			// 创建一个socket对象
			String localHost = "127.0.0.1";
			client = new Socket(localHost, 9999);
			in = client.getInputStream();
			out = client.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in, "GBK"));
			pw = new PrintWriter(new OutputStreamWriter(out,"GBK"),true);
			
			String input = clientWindow.inPutJTextArea.getText();
			while(true ){
				out.write(input.getBytes());
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

