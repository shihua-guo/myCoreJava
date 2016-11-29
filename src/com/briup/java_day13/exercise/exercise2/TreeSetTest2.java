package com.briup.java_day13.exercise.exercise2;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		
		@SuppressWarnings("unchecked")
		TreeSet treeSet = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Integer integer1 = (Integer) o1;
				Integer integer2 = (Integer) o2;
				if ( integer1%2!=0 ) {//jishu
					if ( integer2%2!=0 && integer1 < integer2 || integer2%2==0) {
						return -1;//qian
					}
					else if( integer2%2!=0 && integer1 > integer2){
						return 1;//hou
					}
				}
				else if( integer1%2==0 ){
					if (  integer2%2==0 && integer1 > integer2  ) {
						return -1;//qian
					}
					else if ( integer2%2==0 && integer1 < integer2 || integer2%2!=0) {
						return 1;//hou
					}
				}
				return 0;
			}
			
		});
//		treeSet.comparator();
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(9);
		treeSet.add(8);
		treeSet.add(7);
		treeSet.add(6);
		treeSet.add(5);
		treeSet.add(4);
		treeSet.add(10);
		treeSet.add(1);
		System.out.println(treeSet.toString());
	}
}
