package com.briup.java_day12.exercise.exercise1;

public class IteratorImpl implements Iterator{
	private int count;
	private int index;
	private Object[] arr;
	public IteratorImpl() {
		// TODO Auto-generated constructor stub
		count = 0;
	}
	public IteratorImpl(int index,Object[] arr) {
		// TODO Auto-generated constructor stub
		this.index = index;
		this.arr = arr;
		count = 0;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(count >= index){
			return false;
		}
		count++;
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(hasNext()){//return the current value
			return arr[count-1];
		}
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
