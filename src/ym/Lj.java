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
		
		initMenuItem=new JMenuItem("���ߣ�@Mx_yf");
		
		aboutMenuItem=new JMenuItem("���ⷴ��");
		aboutMenuItem.addActionListener(this);
		
		exitMenuItem=new JMenuItem("�˳�");
		exitMenuItem.addActionListener(this);
		
		fileMenu =new JMenu("�汾��Ϣ");
		
		systemMenu=new JMenu("ϵͳ");
		
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
		
		jL1=new JLabel("�����ֻ��Ƿ�������  :");
		jL1.setBounds(80, 120, 180, 30);
		
		jB1=new JButton("��ʼ���");
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
			jB1.setText("���ڼ����.....");
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
			jB1.setText("��ʼ���");
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