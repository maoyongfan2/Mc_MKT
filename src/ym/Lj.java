package ym;
import javax.swing.*;


import com.android.ddmlib.IDevice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ht.Sph;
import java.lang.Thread;
public class Lj extends JFrame implements ActionListener,Runnable
{
	JMenuItem beginMenuItem,initMenuItem,aboutMenuItem,exitMenuItem;
	JMenu fileMenu,systemMenu;
	JMenuBar mbar;
	JLabel jL1,jL2,jL3,jL4,jL5;
	JButton jB1,jB2;
	JTextField jF1;
	JPasswordField jP1;
	JDialog dialog;
	Container container;
	Thread thread;
	int cd;
	int i;
	static Lj w2=new Lj();
	public Lj()
	{
		super("Monkey Test Tool");
	}
	public  void gz()
	{
		beginMenuItem = new JMenuItem("monkey1.1");
		
		initMenuItem=new JMenuItem("作者：@Mx_yf");
		
		aboutMenuItem=new JMenuItem("问题反馈");
		aboutMenuItem.addActionListener(this);
		
		exitMenuItem=new JMenuItem("退出");
		exitMenuItem.addActionListener(this);
		
		fileMenu =new JMenu("版本信息");
		
		systemMenu=new JMenu("系统");
		
		mbar = new JMenuBar();
		
		fileMenu.add(beginMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(initMenuItem);
		
		systemMenu.add(aboutMenuItem);
		systemMenu.addSeparator();
		systemMenu.add(exitMenuItem);
		
		mbar.add(systemMenu);//systemMenu
		mbar.add(fileMenu);
		
		setJMenuBar(mbar);
		
		jL1=new JLabel("请检测手机是否已连接  :");
		jL1.setBounds(80, 120, 180, 30);
		
		jB1=new JButton("开始检测");
		jB1.setBounds(300,120,100,30);
		jB1.addActionListener(this);
		
		
		container=getContentPane();
		container.setLayout(null);
		
		container.add(jL1);
		container.add(jB1);
		
		setSize(500,400);
		setVisible(true);		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==exitMenuItem)
		{
			System.exit(0);
		}
		else if(e.getSource()==jB1)
		{
			jB1.setText("正在检测中.....");
			i=i+1;
			Xs p1=new Xs();
			int x=p1.db();  
			if(x!=0) 
			{
				p1.setBounds(0,0,500,400);
				container.removeAll();
				container.add(p1);
				container.repaint();  
			}
			jB1.setText("开始检测");
		}
		if(e.getSource()==aboutMenuItem)
		{
		container.removeAll();
		container.repaint();  
		}


		
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub


	}
}