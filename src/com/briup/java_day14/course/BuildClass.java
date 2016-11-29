package com.briup.java_day14.course;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class BuildClass {
	public static void main(String[] args) throws Exception{
		String className = "com.briup.bean.Student";
		BuildClass bc = new BuildClass();
		bc.create(className);
	}
	public void create(String className)throws Exception{
		Class<?> c = Class.forName(className);
		System.out.println(c.getName());
		System.out.println(c.getPackage()+";"); //get package
		
		System.out.println( getModifier(c)+" class"+" Student{");//get modifier
		getField(c);//get field
		getMethod(c);
		System.out.println("}");
		
	}
	public <T> String getModifier(T c){
		int modifier = 0;
		//judge which type is c
		if(c instanceof Class){
			modifier = ((Class<?>) c).getModifiers();
		}
		else if(c instanceof Field){
			modifier = ((Field) c).getModifiers();
		}
		else if(c instanceof Method){
			modifier = ((Method) c).getModifiers();
		}
		
		//judge which type of modifier
		if (modifier==1){
			return "public";
		}
		else if(modifier==2){
			return "private";
		}
		else if(modifier==4){
			return "protected";
		}
		else if(modifier==8){
			return "static";
		}
		else if(modifier==16){
			return "final";
		}
		else if(modifier==1024){
			return "abstract";
		}
		else if(modifier==17){
			return "public final";
		}
		else if(modifier==1025){
			return "public abstract";
		}
		return null;
	}
	public void getParameter(Method m){
		Parameter[] p = m.getParameters();
		for(Parameter parameter : p){
			System.out.print( getType(parameter.getType().toString()) );
//			if(!parameter.isNamePresent()) {
//	           throw new IllegalArgumentException("Parameter names are not present!");
//			}
		}
	}
	public void getMethod(Class<?> c){
		Method[] m = c.getDeclaredMethods();
		for(Method tmpM : m){
			String str = tmpM.getReturnType().toString();
			System.out.print(getModifier(tmpM)+" "+getType(str)+" "+tmpM.getName()+"(");
			getParameter(tmpM);
			System.out.println(")"+"{"+"}");
		}
	}
	public void getField(Class<?> c){
		Field[] f = c.getDeclaredFields();
		for(Field tmpF : f){
			String str = tmpF.getType().toString();
			System.out.println(getModifier(tmpF)+" "+getType(str)+" "+tmpF.getName()+";");
		}
	}
	public String getType(String str){
		if (str.equals("class java.lang.String")){
			return "String";
		}
		else if(str.equals("class java.lang.Integer")){
			return "Integer";
		}
		else if(str.equals("class java.lang.Short")){
			return "Short";
		}
		else if(str.equals("class java.lang.Long")){
			return "Long";
		}
		else if(str.equals("class java.lang.Float")){
			return "Float";
		}
		else if(str.equals("class java.lang.Double")){
			return "Double";
		}
		return str;
	}
}
