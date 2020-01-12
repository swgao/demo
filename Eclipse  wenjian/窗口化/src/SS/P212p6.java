package SS;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P212p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		Container c = jf.getContentPane();
		c.setLayout(new FlowLayout());
		JLabel t = new JLabel("sadaf");
		t.getColorModel();
		jf.setVisible(true);
		jf.add(t);
	}

}
