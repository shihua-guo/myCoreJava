package com.briup.java_day21.exercise3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		BufferedReader brInput = null;
		FileWriter fw = null;
		try {
			client = new Socket("127.0.0.1", 9999);
			br = new BufferedReader(new InputStreamReader(client.getInputStream(),"UTF-8"));
			pw = new PrintWriter(client.getOutputStream(),true);
			brInput = new BufferedReader(new InputStreamReader(System.in));
//			pw.write(brInput.readLine());
//			pw.flush();
			String strFile = null;
//			System.out.println("Input the FileName:");
			while((strFile=br.readLine()).equals("NO")||strFile.equals("")){
				System.out.println(strFile);
				System.out.println("Input the FileName:");
				pw.write(brInput.readLine()+"\r\n");
				pw.flush();
			}
//			doc/SrcFileCS.txt
			System.out.println(strFile);
			byte[] b = new byte[1024];
			fw = new FileWriter("doc/DesFileCS.txt");//
			String line = null;
			while((line = br.readLine())!=null){
				fw.write(line+"\r\n");
				
				fw.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				try {
					if(fw!=null){
						fw.close();
					}
					if(brInput!=null){
						brInput.close();
					}
					if(pw!=null){
						pw.close();
					}
					if(br!=null){
						br.close();
					}
					if(client!=null){
						client.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
