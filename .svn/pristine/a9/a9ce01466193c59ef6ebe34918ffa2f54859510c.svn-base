package com.briup.java_day18.course;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeTest {
	public static void main(String[] args) {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = null;
		try {
			pos = new PipedOutputStream(pis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sender s = new Sender(pos);
		Print p = new Print(pis);
		s.start();
		p.start();
	}
}
class Sender extends Thread{
	private PipedOutputStream pos; 
	public Sender(PipedOutputStream pos){
		this.pos = pos;
	}
	public void run(){
		for (int j = 0; j < 100; j++) {
			try {
				pos.write( (int)(Math.random()*100));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Print extends Thread{
	private PipedInputStream pis;
	public Print(PipedInputStream pis){
		this.pis = pis;
	}
	public void run(){
		for(int i=10;i<100;i++){
			try {
				System.out.println(pis.read());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

