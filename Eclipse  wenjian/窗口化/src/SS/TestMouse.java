package SS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestMouse extends JFrame implements MouseListener {
	JTextField tf = new JTextField();
	JPanel p = new JPanel();
	JLabel b;
	public TestMouse() {
		setTitle("鼠标事件测试");
		getContentPane().add(tf,BorderLayout.NORTH);
		getContentPane().add(p,BorderLayout.CENTER);
		p.addMouseListener(this);//监听器
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX(); //获取x
		int y = e.getY(); //获取y
		tf.setText("鼠标的（"+x+","+y+"）"+"处点击。");
		tf.setBackground(Color.red);
		b = new JLabel(new ImageIcon("images/52222.jpg"));
		getContentPane().add(b,BorderLayout.NORTH);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		int x = e.getX(); //获取x
		int y = e.getY(); //获取y
		tf.setText("鼠标的（"+x+","+y+"）"+"处进入。");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		int x = e.getX(); //获取x
		int y = e.getY(); //获取y
		tf.setText("鼠标的（"+x+","+y+"）"+"处出去。");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX(); //获取x
		int y = e.getY(); //获取y
		tf.setText("鼠标的（"+x+","+y+"）"+"处按下。");
		tf.setBackground(Color.yellow);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX(); //获取x
		int y = e.getY(); //获取y
		tf.setText("鼠标的（"+x+","+y+"）"+"处释放。");
		tf.setBackground(Color.blue);
	}

	public static void main(String[] args) {
		TestMouse f= new TestMouse();
		f.setVisible(true);
		f.setSize(300,300);
		

	}

}
