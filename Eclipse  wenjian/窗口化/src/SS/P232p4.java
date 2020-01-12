package SS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class P232p4 extends JFrame implements ActionListener {
	JPanel jp = new JPanel();
	JButton b = new JButton("改变面板颜色");
	public P232p4() {
	Container c = this.getContentPane();
	c.setLayout(new BorderLayout());
	jp.setBackground(Color.RED);
	c.add(jp);
	c.add(b,BorderLayout.SOUTH);
	b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a = r.nextInt(256);
		int v = r.nextInt(256);
		int d = r.nextInt(256);
		if(e.getSource()==b)
			jp.setBackground(new Color(a,v,d));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P232p4 f = new P232p4();
		f.setVisible(true);
		f.setSize(300,300);
	}

}
