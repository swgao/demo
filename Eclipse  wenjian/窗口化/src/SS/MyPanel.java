package SS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		/*g.setFont(new Font("Euro Roman", Font.PLAIN, 20));//��������
		g.setColor(Color.red);
		g.drawString("Hello word", 100, 100);
		g.setColor(Color.red);
		g.drawLine(100, 100, 380, 300);
		g.setColor(Color.black);
		g.drawRect(100, 100, 280,200 );//��������
		g.setColor(Color.orange);
		g.drawOval(100, 100, 280, 200);//����Բ
		g.setColor(Color.blue);
		g.drawOval(100, 100, 280, 280);//��Բ
		g.setColor(Color.CYAN);
		g.drawRoundRect(90, 90, 300, 220, 20, 20); //��Բ������
		g.setColor(Color.red);
		g.draw3DRect(80, 80, 320, 240, true);
		g.clearRect(225, 185, 30, 30); //���ָ��λ��*/
		int [] x = {100,100,150,200,160};
		int [] y = {100,200,250,200,180};
		g.drawPolygon(x,y,5);//�������
	}
}
