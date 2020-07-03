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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Test1 extends JFrame 	implements ActionListener{
	        JSplitPane jsp=new JSplitPane();
	        JSplitPane inner=new JSplitPane();
	    	JButton jb1;
	    	JPanel j;
	    	JLabel jl;
	    	JButton jb11;
	    	private int startX;  //��¼��갴��ʱ��λ��
	    	private int startY;
	    	private int endX;    //��¼����ͷ�ʱ��λ��
	    	private int endY;
	    	private int x;
	    	private int y;
	    	String ButtonType=""; //��¼��ť������
	        public Test1() {
	        	JPanel dialogPane = new JPanel();
	        	dialogPane.setLayout(new BorderLayout());
	        	setBounds(220,100,800,400);
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
	        	jl = new JLabel(new ImageIcon("images/11.jpg"));
	        	j.add(jl);
	        	return j;
	        }
	   private JPanel createButtonPanel() {
	    		//������ť���
	    		JPanel buttonPanel = new JPanel();
	    		jb11 = new JButton("�ύ");
	    		JButton jb2 = new JButton("ȡ��");
	    		JButton jb3 = new JButton("����");
	    		buttonPanel.add(jb11);
	    		buttonPanel.add(jb2);
	    		buttonPanel.add(jb3);
	    		jb11.addActionListener(this);
	    		jb11.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				if(ButtonType.equals("������Һѹ��")) {
	    					if(550<x&&x<562) {
	    						if(295<y&&y<314) {
	    							JOptionPane.showMessageDialog(jb11, "������");
	    						}
	    						else {
	    	    					JOptionPane.showMessageDialog(jb11, "����");
	    	    				}
	    					}
	    					else {
		    					JOptionPane.showMessageDialog(jb11, "����");
		    				}
	    				}else {
	    					JOptionPane.showMessageDialog(jb11, "����");
	    				}
	    			}
	    		});
	    		jb2.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				JOptionPane.showMessageDialog(jb2, "ȷ��ȡ��");
	    			}
	    		});
	    		jb3.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				JPanel ll = new JPanel();
	    				JLabel lll = new JLabel(new ImageIcon("images//11.jpg"));
	    				jsp.setLeftComponent(create());//��
	    			}
	    		});
	    		return buttonPanel;
	    	}
		private JPanel createDataPanel() {
			JPanel buttonPanel = new JPanel(new GridLayout(10,1));
			jb1 = new JButton("����",new ImageIcon("images//1.jpg"));
			JButton jb2 = new JButton("������������ɵ�",new ImageIcon("images//2.png"));
			JButton jb3= new JButton("����������ɵ�",new ImageIcon("images//3.jpg"));
			JButton jb4 = new JButton("������Һѹ��",new ImageIcon("images//4.jpg"));
			JButton jb5 = new JButton("��λ��ͨO�ͻ���",new ImageIcon("images//5.jpg"));
			JButton jb6 = new JButton("��λ��ͨY�ͻ���",new ImageIcon("images//6.jpg"));
			JButton jb7 = new JButton("˫����Һѹ��",new ImageIcon("images//7.jpg"));
			JButton jb8 = new JButton("Һ�ص���",new ImageIcon("images//8.jpg"));
			JButton jb9 = new JButton("Һѹ��",new ImageIcon("images//9.jpg"));
			JButton jb10 = new JButton("������",new ImageIcon("images//10.jpg"));
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
		new Test1();
	}
	public void actionPerformed(ActionEvent e) {
		ButtonType=e.getActionCommand();  //ȡ����ť���¼������ı�
		j.addMouseListener(new MouseAdapter(){ //ΪJPanelWorkOfDraw����������¼�
			public void mousePressed(MouseEvent e) {  //��갴��ʱִ�еĲ���
				startX=e.getX();  //��¼��갴��ʱ��λ��
				startY=e.getY();
				x = startX;
				y = startY;
				//System.out.println(x+""+y);
			}
			public void mouseReleased(MouseEvent e) {
				endX=e.getX();  //��¼����ͷ�ʱ��λ��
				endY=e.getY();
				if("����".equals(ButtonType)) { 
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//1.jpg")));
					ff.setBounds(endX-50,endY-50,100,100);	
		    }
				else if(ButtonType.equals("������������ɵ�")) {
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//2.png")));
					ff.setBounds(endX-50,endY-50,100,100);	
		    }
				else if(ButtonType.equals("����������ɵ�")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//3.jpg")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("������Һѹ��")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//4.jpg")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("��λ��ͨO�ͻ���")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//5.jpg")));
					ff.setBounds(endX-100,endY-50,200,100);	
				}
				else if(ButtonType.equals("��λ��ͨY�ͻ���")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//6.jpg")));
					ff.setBounds(endX-100,endY-50,200,100);	
				}
				else if(ButtonType.equals("˫����Һѹ��")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//7.jpg")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("Һ�ص���")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//8.jpg")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("Һѹ��")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//9.jpg")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
				else if(ButtonType.equals("������")){
					JLabel ff;
					j.add(ff = new JLabel(new ImageIcon("images//10.jpg")));
					ff.setBounds(endX-50,endY-50,100,100);	
				}
			}
		});
		
	}
}
