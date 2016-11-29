package com.briup.java_day18.exercise.exercise2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import com.briup.bean.Student;

public class StudentInfo3 {
	private ArrayList<Student> stuList;
	private InputStream in;
	private OutputStream out;
	public StudentInfo3(){
		setStuList(new ArrayList<Student>());
		in = System.in;
		out = System.out;
	}
	public static void main(String[] args) throws IOException{
		StudentInfo3 sinfo = new StudentInfo3();
		
		boolean isOver = false;
		sinfo.getStuList().add(sinfo.newStudent());
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
			sinfo.getOut().write("是否继续操作:1添加 2退出 3查询 4删除".getBytes());
//			out.flush();
			int op =sinfo.getIn().read();
			
			if(49==op){
				sinfo.getIn().read();sinfo.getIn().read();
				sinfo.getStuList().add(sinfo.newStudent());
			}
			else if(50==op){
				sinfo.getIn().read();sinfo.getIn().read();
				isOver = true;
			}
			else if(51==op){
				sinfo.getIn().read();sinfo.getIn().read();
				Student tmp = sinfo.findByName();
				if(tmp!=null){
					System.out.println(tmp.toString());
				}
				continue;
			}
			else if(52==op){
				sinfo.getIn().read();sinfo.getIn().read();
				sinfo.delStudent();
			}
		}
	}
	public Student newStudent() throws IOException{
		/*byte[] b = new byte[64];
		out.write("请输入学生姓名:".getBytes());
		int len = in.read(b);*/
		String name = inputName();
//		System.out.println(name);
		/*out.write("请输入学生年龄:".getBytes());
		len = in.read(b);
		int age= Integer.valueOf(new String(b,0,len-2));*/
		int age= inputAge();
		Student stu = new Student(name,age);
		System.out.println(stu.toString());
		out.flush();
		return stu;
	}
	public Student findByName() throws IOException{
		String name = inputName();
		for(Student tmp:stuList){
			if(tmp.getName().equals(name)){
				return tmp;
			}
		}
		System.out.println("no such sudent");
		return null;
	}
	public boolean delStudent() throws IOException{
		int i=0;
		for(Student tmp:stuList){
			if(tmp.getName().equals(inputName())){
				break;
			}
			i++;
		}
		if (i<stuList.size()) {
			System.out.println("删除：" + stuList.get(i).getName());
			stuList.remove(i);
			return true;
		}
		else {
			System.out.println("no such sudent");
			return false;
		}
	}
	public String inputName() throws IOException{
		byte[] b = new byte[64];
		out.write("请输入学生姓名:".getBytes());
		int len = in.read(b);
		return new String(b,0,len-2);
	}
	public int inputAge() throws IOException{
		byte[] b = new byte[64];
		out.write("请输入学生年龄:".getBytes());
		int len = in.read(b);
		return Integer.valueOf(new String(b,0,len-2));
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
