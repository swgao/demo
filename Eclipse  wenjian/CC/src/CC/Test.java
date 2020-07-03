package CC;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Test extends JFrame implements ActionListener {
	        JButton b1=new JButton("Ԫ��һ");
	        JButton b2=new JButton("ԭ����");
	        JButton b3=new JButton("ʾ��ͼ");
	        JButton b4=new JButton("Cancel");
	        JButton b5=new JButton("Cancel");
	        JPanel j1=new JPanel();
	        JPanel j2=new JPanel();
	        JPanel j3=new JPanel();
	        JSplitPane jsp=new JSplitPane();
	        JSplitPane inner=new JSplitPane();
	        
	        public Test() {
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
	    		jsp.setLeftComponent(createButtonPanel());//��
	    		inner.setLeftComponent(createDataPanel());//��
		        j1.add(b1);
		        j1.add(b2);
		        j2.add(b3);
		        j2.add(b4);
		        j3.add(b5);
			    setVisible(true);
			    pack();   
	    }
	   private JPanel createButtonPanel() {
	    		//������ť���
	    		JPanel buttonPanel = new JPanel();
	    		JButton jb1 = new JButton("�ύ");
	    		JButton jb2 = new JButton("ȡ��");
	    		JButton jb3 = new JButton("����");
	    		buttonPanel.add(jb1);
	    		buttonPanel.add(jb2);
	    		buttonPanel.add(jb3);
	    		return buttonPanel;
	    	}
		private JPanel createDataPanel() {
			JPanel dataPanel = new JPanel(null);
			JButton jl_id = new JButton(new ImageIcon("image/1.jpg"));//�����û���ű�ǩ
			jl_id.setBounds(50,20,100,25);//��������λ�ø���С
			dataPanel.add(jl_id);
			//�����û�����ǩ
			JLabel jl_name = new JLabel("�û�����");
			jl_name.setBounds(50,60,100,25);
			dataPanel.add(jl_name);
			//���������ǩ
			JLabel jl_passl = new JLabel("���룺");
			jl_passl.setBounds(50,100,100,25);
			return dataPanel;
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Test();
	}

}
