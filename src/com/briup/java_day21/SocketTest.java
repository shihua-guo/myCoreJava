package com.briup.java_day21;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {
	public static void main(String[] args) {
		Socket client = null;
		try {
			// 创建一个socket对象
			String localHost = "127.0.0.1";
			client = new Socket(localHost, 8888);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (client != null) {
					client.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
