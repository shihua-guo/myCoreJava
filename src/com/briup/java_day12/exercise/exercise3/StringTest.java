package com.briup.java_day12.exercise.exercise3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringTest {
	public void outputChar(String str){
		char[] ch = str.toCharArray();//convert a String to char[]
		char bracket1 = '[';//to store [
		char bracket2 = ']';//to store ]
		String patternOri = " ";//the pattern rule
		String pattern = bracket1+patternOri+bracket2;//Complete the pattern rule
		for (int i = 0; i < ch.length; i++) {//the for loop the char[]
			if( !Pattern.matches(pattern, ch[i]+"") ){//if not match any element of the pattern
				System.out.print(ch[i]+" ");//then print
				patternOri+=ch[i];//then add the char to the pattern
				pattern = bracket1+patternOri+bracket2;//Complete the pattern rule
			}
		}
		countString(ch, patternOri.toCharArray());
	}
	
	public void countString(char[] ch1, char[] ch2 ){
		for (int i = 0; i < ch2.length; i++) {
			int count=0;// set/reset the counter
			for (int j = 0; j < ch1.length; j++) {
				if(ch2[i]==ch1[j]){//count the char shows times
					count++;
				}
			}
			System.out.println(ch2[i]+":"+count+" times");
		}
		
	}
	public static void main(String[] args) {
		StringTest st = new StringTest();
		System.out.println("Inout a String");
		Scanner in = new Scanner(System.in);//receive the input
		String str = in.next();
		st.outputChar(str);
	}
}
