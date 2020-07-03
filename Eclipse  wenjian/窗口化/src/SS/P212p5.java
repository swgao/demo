package SS;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class P212p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		Container c = jf.getContentPane();
		c.setLayout(new GridLayout(3, 3));
		JButton bt = new JButton("1");
		JButton bt1 = new JButton("2");
		JButton bt2= new JButton("3");
		JButton bt3 = new JButton("4");
		JButton bt4 = new JButton("5");
		JButton bt5 = new JButton("6");
		JButton bt6 = new JButton("7");
		JButton bt7 = new JButton("8");
		JButton bt8 = new JButton("9");
		jf.setVisible(true);
		jf.add(bt);
		jf.add(bt1);
		jf.add(bt2);
		jf.add(bt3);
		jf.add(bt4);
		jf.add(bt5);
		jf.add(bt6);
		jf.add(bt7);
		jf.add(bt8);
		jf.pack();
	}

}
