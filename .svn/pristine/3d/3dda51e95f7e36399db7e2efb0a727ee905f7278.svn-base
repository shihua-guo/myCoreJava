package com.briup.java_day20;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TranStreamTest {
	public static void main(String[] args) throws IOException{
//		InputStreamReaderTest();
//		InputStreamWriterTest();
//		encodeReader();
		encodeWriter();
	}

	private static void encodeWriter() {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		try {
			fos = new FileOutputStream("doc/rw.txt");
			osw = new OutputStreamWriter(fos, "UTF-8");
			osw.write("我是我");
			osw.flush();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(osw!=null){
				try {
					osw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	//设置编码集charset
	private static void encodeReader() throws IOException{
//		BufferedReader br = new BufferedReader(new FileReader("doc/rw.txt"));
		FileInputStream fis =new FileInputStream("doc/rw.txt");
		
//		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		InputStreamReader isr = new InputStreamReader(fis,"GBK");
		char[] c = new char[32];
		int len = 0;
		len = isr.read(c);
		System.out.println(new String(c));
	}

	//将字节输出流转化为字符输入流
	private static void InputStreamWriterTest() throws IOException{
		FileInputStream fis = new FileInputStream("doc/copy1.txt");
		FileOutputStream fos= new FileOutputStream("doc/copy3.txt");
		
		InputStreamReader isr = new InputStreamReader(fis);
		OutputStreamWriter osw =new OutputStreamWriter(fos, "UTF-8");
		
		BufferedReader br = new BufferedReader(isr);
		//自动刷新
		PrintWriter pw = new PrintWriter(osw,true);//Print比bufferWriter好些
		
		//读写
		int len = 0;
		String line = null;
		while((line=br.readLine())!=null){
			pw.write(line);
		}
		
		if(br!=null){
			br.close();
		}
		if(pw!=null){
			pw.close();
		}
		
		
		
	}

	private static void InputStreamReaderTest() throws IOException{
		InputStream in = System.in;
		
		//将字节输入流转换为字符输入流,一次读取16位，一次读一个字符
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		char[] buf = new char[128];
		/*int len = 0;
		while(-1!= (len = isr.read(buf)) ){
			System.out.println(new String(buf,0,len));
		}
		*/
		String line  = null;
		while((line=br.readLine())!=null){
			if("over".equals(line)){
				break;
			}
			System.out.println(line.toUpperCase());
		}
		//直接关闭包装类的就可以了
		if(br!=null){
			br.close();
		}
		
		
	}
}
