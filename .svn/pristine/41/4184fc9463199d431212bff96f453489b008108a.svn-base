package com.briup.java_day18.exercise.exercise2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import com.briup.bean.Student;

public class StudentInfo2 {
	private ArrayList<Student> stuList;
	private InputStream in;
	private OutputStream out;
	public StudentInfo2(){
		setStuList(new ArrayList<Student>());
		in = System.in;
		out = System.out;
	}
	public static void main(String[] args) throws IOException{
		StudentInfo2 sinfo = new StudentInfo2();
		
		boolean isOver = false;
		while(!isOver){
			/*out.write("请输入学生姓名:".getBytes());
//			out.flush();
			int len = in.read(b);
			String name = new String(b,0,len-2);
			System.out.println(name);
//			stu.setName(name);
			out.write("请输入学生年龄:".getBytes());
//			out.flush();
			len = in.read(b);
			int age= Integer.valueOf(new String(b,0,len-2));
//			stu.setAge(age);
			Student stu = new Student(name,age);
			System.out.println(stu.toString());*/
			
			sinfo.getStuList().add(sinfo.newStudent());
			sinfo.getOut().write("是否继续操作:1继续 2退出 3查询 4删除".getBytes());
//			out.flush();
			int op =sinfo.getIn().read();
			if(50==op){
				sinfo.getIn().read();sinfo.getIn().read();
				isOver = true;
			}
			else if(51==op){
				sinfo.getIn().read();sinfo.getIn().read();
				Student tmp = sinfo.findByName();
				System.out.println(tmp.toString());
			}
			else if(52==op){
				
				sinfo.getIn().read();sinfo.getIn().read();
			}
		}
	}
	public Student newStudent() throws IOException{
		byte[] b = new byte[64];
		out.write("请输入学生姓名:".getBytes());
		int len = in.read(b);
		String name = new String(b,0,len-2);
		System.out.println(name);
		out.write("请输入学生年龄:".getBytes());
		len = in.read(b);
		int age= Integer.valueOf(new String(b,0,len-2));
		Student stu = new Student(name,age);
		System.out.println(stu.toString());
		out.flush();
		return stu;
	}
	public Student findByName() throws IOException{
		byte[] b = new byte[64];
		out.write("请输入学生姓名:".getBytes());
		int len = in.read(b);
		String name = new String(b,0,len-2);
		for(Student tmp:stuList){
			if(tmp.getName().equals(name)){
				return tmp;
			}
		}
		System.out.println("no such sudent");
		return null;
	}
	public ArrayList<Student> getStuList() {
		return stuList;
	}
	public void setStuList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}
	public InputStream getIn() {
		return in;
	}
	public void setIn(InputStream in) {
		this.in = in;
	}
	public OutputStream getOut() {
		return out;
	}
	public void setOut(OutputStream out) {
		this.out = out;
	}
}
