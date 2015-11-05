package ym;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Zym extends JFrame implements ActionListener
{
	
	JMenuItem beginMenuItem,initMenuItem,aboutMenuItem,exitMenuItem;
	JMenu fileMenu,systemMenu;
	JMenuBar mbar;
	JLabel jL1,jL2,jL3;
	JButton jB1,jB2;
	JTextField jF1;
	JPasswordField jP1;
	Container container;
	JFrame f=new JFrame();
	public Zym()
	{
		super("用户登录");

		jL1=new JLabel("用户名称 :");
		jL1.setBounds(50, 50, 60, 30);
		
		jL2=new JLabel("登陆密码 :");
		jL2.setBounds(50, 90, 60, 30);
		
		jF1=new JTextField("",20);      
		jF1.setBounds(150,55,120,23);
		
		jP1=new JPasswordField("",20); 
		jP1.setBounds(150, 95, 120, 23); 
		
		jB1=new JButton("确定");
		jB1.setBounds(55,160,60,30);
		jB1.addActionListener(this);
		
		jB2=new JButton("退出");
		jB2.setBounds(210, 160, 60, 30);
		jB2.addActionListener(this);
		
		jL3=new JLabel("");
		jL3.setBounds(80, 210, 200, 30);
		
		container=this.getContentPane();
		container.setLayout(null);
		
		container.add(jL1);
		container.add(jL2);
		container.add(jL3);
		container.add(jF1);
		container.add(jP1);
		container.add(jB1);
		container.add(jB2);
		
		setSize(340,285);
		this.setVisible(true);		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==exitMenuItem)
		{
			System.exit(0);
		}
		if(e.getSource()==jB1)
		{
			if(jF1.getText().equals("Mx_yf")&&jP1.getText().equals("Aa123456"))
			{
				Lj.w2.gz();
				setVisible(false);
			}
			else
				jL3.setText("请输入正确的用户名与密码！");
		}
		if(e.getSource()==jB2)
		{                                                                
			int an=JOptionPane.showConfirmDialog(this,"你确定退出吗？","信息提示",0,2);
			if(an==0)
				System.exit(0);
		}
	}

}