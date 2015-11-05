package ym;



import java.awt.*;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Package extends JFrame implements ActionListener,ItemListener
{
	JButton button;
	JLabel jL1,jL2,jL3,jL4,jL5,jL6,jL7,jL8,jL9,jL10,jL11,jL12,jL13,jL14,jL15,jL16,jL17,jL18;
	JTextField jT1,jT2,jT3,jT4,jT5,jT6,jT7,jT8,jT9,jT10,jT11,jT12;
	JCheckBox[] jc=new JCheckBox[5];  
	JComboBox jc1; 							
	String[]  level={"简略","一般","详细"};
	String pag="";  									
	String lei="";									
	String xiuxi="";                                
	String seed="";                               
	String touch="";                             
	String motion="";                          
	String trackball="";					  
	String nav="";                            
	String majornav="";                   
	String syskeys="";                  
	String appswitch="";                
	String anyevent="";                
	String dengji=" -v ";                 
	String forceclose="";               	
	String anr="";                          
	String security="";					
	String killprocess="";                                   
	String nativecrashes="";				
	String content;

    public String getTitle() {return "CheckBoxDemo";}
    static private final Dimension size = new Dimension(800,900);
    public Dimension getPreferredSize() {return size;}
    public Dimension getMaximumSize() {return size;}
    public Dimension getMinimumSize() {return size;}
    public Dimension getSize(){return size;}
    final private java.util.List<String> stringList=new ArrayList<String>(500);     
    final private java.util.List<String> stringList2=new ArrayList<String>(500);
    private class CheckAction extends AbstractAction
    {   	 
        private CheckAction(String name)
        {
            super(name);  //使显示多选框的文本
        }
        public void actionPerformed(ActionEvent e) 
        {
            Object obj=e.getSource();
            if (obj instanceof JToggleButton)
            {
                JToggleButton t = (JToggleButton)obj;
 
                if(t.isSelected())
                {
                	pag="monkey ";  
                    stringList.add("-p "+t.getText());
                }
                else
                {
                	pag="monkey ";
                    stringList.remove("-p "+t.getText());
                }
            }
            int x=0;
            for (String s:stringList) 
            {
				 pag+=s+" ";
				 x++;
            }
        }
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    private class CheckAction2 extends AbstractAction
    {   	 
        private CheckAction2(String name)
        {
            super(name);  
        }
        public void actionPerformed(ActionEvent e) 
        {
            Object obj=e.getSource();
            if (obj instanceof JToggleButton)
            {
                JToggleButton t = (JToggleButton)obj;
 
                if(t.isSelected())
                {
                	lei=" ";
                    stringList2.add("-c "+t.getText());
                }
                else
                {
                	lei=" ";
                    stringList2.remove("-c "+t.getText());
                }
            }
            int x=0;
            for (String s:stringList2)
            {
				 lei+=s+" ";
				 x++;
            }
        }
    }
    
    
	public Package()
	{
		int x=0;
		jL1=new JLabel("日志输出等级:");
		jL1.setBounds(30,10,150,40);
		jL1.setFont(new Font("宋体",Font.BOLD,15));
		
		jc1=new JComboBox(level);
		jc1.addItemListener(this);
		jc1.setBounds(140,20,100,20);
		
		jL2=new JLabel("执行次数:");
		jL2.setBounds(260, 10,150,40);
		jL2.setFont(new Font("宋体",Font.BOLD,15));
		
		jT1=new JTextField("20000");
		jT1.setBounds(340,20,70,20);
		
		jL5=new JLabel("休眠时间:");
		jL5.setBounds(430,10,100,40);
		jL5.setFont(new Font("宋体",Font.BOLD,15));		
		jT2=new JTextField("200");
		jT2.setBounds(510, 20,70, 20);
		
		jL6=new JLabel("相同事件:");  //   seed
		jL6.setBounds(600,10,100,40);
		jL6.setFont(new Font("宋体",Font.BOLD,15));		
		jT3=new JTextField("50");
		jT3.setBounds(680,20,70,20);
		
		jL3=new JLabel("请选择要测试的包：");
		jL3.setBounds(30,55,150,40);
		jL3.setFont(new Font("宋体",Font.BOLD,15));
				
		JPanel p1 = new JPanel(new GridLayout(x/2,2));
		JPanel p2=new JPanel(new GridLayout(x/2,1));  
				
		
		jL4=new JLabel("请选择类:");
		jL4.setBounds(30, 325,150, 40);
		jL4.setFont(new Font("宋体",Font.BOLD,15));
		
		jL7=new JLabel("触摸事件:");    
		jL7.setBounds(550,80,85,40);		
		jT4=new JTextField("40");
		jT4.setBounds(650,90,55,20);
		
		jL8=new JLabel("手势事件:");     
		jL8.setBounds(550,110,85,40);		
		jT5=new JTextField("10");
		jT5.setBounds(650,120,55,20);
		
		jL9=new JLabel("轨迹事件:");   
		jL9.setBounds(550,140,85,40);		
		jT6=new JTextField("10");
		jT6.setBounds(650,150,55,20);
		
		jL10=new JLabel("导航事件:");    
		jL10.setBounds(550,170,85,40);		
		jT7=new JTextField("10");
		jT7.setBounds(650,180,55,20);
		
		jL11=new JLabel("启动活动:");     
		jL11.setBounds(550,200,90,40);		
		jT8=new JTextField("0");
		jT8.setBounds(650,210,55,20);
		
		jL12=new JLabel("系统按键事件:");  
		jL12.setBounds(550,230,90,40);		
		jT9=new JTextField("10");
		jT9.setBounds(650,240,55,20);
		
		jL13=new JLabel("主导航事件:");   
		jL13.setBounds(550,260,90,40);		
		jT10=new JTextField("10");
		jT10.setBounds(650,270,55,20);
		
		jL14=new JLabel("其他类型事件:"); 
		jL14.setBounds(550,290,90,40);		
		jT11=new JTextField("10");
		jT11.setBounds(650,300,55,20);
		
		jL15=new JLabel("设置事件百分比："); 
		jL15.setBounds(540,55,130,40);
		jL15.setFont(new Font("宋体",Font.BOLD,15));
		
		jL16=new JLabel("调试：");
		jL16.setBounds(540,325,90,40);
		jL16.setFont(new Font("宋体",Font.BOLD,15));
		
		
		jc[0]=new JCheckBox("屏蔽force close");
		jc[0].setBounds(550,360,120,20);
		jc[0].addItemListener(this);
		
		jc[1]=new JCheckBox("屏蔽ANR");
		jc[1].setBounds(550,390,120,20);
		jc[1].addItemListener(this);
		
		jc[2]=new JCheckBox("屏蔽安全许可异常");
		jc[2].setBounds(550,420,150,20);
		jc[2].addItemListener(this);
		
		jc[3]=new JCheckBox("错误时停止进程");
		jc[3].setBounds(550,450,150,20);
		jc[3].addItemListener(this);
		
		jc[4]=new JCheckBox("监视本地代码异常");
		jc[4].setBounds(550, 480,150, 20);
		jc[4].addItemListener(this);
		
		button=new JButton("开始测试");
		button.setBounds(350,520,120,30);
		button.addActionListener(this);

        ScrollPane scrp = new ScrollPane(); 
        try {
                FileReader filereader = new FileReader("C:/Monkey/package.txt");
                BufferedReader in = new BufferedReader(filereader);
                while (true) {
                    String line = in.readLine();
                    if (line != null) {
                        String o=Integer.toString(x);
                        
                        p1.add(new JCheckBox(new CheckAction(line)));
                    } else
                        break;
                }
            } catch (java.io.IOException e) {
            }
        scrp.add(p1);   
        ScrollPane scrp2 = new ScrollPane(); 
        try {
                FileReader filereader = new FileReader("C:/Monkey/category.txt");
                BufferedReader in = new BufferedReader(filereader);
                while (true) {
                    String line = in.readLine();
                    if (line != null) {
 
                        
                        p2.add(new JCheckBox(new CheckAction2(line)));
                    } else
                        break;
                }
            } catch (java.io.IOException e) {
            }
        scrp2.add(p2);
        
        Container winContainer=this.getContentPane();  			
																						
        																			  
        scrp.setBounds(30, 90, 500, 240);								//80, 220, 370, 100
        																				
        scrp2.setBounds(30,360,500,145);
        
        winContainer.add(scrp);
        winContainer.add(scrp2);
        winContainer.add(button);
        winContainer.add(jL1);
        winContainer.add(jL2);
        winContainer.add(jL3);
        winContainer.add(jL4);
        winContainer.add(jL5);
        winContainer.add(jL6);
        winContainer.add(jL7);
        winContainer.add(jL8);
        winContainer.add(jL9);
        winContainer.add(jL10);
        winContainer.add(jL11);
        winContainer.add(jL12);
        winContainer.add(jL13);
        winContainer.add(jL14);
        winContainer.add(jL15);
        winContainer.add(jL16);
        winContainer.add(jT1);
        winContainer.add(jT2);
        winContainer.add(jT3);
        winContainer.add(jT4);
        winContainer.add(jT5);
        winContainer.add(jT6);
        winContainer.add(jT7);
        winContainer.add(jT8);
        winContainer.add(jT9);
        winContainer.add(jT10);
        winContainer.add(jT11);
        winContainer.add(jc[0]);
        winContainer.add(jc[1]);
        winContainer.add(jc[2]);
        winContainer.add(jc[3]);
        winContainer.add(jc[4]);
        winContainer.add(jc1);
        winContainer.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public String zhixing()
	{		
		int num=Integer.parseInt(jT1.getText());
		if(jT2.getText().equals("")==false)			
			xiuxi="--throttle "+jT2.getText();
		if(jT3.getText().equals("")==false)
			seed=" -s "+jT3.getText();
		if(jT4.getText().equals("")==false)
			touch=" --pct-touch "+jT4.getText();
		if(jT5.getText().equals("")==false)
			motion=" --pct-motion "+jT5.getText();
		if(jT6.getText().equals("")==false)
			trackball=" --pct-trackball "+jT6.getText();
		if(jT7.getText().equals("")==false)
			nav=" --pct-nav "+jT7.getText();
		if(jT8.getText().equals("")==false)
			appswitch=" --pct-appswitch "+jT8.getText();
		if(jT9.getText().equals("")==false)
			syskeys=" --pct-syskeys "+jT9.getText();
		if(jT10.getText().equals("")==false)
			majornav=" --pct-majornav "+jT10.getText();
		if(jT11.getText().equals("")==false)
			anyevent=" --pct-anyevent "+jT11.getText();
		
		try {
			Runtime.getRuntime().exec("cmd /c adb kill-server");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Runtime.getRuntime().exec("cmd /c adb start-server");
			try {
				Thread.sleep(2000);//2000
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String mn="cmd.exe /c adb  shell  " +pag+lei+xiuxi+seed+touch+motion+trackball+nav+majornav+syskeys+appswitch+anyevent+
					forceclose+anr+security+killprocess+nativecrashes+dengji+num+">c:\\Monkey\\log.txt";
			Runtime.getRuntime().exec(mn);
			try {
				Thread.sleep(2000);//2000
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();				
		}  
		return "over";
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(button.getText().toString().equals("开始测试"))
			button.setText("正在测试");
		else
			button.setText("开始测试");
		
		// TODO Auto-generated method stub
		if(e.getSource()==button)
		{
			String a=zhixing();
			xiuxi="";
			seed="";
			touch="";
			motion="";                                  
			trackball="";					            
			nav="";                             			
			majornav="";                    
			syskeys="";                   
			appswitch="";               
			anyevent="";   
			
			
			
		}

	}
	/**
	 * @param args
	 */
	@Override
	public void itemStateChanged(ItemEvent e)   
	{
		// TODO Auto-generated method stub
		int number=jc1.getSelectedIndex();  
		if(number==1)
			dengji=" -v-v ";
		else if(number==2)
			dengji=" -v-v-v ";
		else if(number==0)
			dengji=" -v ";
		if(jc[0].isSelected())
			forceclose=" --ignore-crashes ";
		else
				forceclose="";
		if(jc[1].isSelected())
			anr=" --ignore-timeouts ";
		else
			anr="";
		if(jc[2].isSelected())
			security=" --ignore-security-exceptions ";
		else
			security="";
		if(jc[3].isSelected())
			killprocess=" --kill-process-after-error ";
		else
			killprocess="";
		if(jc[4].isSelected())
			nativecrashes=" --monitor-native-crashes ";
		else
			nativecrashes="";
			
			
		
	}
}
