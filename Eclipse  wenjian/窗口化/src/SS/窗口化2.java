package SS;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class 窗口化2 {
	public static void main(String[] args) {
JFrame f = new JFrame("M");
Container c = f.getContentPane();
c.setLayout(new FlowLayout());

f.setVisible(true);
f.setSize(100,100);
JTextField jf = new JTextField(5);
Button d = new Button("确定");
Button d1 = new Button("取消");
f.setLocation(100,100);
f.add(d);
f.add(jf);
f.add(d1);
f.pack();
}
}