package SS;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class  CC extends JFrame{
	public CC(String title) {
		super(title);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
		JButton b = new JButton("JButton");
		JButton b1 = new JButton("JButton1");
		JButton b2 = new JButton("JButton2");
		JButton b3 = new JButton("JButton3");
		c.add(b);
		c.add(b1);
		c.add(b2);
		c.add(b3);
	}
	public static void main(String[] args) {
		CC s = new CC("Jbutton");
		s.setSize(500,500);
		s.setVisible(true);
		s.pack();
	}
}
