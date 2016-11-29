package com.briup.java_day18.exercise.exercise1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyWriter {
	private OutputStream out;
	
	public MyWriter(){
		try {
			out = new FileOutputStream("doc/sourse.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public OutputStream getOut() {
		return out;
	}
	public void setOut(OutputStream out) {
		this.out = out;
	}
	public void write(int data) throws IOException {
		out.write(data);
	}

	public void write(byte[] buf) throws IOException {
		write(buf,0,buf.length-1);
	}

	public void write(byte[] buf, int off, int len) throws IOException {
		// occur exception
		if (buf == null) {// if buf not init of is a null array
			throw new NullPointerException();
		} else if (off < 0 || len < 0 || off+len > buf.length) {// if off or
			throw new IndexOutOfBoundsException();// len  illegal
		} else if (len == 0) {// if not read a element
			return ;
		}
		for(int i=0;i<=len;i++){
			if(buf[off+i] > 97&& buf[off+i]<122){
				write((buf[off+i]-32));
			}
			else{
				write(buf[off+i]);
			}
		}
	}
}
