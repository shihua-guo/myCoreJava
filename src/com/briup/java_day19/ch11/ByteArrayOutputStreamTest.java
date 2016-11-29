package com.briup.java_day19.ch11;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ByteArrayOutputStreamTest {
	public static void main(String[] args) throws Exception{
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		/*bao.write(1);//can't put other type data
		byte[] a = bao.toByteArray();
		System.out.println(new String(a));
		System.out.println(bao.size());//length is 5 dynamic change like the array 
*/		//can't new own:Data...Stream...almost all the data type
		
		//读取基本数据的流都需要使用data...Stream..OR WRITER READER(String Stream)
		DataOutputStream dos = new DataOutputStream(bao);
		dos.writeInt(100);
		//需要读取才能正常。console解析了所以有乱码 
		
		ByteArrayInputStream bin = new ByteArrayInputStream(bao.toByteArray());
		DataInputStream dis = new DataInputStream(bin);
		
		int data = dis.readInt();
		System.out.println(data);
//		System.out.println(new String(bao.toByteArray()));
		
		
		bao.flush();
		dos.close();
		dis.close();
		bao.close();
		bin.close();
	}
}
