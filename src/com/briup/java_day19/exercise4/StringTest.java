package com.briup.java_day19.exercise4;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

public class StringTest {
	public static void main(String[] args) {
		String s = "hello world *tom* how are you?";
		ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes());
		System.out.println(in.markSupported());
		int data = 0;
		int index=0;
		while(-1!=(data = in.read())){
			index++;
			if(data!='*'){
				System.out.write(data);
				System.out.flush();
			}
			else if(data=='*'){
				in.mark(index);
//				System.out.println("data:"+(char)data);
				for(int i=0;i<3;i++){
					while( (data = in.read())!='*'){
						/*if(data==-1)
							break;*/
						System.out.write(data);
						System.out.flush();
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(i<2){
						in.reset();
						
					}
					
				}
//				in.read();
//				in.read();
//				in.read();
//				in.read();
			}
			
		}
	}
}
