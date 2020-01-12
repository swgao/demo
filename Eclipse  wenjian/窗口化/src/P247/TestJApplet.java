package P247;

import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TestJApplet extends JApplet implements ActionListener {
	JButton btok = new JButton("确定");
	JButton btcancel = new JButton("取消");
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
			JOptionPane.showMessageDialog(this, "你点击了确定按钮");
		if(e.getSource()==btcancel)
			JOptionPane.showMessageDialog(this, "你点击了取消按钮");
	}

}
