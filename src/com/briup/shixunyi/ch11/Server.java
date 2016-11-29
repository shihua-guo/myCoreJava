package com.briup.shixunyi.ch11;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args){
		ServerSocket server = null;//这个应该是用于接受客户端发来信息的
		try {
			server = new ServerSocket(8888);//new一个端口和client一致的
		} catch (IOException e) {//抛出异常
			// TODO Auto-generated catch block
			try {
				server = new ServerSocket(9999);//如果端口被占用，更换999端口
			} catch (IOException ioe) {
				// TODO Auto-generated catch block
				System.out.println("error");//如果再次被占用，放弃
			}
		}
		while(true){//线程死循环，占用资源少，用于发送数据
			try {//有异常继续抛出
				Socket socket  = server.accept();//server用accept方法返回一个和clientsocket对象链接的socket对象
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());//把socket接受的流包装成osi
				String str = null;//
				try {
					str = (String)ois.readObject();//把ois接受的流转换为String，并用str来存放
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(str);//输出流
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject("client client i am server");
				oos.flush();
				//oos.close();//流不关闭，要不只能接受一次，且会提示管道被破坏
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}

class SocketThread2 extends Thread{//使用线程用于死循环，占用资源少
	Socket socket;
	public void run(String strInput,String strOutput){
		try {
			strInput = socket.getInputStream().toString();
			strOutput = socket.getOutputStream().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
