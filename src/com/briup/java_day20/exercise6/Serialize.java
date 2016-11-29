package com.briup.java_day20.exercise6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Student;

public class Serialize {
	public static void main(String[] args) throws IOException {
//		write();
		new ReadSerialization().read();
		// 从文件读取

		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
		// System.out.println(list.get(2));
		// System.out.println(list.get(3));
		/*
		 * for(Student stu:list){ System.out.println(stu.toString()); }
		 */
	}

	public static void write() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("doc/a.txt"));
		List<Student> list = new ArrayList<Student>();
		String line = null;
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("doc/list.bak"));
		while (null != (line = br.readLine())) {
			String[] str = null;
			// System.out.println(line);
			str = line.split(":");
			list.add(new Student(str[1], Integer.parseInt(str[2])));
		}
		oos.writeObject(list);
		if (br != null) {
			br.close();
		}
		if (oos != null) {
			oos.close();
		}
	}
}

class ReadSerialization {
	public void read() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("doc/SocObject.txt"));
			List<Student> list = (ArrayList<Student>) ois.readObject();
			for (Student stu : list) {
				System.out.println("Read:"+stu.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if (ois != null) {
						ois.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
}
