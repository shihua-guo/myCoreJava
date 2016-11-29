package com.briup.ch06;

public class MyMap {
	private Object[] key;
	private Object[] value;
	private int max;
	private int index;
	
	
	public MyMap(){
		key = new Object[10];
		value = new Object[10];
		max=10;
		index = 0;
	}
	public void put(Object key,Object value){
		if(index>=max){
			Object[] tempV = new Object[max*2];
			System.arraycopy(value,0,tempV,0,max);
			
			Object[] tempK = new Object[max*2];
			System.arraycopy(value,0,tempK,0,max);
			max*=2;
		}
		this.key[index] = key;
		this.value[index] = value;
		index++;
	}
	public String entrySet(){
		return "["+key[index-1]+","+value[index-1]+"]";
	}
	public static void main(String[] args) {
		MyMap mm = new MyMap();
		mm.put(1, 1);
		mm.put(1, 1);
		mm.put(1, 1);
		System.out.println(mm.entrySet());
		System.out.println();
		
	}
	
	interface Entry{
		Object getKey();
		Object getValue();
	}
	
	class EntryImpl implements Entry{

		@Override
		public Object getKey() {
			// TODO Auto-generated method stub
			return key[index];
		}

		@Override
		public Object getValue() {
			// TODO Auto-generated method stub
			return value[index];
		}
		
	}
}
