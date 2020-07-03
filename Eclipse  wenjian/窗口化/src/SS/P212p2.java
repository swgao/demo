package SS;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class P212p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		Container a = jf.getContentPane();
		a.setLayout(new BorderLayout());
		JButton bt = new JButton("East");
		JButton bt1 = new JButton("West");
		jf.add(bt,BorderLayout.EAST);
		jf.add(bt1,BorderLayout.WEST);
		jf.setVisible(true);
		jf.pack();
	}

}
