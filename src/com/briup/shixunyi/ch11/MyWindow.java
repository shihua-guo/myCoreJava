package com.briup.shixunyi.ch11;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyWindow  extends JFrame{
	public static void main(String[] args) {
		MyWindow mw = new MyWindow();
		mw.init();
	}
	//属性定义，组件定义
	public Container containerPanel = new Container();//添加容器
	public JTextArea outPutJTextArea = new JTextArea();//输出的文本框
	public JTextArea inPutJTextArea = new JTextArea();//输入的文本框
	public JButton sentButton = new JButton("Sent");//发送按钮
	public MyWindow(){//构造器
		setResizable(false);
		containerPanel = getContentPane();//获取容器
		containerPanel.setLayout(null);//设置布局：border布局
		setSize(500,525);//设置窗口大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);//设置关闭按钮功能
		init();//各种初始化
		setVisible(true);
	}
	public void init(){
		containerPanel.add(outPutJTextArea);//容器中加入输出文本框
		containerPanel.add(inPutJTextArea);//容器中加入输入文本框
		containerPanel.add(sentButton);//容器中加入发送按钮
		outPutJTextArea.setEditable(false);//设置输出窗口不可编辑
		outPutJTextArea.setLineWrap(true);
		inPutJTextArea.setLineWrap(true);
		//outPutJTextArea.setHorizontalAlignment()
		//sentJPanel.setLayout(new BorderLayout());//发送画板设置为flow布局
		outPutJTextArea.setBounds(0,0,495,400);//设置输出文本的位置和大小
		inPutJTextArea.setBounds(0,401,420,100);//设置输入文本的位置和大小
		sentButton.setBounds(421, 401, 80, 99);//设置发送按钮的位置和大小
		
		//sent按钮监听器
		/*
		sentButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				outPutJTextArea.setText(getDateTime()+"  "+inPutJTextArea.getText());
			}
		});
		*/
	}
	/*
	public String getDateTime(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");  
		 Calendar starttime=Calendar.getInstance();  
		 String time=dateFormat.format(starttime.getTime());  
		 return time;
	}
	*/

}
