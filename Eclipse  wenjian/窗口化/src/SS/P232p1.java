package SS;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class P232p1 extends JFrame implements ActionListener {
	JButton b = new JButton("选项一");
	JButton b1 = new JButton("选项二");
	JButton b2 = new JButton("选项三");
	public P232p1() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);
		c.add(b1);
		c.add(b2);
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			JOptionPane.showMessageDialog(this, "这是选项一","选项一",JOptionPane.ERROR_MESSAGE);
			b.setVisible(false);}
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(this, "这是选项二","选项二",JOptionPane.ERROR_MESSAGE);
			b1.setVisible(false);}
		if(e.getSource()==b2) {
			JOptionPane.showMessageDialog(this, "这是选项三","选项三",JOptionPane.ERROR_MESSAGE);
			b2.setVisible(false);
		}
	}

	public static void main(String[] args) {
		P232p1 f = new P232p1();
		f.setVisible(true);
		f.setSize(300,300);

	}

}
