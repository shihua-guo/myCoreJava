package com.briup.java_day12.exercise.exercise1;

import java.util.Arrays;

public class ArrayList implements List{
	private Object[] arr;
	private int index;
	private boolean ifIterator;//judge if this list iterating
	public ArrayList(){
		arr = new Object[10]; 
		index = 0;
		ifIterator = false;
	}
	@Override
	public void add(Object num) {
		// TODO Auto-generated method stub
		if(ifIterator){
			System.out.println("Adding Forbidened Now is Iteratong");
			return ;
		}
		else if(index >= arr.length){//if outOfBound then new a bigger array
			Object[] tempArr = new Object[2*arr.length];
			for (int i = 0; i < arr.length; i++) {//store the old array to new one
				tempArr[i] = arr[i];
			}
			arr = tempArr;
		}
		arr[index++] = num;//add the new num		
	}
	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		if(ifIterator){
			System.out.println("Removing Forbidened Now is Iteratong");
			return -1;
		}
		else if(isIndexError(index)){//judge if index error
			System.out.println("Index error");
			return -1;
		}
		Object removeOne = arr[index];//store the remove one
		for (int i = index-1; i < arr.length-1; i++) {//move the rest element
			arr[i] = arr[i+1];
		}
		this.index--;//decease the index
		return removeOne;
	}
	@Override
	public Object set(int index, int num) {
		// TODO Auto-generated method stub
		if(isIndexError(index)){//judge if index error
			System.out.println("Index error");
			return -1;
		}
		Object changeOne = arr[index];//store the change one
		arr[index] = num;//modifier the new one
		return changeOne;
	}
	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		if(isIndexError(index)){//judge if index error
			System.out.println("Index error");
			return -1;
		}
		return arr[index-1];
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return index;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (index==0){
			return true;
		}
		return false;
	}
	
	public boolean isIndexError(int index){
		if(index > arr.length || index <= 0){//judge if index error
			return true;
		}
		return false;
	}
	public IteratorImpl iterator(){
		ifIterator = true;
		return new IteratorImpl(index,arr);
	}
	@Override
	public String toString() {
		return "ArrayList [arr=" + Arrays.toString(arr) + ", index=" + index + "]";
	} 
	
}
