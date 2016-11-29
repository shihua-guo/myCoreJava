package com.briup.java_day18.exercise.exercise1;

import java.io.IOException;
import java.io.InputStream;

public class MyRead{
	private InputStream in;
	
	public MyRead(){
		in = System.in;
	}
	public int read()throws IOException{
		return in.read();
	}
	
	public int read(byte[] buf)throws IOException{
		return read(buf,0,buf.length);
	}

	public int read(byte[] buf,int off,int len)throws IOException{
		//occur exception
		if(buf==null){//if buf not init of is a null array
			throw new NullPointerException();
		}
		else if(off<0||len<0||len>buf.length-off){//if off or len illegal
			throw new IndexOutOfBoundsException();
		}
		else if(len==0){//if not read a element
			return 0;
		}
		int c = in.read();//then get the read
		if(10==c){//if is the last element
			return -1;//then return -1
		}
		buf[off] = (byte)c;//then put the c in this byte array
		int i = 1;
		for(;i<len;i++){
			c = in.read();
			if(10==c){
				break;
			}
			buf[off+i] = (byte)c;
		}
		return i;
	}
	public InputStream getIn() {
		return in;
	}
	public void setIn(InputStream in) {
		this.in = in;
	}

}