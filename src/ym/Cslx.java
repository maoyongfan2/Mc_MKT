package ym;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Cslx extends JPanel implements ActionListener
{
	JLabel jL0,jL1,jL2,jL3,jL4,jL5;
	JButton jB1,jB2,jB3;
	public Cslx()
	{
		this.setLayout(null);
		lx();
	}
	public void lx()
	{
		jL0=new JLabel("��ѡ����Է�ʽ��");
		jL0.setBounds(20, 20, 150,30);
		jL0.setFont(new Font("����",Font.BOLD,16));
		jL1=new JLabel("ģ�����");
		jL1.setBounds(80, 60, 150, 50);
		jL1.setFont(new Font("����",Font.BOLD,20));
		jL1.setForeground(Color.BLUE);
		jB1=new JButton("����");
		jB1.addActionListener(this);
		jB1.setBounds(320,70,90,30);
		jL2=new JLabel("���ɲ���");
		jL2.setBounds(80,140,150,50);
		jL2.setFont(new Font("����",Font.BOLD,20));
		jL2.setForeground(Color.BLUE);		
		jB2=new JButton("��ʼ����");
		jB2.setBounds(320, 150, 90, 30);
		jL3=new JLabel("����Բ���");
		jL3.setBounds(80,230,150,50);
		jL3.setFont(new Font("����",Font.BOLD,20));
		jL3.setForeground(Color.BLUE);	
		jB3=new JButton("��ʼ����");
		jB3.setBounds(320, 240, 90, 30);
		this.add(jL0);
		this.add(jL1);
		this.add(jB1);
		this.add(jL2);
		this.add(jB2);
		this.add(jL3);
		this.add(jB3);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jB1)
		{
			Lj.w2.setVisible(false);
			Package pag=new Package();
			pag.setSize(800,600);
			pag.setVisible(true);
			
		}
		
	}
	
}
