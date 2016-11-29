package com.briup.java_day19.exercise3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	
	//把文件的内容写入(Input)到文件流（使用buffer包装测试对比）
	//把文件流的内容写入到byte数组中
	//使用Output把byte数组中的内容输出到File流中
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("doc/rw.txt");
		FileOutputStream fos1 = new FileOutputStream("doc/copy1.txt");
		FileOutputStream fos2 = new FileOutputStream("doc/copy2.txt");
		byte[] b = new byte[512];
		int len =0;
		while(-1!=(len=fis.read(b))){
			fos1.write(b, 0, len);
			fos2.write(b, 0, len);
		}
		
		
		if(fis!=null){
			fis.close();
		}
		if(fos1!=null){
			fos1.close();
		}
		if(fos2!=null){
			fos2.close();
		}
	}
}
