package com.briup.java_day15.exercise;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AWTCombinationFrame extends JFrame{
	public AWTCombinationFrame(){
		init();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void init(){
		JFrame jf = new JFrame("AWTCombinationFrame");
		jf.setLayout(new BorderLayout());
		JPanel jp = new JPanel();
		JLabel jl = new JLabel();
		jl.setMinimumSize(new Dimension(400, 50));
		jl.setPreferredSize(new Dimension(400, 50));
		jl.setMinimumSize(new Dimension(400, 50));
//		jf.add(jl);
		jp.setLayout(new GridLayout(4, 3));
		for (int i = 0; i < 9; i++) {
				jp.add(new JButton( ""+(i+1) ));
			if(i==8){
				jp.add(new JButton("*"));
				jp.add(new JButton("0"));
				jp.add(new JButton("#"));
			}
			
		}
		jf.add(jl,BorderLayout.NORTH);
		jf.add(jp);
		jf.setSize(400, 300);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new AWTCombinationFrame();
	}
}
