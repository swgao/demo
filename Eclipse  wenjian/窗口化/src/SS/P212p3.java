package SS;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class P212p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		Container cp = jf.getContentPane();
		cp.setLayout(new BorderLayout(6, 6));
		JButton bt = new JButton("��");
		JButton bt1 = new JButton("��");
		JButton bt2 = new JButton("��");
		JButton bt3 = new JButton("��");
		JButton bt4 = new JButton("��");
		cp.add(bt,BorderLayout.EAST);
		cp.add(bt1,BorderLayout.SOUTH);
		cp.add(bt2,BorderLayout.WEST);
		cp.add(bt3,BorderLayout.NORTH);
		cp.add(bt4,BorderLayout.CENTER);
		jf.setVisible(true);
		jf.pack();
	}

}
