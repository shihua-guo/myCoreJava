package com.briup.java_day15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	private Container ContentPanel;
	private JTextField opTF;
	private JPanel btnsPanel;
	private JButton[] numBtns = new JButton[10];
	private JButton addBtn = new JButton("+");
	private JButton subBtn = new JButton("-");
	private JButton mulBtn = new JButton("*");
	private JButton divBtn = new JButton("/");
	private JButton eqlBtn = new JButton("=");
	private JButton pointBtn = new JButton(".");
	
	
	private boolean isOp = false;
	private String opValue = "";
	private String firstNum = "";
	public Calculator(){
		ContentPanel = getContentPane();
		ContentPanel.setLayout(new BorderLayout());
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		
	}
	public void init(){
		opTF = new JTextField();
		opTF.setHorizontalAlignment(JTextField.RIGHT);
		opTF.setEditable(false);
		//get button panel
		btnsPanel = new JPanel();
		btnsPanel.setLayout(new GridLayout(4,4));
		
		//realize the founction
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(firstNum != ""){
					eqlBtn.doClick();
				}
				isOp = true;
				opValue = "add";
				firstNum = opTF.getText();
			}
		});
		
		eqlBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BigDecimal firstNumBig = new  BigDecimal(firstNum);
				BigDecimal secondNumBig = new BigDecimal(opTF.getText());
				if(opValue=="add"){
					opTF.setText(firstNumBig.add(secondNumBig).toString());
				}
			}
		});
		for (int i = 0; i < numBtns.length; i++) {
			numBtns[i]  = new JButton(""+i);
			final int num = i;
			numBtns[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(!isOp){
						opTF.setText(opTF.getText()+num);
					}
					else{
						opTF.setText(""+num);//no local
						isOp = false;
					}
				}
			});
			if(i==0){
				continue;
			}
			btnsPanel.add(numBtns[i]);
			if(i==3){
				btnsPanel.add(addBtn);
			}
			if(i==6){
				btnsPanel.add(subBtn);
			}
			if(i==9){
				btnsPanel.add(mulBtn);
				btnsPanel.add(numBtns[0]);
				btnsPanel.add(pointBtn);
				btnsPanel.add(eqlBtn);
				btnsPanel.add(divBtn);
			}
		}
		ContentPanel.add(btnsPanel,BorderLayout.CENTER);
		
		
		ContentPanel.add(opTF,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new Calculator().setVisible(true);
	}
}
