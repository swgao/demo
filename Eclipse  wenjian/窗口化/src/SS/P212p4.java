package SS;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class P212p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		Container c = jf.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		JButton b = new JButton("��һ����ť");
		JButton b1 = new JButton("�ڶ�����ť");
		JButton b2 = new JButton("��������ť");
		JButton b3 = new JButton("���ĸ���ť");
		JButton b4 = new JButton("�������ť");
		JButton b5 = new JButton("�������һ����ť");
		c.add(b);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		jf.setVisible(true);
		jf.pack();
		jf.setSize(250, 200);
		jf.setLocation(800, 100);
	}

}
