package SS;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class P232p1 extends JFrame implements ActionListener {
	JButton b = new JButton("ѡ��һ");
	JButton b1 = new JButton("ѡ���");
	JButton b2 = new JButton("ѡ����");
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
			JOptionPane.showMessageDialog(this, "����ѡ��һ","ѡ��һ",JOptionPane.ERROR_MESSAGE);
			b.setVisible(false);}
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(this, "����ѡ���","ѡ���",JOptionPane.ERROR_MESSAGE);
			b1.setVisible(false);}
		if(e.getSource()==b2) {
			JOptionPane.showMessageDialog(this, "����ѡ����","ѡ����",JOptionPane.ERROR_MESSAGE);
			b2.setVisible(false);
		}
	}

	public static void main(String[] args) {
		P232p1 f = new P232p1();
		f.setVisible(true);
		f.setSize(300,300);

	}

}
