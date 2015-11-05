package ym;

import ht.Sph;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.android.ddmlib.IDevice;

class Xs extends JPanel implements ActionListener
{
	JLabel jL1,jL2,jL3,jL4,jL5,jL6;
	JButton jB1,jB2,jB3;
	int cd;
	String[] sz=new String[5];
	
	public Xs()
	{
		this.setLayout(null);
	}
	public int db()
	{
		IDevice[] id=Sph.a(Lj.w2.i);  
		for(int x=0;x<id.length;x++)
		{
			String temp=id[x].toString();
			sz[x]=temp;    
		}
		cd=id.length;
		if(cd==0)   
		{                                                                                                   
			int an=JOptionPane.showConfirmDialog(Lj.w2,"请连接手机 !","信息提示",0,2);
			if(an==0)
				System.exit(0);				
		}
		else if(cd==1)
		{
			jL1=new JLabel("设配 A  :");
			jL1.setBounds(100, 130, 50, 30);
			jL2=new JLabel(id[0].toString());
			jL2.setBounds(180,130,150,30);
			jB1=new JButton("进入");
			jB1.setBounds(360,130,80,30);
			jB1.addActionListener(this);
			this.add(jL1);
			this.add(jL2);
			this.add(jB1);			
		}
		else if(cd==2)
		{
			jL1=new JLabel("设配 A :");
			jL1.setBounds(100,60,50,30);//60
			jL2=new JLabel(id[0].toString());
			jL2.setBounds(180, 60, 150, 30);
			jB1=new JButton("进入");
			jB1.setBounds(360, 60, 80, 30);
			jB1.addActionListener(this);
			jL3=new JLabel("设配 B :");
			jL3.setBounds(100, 160, 50, 30);//160
			jL4=new JLabel(id[1].toString());
			jL4.setBounds(180,160,150,30);
			jB2=new JButton("进入");
			jB2.setBounds(360, 160, 80, 30);
			jB2.addActionListener(this);
			add(jL1);
			add(jL2);
			add(jL3);
			add(jL4);
			add(jB1);
			add(jB2);		
		}
		else if(cd==3)
		{
			jL1=new JLabel("设配 A :");
			jL1.setBounds(100,30,50,30);
			jL2=new JLabel(id[0].toString());
			jL2.setBounds(180, 30, 150, 30);
			jB1=new JButton("进入");
			jB1.setBounds(360, 30, 80, 30);
			jB1.addActionListener(this);
			jL3=new JLabel("设配 B :");
			jL3.setBounds(100, 130, 50, 30);
			jL4=new JLabel(id[1].toString());
			jL4.setBounds(180,130,150,30);
			jB2=new JButton("进入");
			jB2.setBounds(360, 130, 80, 30);
			jB2.addActionListener(this);
			jL5=new JLabel("设配 C :");
			jL5.setBounds(100, 230, 50, 30);
			jL6=new JLabel(id[2].toString());
			jL6.setBounds(180,230,150,30);
			jB3=new JButton("进入");
			jB3.setBounds(360, 230, 80, 30);
			jB3.addActionListener(this);
			add(jL1);
			add(jL2);
			add(jL3);
			add(jL4);
			add(jL5);
			add(jL6);
			add(jB1);
			add(jB2);		
			add(jB3);
		}
		return cd;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub	
		if(e.getSource()==jB1)
		{
			try {
				String mn="cmd.exe /k adb -s "+sz[0]+" shell getprop>D:\\Monkey\\temp.txt";
				Runtime.getRuntime().exec(mn);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Cslx p1=new Cslx();
			p1.setBounds(0,0,500,400);
			this.removeAll();
			this.add(p1);
			this.repaint();  
		}
		if(e.getSource()==jB2)
		{
			Cslx p1=new Cslx();
			p1.setBounds(0,0,500,400);
			this.removeAll();
			this.add(p1);
			this.repaint();  
		}
	}
}