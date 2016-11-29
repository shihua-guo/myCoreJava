package com.briup.java_day20;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomAccessFileTest {
	public static void main(String[] args) {
		RandomAccessFile raf =null;
		try {
			raf = new RandomAccessFile("doc/rw.txt","rw");
//			byte b = raf.readByte();
//			int i = raf.readInt();//readint 读了32位：读了hell...再换成int
//			System.out.println((char)i);
//			byte b = raf.readInt();
//			System.out.println();
			
			byte b ;
			raf.seek(10);
			b = raf.readByte();
//			System.out.println(b);
			
			raf.seek(10);
			char c = raf.readChar();
//			System.out.println(c);
			
			
			raf.seek(12);
			byte[]  buf = new byte[12];
			int len = raf.read(buf);
			System.out.println(new String(buf,0,len));
			System.out.println(Arrays.toString(buf));
			
			/*raf = new RandomAccessFile("doc/rw.txt","rw");
			raf.write("hello".getBytes());
			long index = 0;
			index = raf.getFilePointer();//获取当前的位置
			System.out.println(index);
			raf.seek(index);//接着位置继续写
			raf.write("world".getBytes());//重新写了
			index = raf.getFilePointer();
			raf.seek(index);
			raf.write("你好".getBytes());
			index  = raf.getFilePointer();
			System.out.println(index);
			
			raf.seek(26);
			raf.write("很高兴认识你！".getBytes());*/
			
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(raf!=null){
					raf.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
