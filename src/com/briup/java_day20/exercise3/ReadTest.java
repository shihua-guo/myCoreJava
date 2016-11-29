package com.briup.java_day20.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
//		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("doc/a.txt"));
			pw = new PrintWriter(new FileWriter("doc/aDes.txt"));
			String line = null;
			String str1 = "*****  ******";
			String str2 = "　　核心提示：第十二任台湾地区领导人选举今日举行"
					+ "，马萧(马英九、萧万长)竞选总部统计宣称已获得超过700万张选票，自行宣布当选。";
			while( null!=(line=br.readLine())){
				if(str1.equals(line)){
					line = str2;
				}
				/*System.out.println(line);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				pw.write(line);
				pw.println();
				pw.flush();
			}
					
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				try {
					if(br!=null){
						br.close();
					}
					if(pw!=null){
						pw.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
}
