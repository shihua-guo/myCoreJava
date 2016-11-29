package com.briup.java_day19.exercise1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class MyPipe2File {
	public static void main(String[] args) throws IOException {
		PipedOutputStream pos = new PipedOutputStream();
		PipedInputStream pis = new PipedInputStream(pos);
		Sender s = new Sender(pis);
		Receiver r = new Receiver(pos);
		new Thread(s).start();
		new Thread(r).start();
	}
}

//从管道流read出来然后再，再写入byte数组，FileOutputStream再把byte中的数据Write到指定文件中。
class Sender implements Runnable{
	private PipedInputStream pis;
	public Sender (PipedInputStream pis){
		this.pis = pis;
	}
	@Override
	public void run() {
		byte[] b = new byte[512];
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("doc/Pipe2File.txt",true);
			while (true) {
				int len = pis.read(b);
				fos.write(b, 0, len);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}

//一个inputStream从System.in中获取数据,写入到byte数组中，再把数组中的数据输出到管道中
class Receiver implements Runnable{
	private PipedOutputStream pos;
	public Receiver (PipedOutputStream pos){
		this.pos = pos;
	}
	@Override
	public void run() {
		InputStream in = System.in;
		byte[] b = new byte[512];
		int len = 0;
			try {
				while(true){
					len = in.read(b);
					pos.write(b,0,len);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
					try {
						if(in!=null){
							in.close();
						}
						if(pos!=null){
							pos.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
	}
	
}
