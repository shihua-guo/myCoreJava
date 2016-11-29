package com.briup.java_day20.exercise4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			File f = new File("doc/source.txt");
//			f.setWritable(false);
			if(!f.exists()){
				System.out.println("文件不存在");
				System.exit(0);
			}
			if(!f.canWrite()){
				System.out.println("文件不允许写入");
				System.exit(0);
			}
			br = new BufferedReader(new FileReader(f));
			pw = new PrintWriter(new FileWriter("doc/des.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				pw.write(line);
				pw.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if(pw!=null){
					pw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
