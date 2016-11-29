package com.briup.java_day19.exercise5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//FIS读取文件可以读取的字节，第一个
public class HalfFile {
	private FileInputStream fis;
	private FileOutputStream fos1;
	private FileOutputStream fos2;
	public HalfFile(String sourceFile){
		try {
			fis = new FileInputStream(sourceFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void input2File(String file1,String file2) throws IOException{
		fos1 = new FileOutputStream(file1);
		fos2 = new FileOutputStream(file2);
		int srcFileByte = fis.available();//get the source file byte
		byte[] b1 = new byte[srcFileByte/2];
		int len = 0;
		fis.read(b1);
		fos1.write(b1);
		fis.read(b1);
		fos2.write(b1);
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
	public static void main(String[] args) throws IOException{
		HalfFile hf = new HalfFile("doc/halfFileSrc.txt");
		hf.input2File("doc/halfFileDes1.txt", "doc/halfFileDes2.txt");
	}
}
