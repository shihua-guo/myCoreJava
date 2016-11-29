package com.briup.java_day20.exercise5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class XunLei {
	public static void main(String[] args) {
		MulThreadRW mtrw = new MulThreadRW();
		Thread th1 = new Thread(mtrw, "th1");
		Thread th2 = new Thread(mtrw, "th2");
		th1.start();
		th2.start();
	}
}


class MulThreadRW implements Runnable {
	RandomAccessFile in ;
	RandomAccessFile out ;
	public MulThreadRW () {
		try {
			in = new RandomAccessFile("doc/XunleiSrc.txt", "rw");
			out = new RandomAccessFile("doc/XunleiDes.txt", "rw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			int srcFileLength = (int) in.length();// get the sourcefile byte
			System.out.println(Thread.currentThread().getName()+srcFileLength);
			if(Thread.currentThread().getName().equals("th1")){
				in.seek(0);
				byte[] b = new byte[srcFileLength/2];
				int len = in.read(b);
				synchronized (this.getClass()) {
					out.write(b);
				}
			}
			else{
				System.out.println(Thread.currentThread().getName()+srcFileLength);
				in.seek(srcFileLength/2);
				byte[] b = new byte[srcFileLength/2];
				int len = in.read(b);
				synchronized (this.getClass()) {
					out.write(b);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(in!=null){
					in.close();
				}
				if(out!=null){
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}



class thread1 implements Runnable {

	@Override
	public void run() {
		RandomAccessFile in = null;
		RandomAccessFile out = null;
		try {
			in = new RandomAccessFile("doc/XunleiSrc.txt", "rw");
			out = new RandomAccessFile("doc/XunleiDes.txt", "rw");
			int srcFileLength = (int)in.length();// get the sourcefile byte
			byte[] b = new byte[srcFileLength];
			out.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(in!=null){
					in.close();
				}
				if(out!=null){
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}




/*public static void main(String[] args) {
RandomAccessFile in = null;
RandomAccessFile out = null;
try {
	in = new RandomAccessFile("doc/XunleiSrc.txt", "rw");
	out = new RandomAccessFile("doc/XunleiDes.txt", "rw");
	Thread th1 = new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			int srcFileLength;
			try {
				srcFileLength = (int)in.length();
				byte[] b = new byte[srcFileLength];
				out.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// get the sourcefile byte
		}
		
	});
	long srcFileLength = in.length();// get the sourcefile byte
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} finally {
	try {
		if(in!=null){
			in.close();
		}
		if(out!=null){
			in.close();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}*/