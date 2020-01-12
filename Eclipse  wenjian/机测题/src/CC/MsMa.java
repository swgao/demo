package CC;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MsMa extends JFrame implements ActionListener{
	        JSplitPane jsp=new JSplitPane();
	        JSplitPane inner=new JSplitPane();
	    	JButton jb1;
	    	JPanel j;
	    	JLabel jl;
	    	JButton jb11;
	    	JMenuBar mb=new JMenuBar();
	    	JMenu mChoose,mDo;
	    	JMenuItem mi1st,mi2nd,mi3rd,miComponent,miLine;
	    	private int startX;  //记录鼠标按下时的位置
	    	private int startY;
	    	private int endX;    //记录鼠标释放时的位置
	    	private int endY;
	    	private int x,x1;
	    	private int y,y1;
	    	String ButtonType=""; //记录按钮的类型
	        public MsMa() {
	        	setTitle("液压设计练习题");
	        	setJMenuBar(mb);
	        	mChoose=new JMenu("选题");
	        	mDo=new JMenu("做题");
	        	mb.add(mChoose);
	        	mb.add(mDo);
	        	mi1st=new JMenuItem("第一题");
	        	mi2nd=new JMenuItem("第二题");
	        	mi3rd=new JMenuItem("第三题");
	        	mChoose.add(mi1st);
	        	mChoose.add(mi2nd);
	        	mChoose.add(mi3rd);
	        	mi1st.addActionListener(this);
	        	mi2nd.addActionListener(this);
	        	mi3rd.addActionListener(this);
	        	miComponent=new JMenuItem("添加元件");
	        	miLine=new JMenuItem("连线");
	        	mDo.add(miComponent);
	        	mDo.add(miLine);
	        	miComponent.addActionListener(this);
	        	miLine.addActionListener(this);
	        	JPanel dialogPane = new JPanel();
	        	dialogPane.setLayout(new BorderLayout());
	        	setBounds(200,50,800,400);
	    		dialogPane.setLayout(new BorderLayout());
	    		setContentPane(dialogPane);
	    		inner.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
	    		jsp.setOneTouchExpandable(true);
	    		jsp.setResizeWeight(0.8);
	    		dialogPane.add(inner,BorderLayout.CENTER);
	    		jsp.setOrientation(JSplitPane.VERTICAL_SPLIT);
	    		inner.setRightComponent(jsp);
	    		jsp.setRightComponent(createButtonPanel());//下
	    		jsp.setLeftComponent(create());//上
	    		inner.setLeftComponent(createDataPanel());//左
			    setVisible(true);
			    pack();   
	    }
	        
	   private JPanel create() {
	        j = new JPanel();        	
	        jl = new JLabel(new ImageIcon("images/112.png"));
	        j.add(jl);
	        return j;
	   }
	   
	   private JPanel createButtonPanel() {
	    		//创建按钮面板
	    		JPanel buttonPanel = new JPanel();
	    		jb11 = new JButton("提交");
	    		//final JButton jb2 = new JButton("取消");
	    		final JButton jb3 = new JButton("重做");
	    		buttonPanel.add(jb11);
	    		jb11.addActionListener(this);
	    		//buttonPanel.add(jb2);
	    		buttonPanel.add(jb3);
	    		
	    		jb11.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    					if(ButtonType.equals("单作用液压缸")) {
	    						if(380<x&&x<400 && 510<y&&y<530) {
	    							JOptionPane.showMessageDialog(jb11, "做对了");
	    						}else {
	    	    					JOptionPane.showMessageDialog(jb11, "错了");
	    	    				}
	    					}
	    					else {
		    					JOptionPane.showMessageDialog(jb11, "错了");
		    				}
	    				}
	    			});
	    		
	    		/*jb2.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				JOptionPane.showMessageDialog(jb2, "确定取消");
	    			}
	    		});*/
	    		jb3.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				JPanel ll = new JPanel();
	    				JLabel lll = new JLabel(new ImageIcon("images//112.png"));
	    				jsp.setLeftComponent(create());//上
	    			}
	    		});
	    		return buttonPanel;
	    	}
		private JPanel createDataPanel() {
			JPanel buttonPanel = new JPanel(new GridLayout(5,2,5,5));
			jb1 = new JButton("油箱",new ImageIcon("images//1.png"));
			JButton jb2 = new JButton("单向节流阀不可调",new ImageIcon("images//2.png"));
			JButton jb3= new JButton("单向节流阀可调",new ImageIcon("images//3.png"));
			JButton jb4 = new JButton("单作用液压缸",new ImageIcon("images//4.png"));
			JButton jb5 = new JButton("三位四通O型换向阀",new ImageIcon("images//5.png"));
			JButton jb6 = new JButton("三位四通Y型换向阀",new ImageIcon("images//6.png"));
			JButton jb7 = new JButton("双作用液压缸",new ImageIcon("images//7.png"));
			JButton jb8 = new JButton("液控单向阀",new ImageIcon("images//8.png"));
			JButton jb9 = new JButton("液压泵",new ImageIcon("images//9.png"));
			JButton jb10 = new JButton("溢流阀",new ImageIcon("images//10.png"));
			buttonPanel.add(jb1);
			buttonPanel.add(jb2);
			buttonPanel.add(jb3);
			buttonPanel.add(jb4);
			buttonPanel.add(jb5);
			buttonPanel.add(jb6);
			buttonPanel.add(jb7);
			buttonPanel.add(jb8);
			buttonPanel.add(jb9);
			buttonPanel.add(jb10);
			jb1.addActionListener(this);
			jb2.addActionListener(this);
			jb3.addActionListener(this);
			jb4.addActionListener(this);
			jb5.addActionListener(this);
			jb6.addActionListener(this);
			jb7.addActionListener(this);
			jb8.addActionListener(this);
			jb9.addActionListener(this);
			jb10.addActionListener(this);
			return buttonPanel;
		}

	public static void main(String[] args) {
		new MsMa();
	}
	public void actionPerformed(ActionEvent e) {
		
		ButtonType=e.getActionCommand();  //取出按钮的事件命令文本
		j.addMouseListener(new MouseAdapter(){ //为JPanelWorkOfDraw添加鼠标监听事件
			public void mousePressed(MouseEvent e) {  //鼠标按下时执行的操作
				startX=e.getX();  //记录鼠标按下时的位置
				startY=e.getY();
				x = startX;
				y = startY;
				System.out.println(x+""+y);
			}
			public void mouseReleased(MouseEvent e) {
				endX=e.getX();  //记录鼠标释放时的位置
				endY=e.getY();
				x1 = endX;
				y1 = endY;
				if("油箱".equals(ButtonType)) { 
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//1.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
		    }
				else if(ButtonType.equals("单向节流阀不可调")) {
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//2.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
		    }
				else if(ButtonType.equals("单向节流阀可调")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//3.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("单作用液压缸")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//4.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("三位四通O型换向阀")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//5.png")));
					ff.setBounds(endX-100,endY-50,200,100);	
				}
				else if(ButtonType.equals("三位四通Y型换向阀")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//6.png")));
					ff.setBounds(endX-100,endY-50,200,100);	
				}
				else if(ButtonType.equals("双作用液压缸")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//7.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("液控单向阀")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//8.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("液压泵")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//9.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("溢流阀")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//10.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("连线")){
					j.getGraphics().drawLine(startX, startY, startX, endY);
					j.getGraphics().drawLine(startX,endY,endX,endY);
				}
			}
		});
		
	}
	
}