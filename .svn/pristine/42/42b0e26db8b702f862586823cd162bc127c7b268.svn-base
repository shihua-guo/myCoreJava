package com.briup.java_day14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class AutoInvoke {  
    
    public  void  putValue(String name,Object value) throws Exception{  
	//补充代码
    	
    	Class c = this.getClass();
    	String methodName = "set"+name;
//		System.out.println(methodName);
    	System.out.println();
		if(value instanceof String){
			System.out.println("is String");
			Method m = c.getMethod(methodName, String.class);
			m.invoke(this, value);
		}
		else if(value instanceof Integer){
			Method m = c.getMethod(methodName, Integer.class);
			m.invoke(this, value);
		}
		else if(value instanceof java.util.Date){
			Method m = c.getMethod(methodName, java.util.Date.class);
			m.invoke(this, value);
		}
    }  
      
    public Object outValue(String name) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {  
	//补充代码      	
    	Class c = this.getClass();
    	String methodName = "get"+name.substring(0,1).toUpperCase()+name.substring(1);
    	Method m = c.getMethod(methodName);
        return m.invoke(this);  
    }  
}
