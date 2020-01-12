package SS;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestKey extends JFrame implements KeyListener {
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(10);
	String s = "";
	public TestKey() {
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(tf1);
		getContentPane().add(tf2);
		getContentPane().add(tf3);
		tf1.addKeyListener(this);
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		s+=e.getKeyChar();
		tf2.setText(s);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code=e.getKeyCode();
		//System.out.print(code);
		tf3.setText(e.getKeyText(code));
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestKey f = new TestKey();
		f.setVisible(true);
		f.setSize(300,300);
	}

}
