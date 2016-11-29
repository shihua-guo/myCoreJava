package com.briup.java_day18.exercise.exercise2;

import java.io.IOException;
import java.io.InputStream;

import com.briup.bean.Student;

public class StudentInfo {
	public Student createStu(InputStream in) throws IOException {
		System.out.println("请输入学生姓名:");
		byte[] b = new byte[64];
		int len = in.read(b);
		Student stu1 = new Student();
		stu1.setName(new String(b,0,len-2));
		System.out.println("请输入学生年龄:");
		len = in.read(b);
		stu1.setAge(Integer.valueOf( (new String(b,0,len-2) ) ));
		return stu1;
	}
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		Student[] stu = new Student[10];
		StudentInfo info = new StudentInfo();
		stu[0] =info.createStu(in);
		/*Student stu1 = new Student();
		
		System.out.println("请输入学生姓名:");
		byte[] b = new byte[64];
		int len = in.read(b);
		stu1.setName(new String(b,0,len-2));
		System.out.println("请输入学生年龄:");
		len = in.read(b);
		stu1.setAge((int)Integer.valueOf( (new String(b,0,len-2) ) ));*/
		System.out.println(stu[0].getName());
		System.out.println(stu[0].getAge());
		System.out.println("是否继续添加:1继续 2退出:1");
		int i=1;
		int ifQiut=0;
		while(50!=(ifQiut=in.read())){
			in.read();//clear the enter
			in.read();//clear the return 
//			System.out.println(ifQiut);
			stu[i] =info.createStu(in);
			System.out.println(stu[i].toString());
			System.out.println("是否继续添加:1继续 2退出:1");
		}
	}
}
