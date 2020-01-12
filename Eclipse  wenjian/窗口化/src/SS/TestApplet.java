package SS;
/*
 *<applet code=TestApplet width=300 height=300></applet>
 **/
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestApplet extends JApplet implements KeyListener {
	int x,y;
	JPanel p;
	public void init() {
		JTextField t = new JTextField(7);
		Container cp =this.getContentPane();
		p = new JPanel();
		cp.add(t,BorderLayout.NORTH);
		cp.add(p);
		t.addKeyListener(this);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()=='X'||e.getKeyChar()=='x')
			System.exit(0);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int c = e.getKeyChar();
		System.out.println((char)c);
		if(c>=48 && c<=57)
			p.setBackground(Color.black);
		else
			p.setBackground(Color.yellow);
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		p.setBackground(Color.red);
		repaint();

	}
	
}
