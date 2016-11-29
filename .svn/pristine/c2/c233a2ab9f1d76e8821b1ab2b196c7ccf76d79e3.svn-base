package com.briup.java_day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.CharBuffer;

public class FileReaderWriterTest {
	
	public static void main(String[] args) throws IOException{
//		fileReadTest();
//		readerWriter();
		bufferReadTets();
//		bufferWriterTets();
		
		
	}

	private static void bufferWriterTets() {
//		FileReader
	}

	private static void bufferReadTets() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("doc/FileReader.txt"));
		PrintWriter pw = new PrintWriter("doc/rw.txt");
		String line = null;
		while((line=br.readLine())!=null){
			pw.write(line);
		}
		
		
		/*String line = br.readLine();
		String line2 = br.readLine();
		System.out.println(line);
		System.out.println(line2);*/
		/*String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}*/
		
	}

	private static void readerWriter() throws IOException{
		FileReader fr  =new FileReader("doc/FileReader.txt");
		FileWriter fw = new FileWriter("doc/FileWriter.txt",true);
		int len =0;
//		CharBuffer  buf = new CharBuffer(); 
//		while(-1!=(len=fr.read(buf))){
//		}
		
		}
		
	

	private static void fileReadTest() throws IOException{
		// TODO Auto-generated method stub
		//一个一个字符读取，不是一个一个字节读
		FileReader fr  =new FileReader("doc/FileReader.txt");
		FileWriter fw = new FileWriter("doc/FileWriter.txt",true);
//		char c = (char)fr.read();
		/*char[] c = new char[64];
		int len = fr.read(c,2,3);
		
		
		System.out.println(new String(c,0,len));*/
		char[] c = new char[64];
		int len = 0;
		while(-1!=(len=fr.read(c))){
//			System.out.println(new String(c,0,len));
			fw.write(c, 0, len);
		}
		fw.write("hello ");
//		System.out.println(c);
	}
}
