package P247;

import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TestJApplet extends JApplet implements ActionListener {
	JButton btok = new JButton("ȷ��");
	JButton btcancel = new JButton("ȡ��");
	public void init() {
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setSize(100,100);
		getContentPane().add(btok);
		getContentPane().add(btcancel);
		btok.addActionListener(this);
		btcancel.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btok)
			JOptionPane.showMessageDialog(this, "������ȷ����ť");
		if(e.getSource()==btcancel)
			JOptionPane.showMessageDialog(this, "������ȡ����ť");
	}

}
