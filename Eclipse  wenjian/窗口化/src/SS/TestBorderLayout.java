package SS;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestBorderLayout extends JFrame {
public TestBorderLayout(String title) {
	super(title);
	Container c = this.getContentPane();
	c.setLayout(new BorderLayout());
	JButton b = new JButton("东");
	JButton b1 = new JButton("西");
	JButton b2 = new JButton("南");
	JButton b3 = new JButton("北");
	JButton b4 = new JButton("中");
	c.add(b,BorderLayout.EAST);
	c.add(b1,BorderLayout.SOUTH);
	c.add(b2,BorderLayout.WEST);
	c.add(b3,BorderLayout.NORTH);
	c.add(b4,BorderLayout.CENTER);
	
}
	public static void main(String[] args) {
		TestBorderLayout f = new TestBorderLayout("TestBorderLayout");
		f.setSize(200,200);
		f.setVisible(true);

	}

}
