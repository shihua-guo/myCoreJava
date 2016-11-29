package com.briup.java_day19.exercise1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamTest {
	public static void main(String[] args) throws IOException {
		PipedOutputStream pos = new PipedOutputStream();
		PipedInputStream pis = new PipedInputStream(pos);// connect
		Input in = new Input(pis);
		Output out = new Output(pos);
		new Thread(in).start();
		new Thread(out).start();
	}
}

// 读取，并打印到控制台
class Input implements Runnable {
	private PipedInputStream pis;

	public Input(PipedInputStream pis) {
		this.pis = pis;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		byte[] b = new byte[512];
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("doc/Pipe2File.txt",true);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			while(true){
				int len = pis.read(b);
//				System.out.write(b,0,len);
				fos.write(b, 0, len);
			}
//			System.out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(pis!=null){
				try {
					pis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

// 写如到管道
class Output implements Runnable {
	private PipedOutputStream pos;

	public Output(PipedOutputStream pos) {
		this.pos = pos;
	}

	@Override
	public void run() {
		InputStream in = System.in;
		byte[] b = new byte[512];
		int len = 0;
		try {
			while (true) {
				len = in.read(b);
				pos.write(b, 0, len);
			}
			// pos.write("hello world!!".getBytes());
			// pos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pos != null)
					pos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
