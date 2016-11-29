package com.briup.java_day21.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Student;

public class ClientObject {
	public static void main(String[] args) {
		Socket client = null;
		List<Student> list = new ArrayList<Student>();
		BufferedReader br = null;
		ObjectOutputStream oos = null;
		try {
			client = new Socket("127.0.0.1", 9999);
			br = new BufferedReader(new InputStreamReader(System.in));
			oos = new ObjectOutputStream(client.getOutputStream());
			String strInput = null;
			String[] strStu = null;
			System.out.println("Input name,age(String:int):");
			while( !(strInput = br.readLine()).equals("end")){
				strStu = strInput.split(",");
				list.add(new Student(strStu[0],Integer.parseInt(strStu[1])));
			}
				oos.writeObject(list);
				oos.flush();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(oos!=null){
					oos.close();
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
