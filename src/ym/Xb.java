package ym;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Xb extends JPanel implements ActionListener
{
	JLabel jL1,jL2;
	JCheckBox[] jC=new JCheckBox[2]; 
	public Xb()
	{
		setLayout(null);
		xz();
	}
	public void xz()
	{
		jL1=new JLabel("请选择测试项目：") ;
		jL1.setBounds(15,20,150,30);
		jC[0]=new JCheckBox("短信");
		jC[0].setBounds(40,70,100,30);
		jC[0].addActionListener(this);
		jC[1]=new JCheckBox("电话");
		jC[1].setBounds(140, 70, 100, 30);
		jC[1].addActionListener(this);
		this.add(jL1);
		this.add(jC[0]);
		this.add(jC[1]);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
}