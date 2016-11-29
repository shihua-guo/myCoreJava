package com.briup.java_day15.exercise;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AWTFrame extends JFrame{
	public AWTFrame(){
		init();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void init(){
		JFrame frame = new JFrame();
		BorderLayout bl = new BorderLayout(0, 0);
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(new JButton("+"));
		jp.add(new JButton("-"));
		frame.setLayout(bl);
		frame.add(jp);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new AWTFrame();
	}
}
