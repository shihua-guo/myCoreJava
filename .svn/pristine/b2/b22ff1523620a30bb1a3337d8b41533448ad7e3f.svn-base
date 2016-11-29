package com.briup.java_day20.exercise5;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class XunLei2 {
	public static void main(String[] args) {
		RandomAccessFile in = null;
		RandomAccessFile out = null;
		try {
			in = new RandomAccessFile(new File("doc/XunleiSrc.txt"), "r");
			out = new RandomAccessFile(new File("doc/XunleiDes.txt"), "rw");
			Thread th1 = new Thread(new XunThread(in,out,0L,in.length()/2));
			Thread th2 = new Thread(new XunThread(in,out,in.length()/2,in.length()));
			th1.start();
			th2.start();
			
			
			th1.join();
			th2.join();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class XunThread implements Runnable{
	private RandomAccessFile in;
	private RandomAccessFile out;
	private long start;
	private long end;
	public XunThread(RandomAccessFile in,RandomAccessFile out,long start,long end){
		this.in = in;
		this.out = out;
		this.start = start;
		this.end  =end;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
			try {
				String name = Thread.currentThread().getName();
				byte[] b = new byte[512];
				int len = 0;
				
				//暂时不清楚锁的作用
				synchronized (XunThread.class) {
					//判断是否越界
					while (start < end) {
						in.seek(start);//放置读取文件开始的位置
						out.seek(start);//放置写入文件开始的位置
						len = in.read(b);//读取in流到byte数组中
						if (start + len > end) {//判断是否越界
							len = (int) (end - start);//如果越了，只取不越界的部分
							out.write(b, 0, len);//写入len长度的字节
							break;//结束循环
						}
						out.write(b, 0, len);//写入len长度的字节
						System.out.println(name+":"+len);
						start += len;//start+len:下次开始的地方
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
