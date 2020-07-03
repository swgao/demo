package SS;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class P211p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		Container cp= jf.getContentPane();
		cp.setLayout(new FlowLayout());
		jf.setVisible(true);
		JButton bt = new JButton("Button1");
		JButton bt1 = new JButton("Button2");
		JButton bt2 = new JButton("Button3");
		jf.add(bt);
		jf.add(bt1);
		jf.add(bt2);
		jf.pack();
	}

}
