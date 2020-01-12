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
		setTitle("����¼�����");
		getContentPane().add(tf,BorderLayout.NORTH);
		getContentPane().add(p,BorderLayout.CENTER);
		p.addMouseListener(this);//������
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX(); //��ȡx
		int y = e.getY(); //��ȡy
		tf.setText("���ģ�"+x+","+y+"��"+"�������");
		tf.setBackground(Color.red);
		b = new JLabel(new ImageIcon("images/52222.jpg"));
		getContentPane().add(b,BorderLayout.NORTH);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		int x = e.getX(); //��ȡx
		int y = e.getY(); //��ȡy
		tf.setText("���ģ�"+x+","+y+"��"+"�����롣");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		int x = e.getX(); //��ȡx
		int y = e.getY(); //��ȡy
		tf.setText("���ģ�"+x+","+y+"��"+"����ȥ��");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX(); //��ȡx
		int y = e.getY(); //��ȡy
		tf.setText("���ģ�"+x+","+y+"��"+"�����¡�");
		tf.setBackground(Color.yellow);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX(); //��ȡx
		int y = e.getY(); //��ȡy
		tf.setText("���ģ�"+x+","+y+"��"+"���ͷš�");
		tf.setBackground(Color.blue);
	}

	public static void main(String[] args) {
		TestMouse f= new TestMouse();
		f.setVisible(true);
		f.setSize(300,300);
		

	}

}
