package com.briup.java_day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Student;

public class ObjectStreamTest {
	//所有对象都能序列化和反序列化，有些对象属性较多，所以不需要所有的都序列化：标号
	//所以不需要序列化的属性用transient：（临时的）修饰
	//如果属性是static也不能被序列化，因为static是属于类的
	public static void main(String[] args) throws IOException{
		writeObj();//序列化
		readObj();//反序列化
	}
	
	//将硬盘中或者通过网络接收的被序列化的对象读取到内存中，
	private static void readObj() throws IOException{
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream("doc/SerializeObj.txt"));
		try {
			//弄一个Student数组，迭代List，发现List对象也被序列化了
//			Student stu1 = (Student)ois.readObject();
//			Student stu2 = (Student)ois.readObject();
			List<Student> list  =(List<Student>)ois.readObject();
			for(Student stu:list){
				System.out.println(stu.toString());
			}
//			System.out.println(stu1.toString());
//			System.out.println(stu2.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(ois!=null){
				ois.close();
			}
		}
	}
	//对象的序列化：将内存中的对象持久化到硬盘或者通过网络发送
	private static void writeObj() throws IOException{
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		
		//需要序列化的对象，那么那个类就必须要实现Serializable接口
		Student stu1 = new Student("zhansan",20);
		Student stu2 = new Student("lisi",21);
		List<Student> list  =new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
//		FileOutputStream fos = null;
//		fos = new FileOutputStream("doc/rw.txt");
		oos = new ObjectOutputStream(new FileOutputStream("doc/SerializeObj.txt"));
		oos.writeObject(list);
//		oos.writeObject(stu2);
		oos.flush();//刷新
		
		if(oos!=null){
			oos.close();
		}
	}
}
