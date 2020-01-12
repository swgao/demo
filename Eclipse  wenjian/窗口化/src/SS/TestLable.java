package SS;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestLable extends JFrame {
	private JLabel jlable1,jlable2,l;
	public TestLable() {
		setTitle("Testlable");
		jlable1= new JLabel("这是一个显示文本的标签");
		jlable2 = new JLabel(new ImageIcon("images/2.jpg"));
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jlable1);
		getContentPane().add(jlable2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLable frame = new TestLable();
		frame.setVisible(true);
		frame.pack();
	}

}
