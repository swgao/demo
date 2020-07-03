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
	    	private int startX;  //��¼��갴��ʱ��λ��
	    	private int startY;
	    	private int endX;    //��¼����ͷ�ʱ��λ��
	    	private int endY;
	    	private int x,x1;
	    	private int y,y1;
	    	String ButtonType=""; //��¼��ť������
	        public MsMa() {
	        	setTitle("Һѹ�����ϰ��");
	        	setJMenuBar(mb);
	        	mChoose=new JMenu("ѡ��");
	        	mDo=new JMenu("����");
	        	mb.add(mChoose);
	        	mb.add(mDo);
	        	mi1st=new JMenuItem("��һ��");
	        	mi2nd=new JMenuItem("�ڶ���");
	        	mi3rd=new JMenuItem("������");
	        	mChoose.add(mi1st);
	        	mChoose.add(mi2nd);
	        	mChoose.add(mi3rd);
	        	mi1st.addActionListener(this);
	        	mi2nd.addActionListener(this);
	        	mi3rd.addActionListener(this);
	        	miComponent=new JMenuItem("���Ԫ��");
	        	miLine=new JMenuItem("����");
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
	    		jsp.setRightComponent(createButtonPanel());//��
	    		jsp.setLeftComponent(create());//��
	    		inner.setLeftComponent(createDataPanel());//��
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
	    		//������ť���
	    		JPanel buttonPanel = new JPanel();
	    		jb11 = new JButton("�ύ");
	    		//final JButton jb2 = new JButton("ȡ��");
	    		final JButton jb3 = new JButton("����");
	    		buttonPanel.add(jb11);
	    		jb11.addActionListener(this);
	    		//buttonPanel.add(jb2);
	    		buttonPanel.add(jb3);
	    		
	    		jb11.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    					if(ButtonType.equals("������Һѹ��")) {
	    						if(380<x&&x<400 && 510<y&&y<530) {
	    							JOptionPane.showMessageDialog(jb11, "������");
	    						}else {
	    	    					JOptionPane.showMessageDialog(jb11, "����");
	    	    				}
	    					}
	    					else {
		    					JOptionPane.showMessageDialog(jb11, "����");
		    				}
	    				}
	    			});
	    		
	    		/*jb2.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				JOptionPane.showMessageDialog(jb2, "ȷ��ȡ��");
	    			}
	    		});*/
	    		jb3.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				JPanel ll = new JPanel();
	    				JLabel lll = new JLabel(new ImageIcon("images//112.png"));
	    				jsp.setLeftComponent(create());//��
	    			}
	    		});
	    		return buttonPanel;
	    	}
		private JPanel createDataPanel() {
			JPanel buttonPanel = new JPanel(new GridLayout(5,2,5,5));
			jb1 = new JButton("����",new ImageIcon("images//1.png"));
			JButton jb2 = new JButton("������������ɵ�",new ImageIcon("images//2.png"));
			JButton jb3= new JButton("����������ɵ�",new ImageIcon("images//3.png"));
			JButton jb4 = new JButton("������Һѹ��",new ImageIcon("images//4.png"));
			JButton jb5 = new JButton("��λ��ͨO�ͻ���",new ImageIcon("images//5.png"));
			JButton jb6 = new JButton("��λ��ͨY�ͻ���",new ImageIcon("images//6.png"));
			JButton jb7 = new JButton("˫����Һѹ��",new ImageIcon("images//7.png"));
			JButton jb8 = new JButton("Һ�ص���",new ImageIcon("images//8.png"));
			JButton jb9 = new JButton("Һѹ��",new ImageIcon("images//9.png"));
			JButton jb10 = new JButton("������",new ImageIcon("images//10.png"));
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
		
		ButtonType=e.getActionCommand();  //ȡ����ť���¼������ı�
		j.addMouseListener(new MouseAdapter(){ //ΪJPanelWorkOfDraw����������¼�
			public void mousePressed(MouseEvent e) {  //��갴��ʱִ�еĲ���
				startX=e.getX();  //��¼��갴��ʱ��λ��
				startY=e.getY();
				x = startX;
				y = startY;
				System.out.println(x+""+y);
			}
			public void mouseReleased(MouseEvent e) {
				endX=e.getX();  //��¼����ͷ�ʱ��λ��
				endY=e.getY();
				x1 = endX;
				y1 = endY;
				if("����".equals(ButtonType)) { 
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//1.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
		    }
				else if(ButtonType.equals("������������ɵ�")) {
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//2.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
		    }
				else if(ButtonType.equals("����������ɵ�")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//3.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("������Һѹ��")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//4.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("��λ��ͨO�ͻ���")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//5.png")));
					ff.setBounds(endX-100,endY-50,200,100);	
				}
				else if(ButtonType.equals("��λ��ͨY�ͻ���")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//6.png")));
					ff.setBounds(endX-100,endY-50,200,100);	
				}
				else if(ButtonType.equals("˫����Һѹ��")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//7.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("Һ�ص���")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//8.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("Һѹ��")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//9.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("������")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//10.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("����")){
					j.getGraphics().drawLine(startX, startY, startX, endY);
					j.getGraphics().drawLine(startX,endY,endX,endY);
				}
			}
		});
		
	}
	
}