package com.briup.java_day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * 此流将多个流串联起来，合并成一个。可以使用Vector里面存3个流，
 * 然后再调用getEnumElment
 * 
 * @author alan
 * @date 2016年8月24日 上午9:52:31
 */
public class SequenceStreamTest {
	
	public static void main(String[] args) throws IOException {
//		FileInputStream fis1 = new FileInputStream("doc/Sequence1.txt");
//		FileInputStream fis2 = new FileInputStream("doc/Sequence2.txt");
//		FileInputStream fis3 = new FileInputStream("doc/Sequence3.txt");
		BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("doc/Sequence1.txt"));
		BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("doc/Sequence2.txt"));
		BufferedInputStream bis3 = new BufferedInputStream(new FileInputStream("doc/Sequence3.txt"));
		Vector<BufferedInputStream> v = new Vector<BufferedInputStream>();
		//把流装进去
		v.add(bis1);
		v.add(bis2);
		v.add(bis3);
		//返回一个枚举类型
		SequenceInputStream sis = new SequenceInputStream(v.elements());
//		FileOutputStream fos = new FileOutputStream("doc/SequenceDes.txt");
		BufferedOutputStream bos = 
				new BufferedOutputStream(new FileOutputStream("doc/SequenceDes.txt"));
		byte[] b = new byte[1024];	
		int len =0 ;
		while(-1!=(len=sis.read(b))){
			bos.write(b,0,len);
			bos.flush();
		}
		if(sis!=null){
			sis.close();
		}
		if(bis1!=null){
			bis1.close();
		}
		if(bis2!=null){
			bis1.close();
		}
		if(bis3!=null){
			bis1.close();
		}
		if(bos!=null){
			bos.close();
		}
	}
}
