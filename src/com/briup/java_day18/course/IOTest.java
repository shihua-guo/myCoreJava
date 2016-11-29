package com.briup.java_day18.course;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest {
	public static void main(String[] args) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		is = new FileInputStream("doc/sourse.txt");
		os = new FileOutputStream("doc/sourse_back.txt");
		int res = 0;
		while ((res = is.read()) != -1) {
			os.write(res);
		}
		if (is != null) {
			is.close();
			os.close();
		}
	}
}
