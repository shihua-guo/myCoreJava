package com.briup.java_day13.exercise.exercise2;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author alan
 * @date 2016年8月15日 下午3:26:34
 */
public class TreeSetTest1 {
	public static void main(String[] args) {
		//anonymous
		//increase
		@SuppressWarnings("unchecked")
		TreeSet treeSet = new TreeSet(new Comparator()  {
			@Override
			public int compare(Object o1, Object o2){
				String str1 = (String) o1;
				String str2 = (String) o2;
				return str1.compareTo(str2);
			}
		});
		treeSet.add("HashSet");
		treeSet.add("ArrayList");
		treeSet.add("TreeMap");
		treeSet.add("HashMap");
		treeSet.add("TreeSet");
		treeSet.add("LinkedList");
		System.out.println(treeSet.toString());
		//decrease
		@SuppressWarnings("unchecked")
		TreeSet treeSet2 = new TreeSet(new Comparator(){
			@Override
			public int compare(Object o1, Object o2){
				String str1 = (String) o1;
				String str2 = (String) o2;
				return str2.compareTo(str1);
			}
		});
		treeSet2.add("HashSet");
		treeSet2.add("ArrayList");
		treeSet2.add("TreeMap");
		treeSet2.add("HashMap");
		treeSet2.add("TreeSet");
		treeSet2.add("LinkedList");
		System.out.println(treeSet2.toString());
		
		//static
		TreeSet treeSet3 = new TreeSet(new ComparatorImpl1());
		treeSet3.add("HashSet");
		treeSet3.add("ArrayList");
		treeSet3.add("TreeMap");
		treeSet3.add("HashMap");
		treeSet3.add("TreeSet");
		treeSet3.add("LinkedList");
		System.out.println(treeSet3.toString());
		
		treeSet3 = new TreeSet(new ComparatorImpl2());
		treeSet3.add("HashSet");
		treeSet3.add("ArrayList");
		treeSet3.add("TreeMap");
		treeSet3.add("HashMap");
		treeSet3.add("TreeSet");
		treeSet3.add("LinkedList");
		System.out.println(treeSet3.toString());
		
	}
	static class ComparatorImpl1 implements Comparator{
		//increase
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String str1 = (String) o1;
			String str2 = (String) o2;
			return str1.compareTo(str2);
		}
	}
	static class ComparatorImpl2 implements Comparator{
		//increase
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String str1 = (String) o1;
			String str2 = (String) o2;
			return str2.compareTo(str1);
		}
	}
}
