package com.briup.java_day19.ch11;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
	public static void main(String[] args) {
		//abstract  path: exist or not
		File f = new File("src/com/briup/java_day19/ch11/FileTest.txt");// "src/com/briup/"(win and linux)
		
		System.out.println(f);
		System.out.println(f.exists());
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.getAbsolutePath());//override toString
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getParentFile());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.length());//how many byte
		
		System.out.println("=================");
		String[] str = f.getParentFile().list();
		System.out.println(Arrays.toString(str));
		for(String s:str){
			System.out.println(s);
		}
		System.out.println("=================");
		File pf = f.getParentFile();
		String[] str2 = pf.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//文件名以txt结尾的
//				return name.endsWith("java");
//				return name.contains("Byte");
				return name.startsWith("Byte");
			}
		});
		for(String s:str2){
			System.out.println(s);
		}
		
	}
}
