package P247;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Mypanel extends JFrame implements ActionListener, ItemListener {
	private JMenuItem jmiClear,jmiExit,jmiEraser;
	private JRadioButtonMenuItem jrbmiBlue,jrbmiYellow,jrbmiRed;
	Color c = new Color(255,0,0);
	int x,y;
	int clear = 0;
	int con = 3;
	Mypanel2  p1;
	public Mypanel() {
		setTitle("我的小小画板");
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);
		JMenu fileMenu = new JMenu("清楚方式",false);
		JMenu OptionMenu = new JMenu("选择画笔",true);
		jmb.add(fileMenu);
		jmb.add(OptionMenu);
		fileMenu.add(jmiEraser = new JMenuItem("橡皮"));
		fileMenu.add(jmiClear = new JMenuItem("清楚"));
		fileMenu.addSeparator();
		fileMenu.add(jmiExit = new JMenuItem("退出"));
		JMenu color = new JMenu("颜色");
		OptionMenu.add(color);
		color.add(jrbmiBlue = new JRadioButtonMenuItem("蓝色"));
		color.add(jrbmiYellow = new JRadioButtonMenuItem("黄色"));
		color.add(jrbmiRed = new JRadioButtonMenuItem("红色"));
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrbmiBlue);
		btg.add(jrbmiYellow);
		btg.add(jrbmiRed);
		p1 = new Mypanel2();
		this.getContentPane().add(p1,BorderLayout.CENTER);
		jmiEraser.addActionListener(this);
		jmiClear.addActionListener(this);
		jmiExit.addActionListener(this);
		jrbmiBlue.addItemListener(this);
		jrbmiYellow.addItemListener(this);
		jrbmiRed.addItemListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Graphics g =getGraphics();
		if(e.getSource()==jmiEraser) 
			c = getBackground();
		else if(e.getSource()==jmiClear)
			clear = 1;
		else if(e.getSource()==jmiExit)
			System.exit(0);
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() instanceof JRadioButtonMenuItem) {
			if(jrbmiBlue.isSelected())
				c = new Color(0,0,255);
			if(jrbmiYellow.isSelected())
				c = new Color(0,255,0);
			if(jrbmiRed.isSelected())
				c = new Color(255,0,0);
		}

	}
public class Mypanel2 extends JPanel implements MouseMotionListener {
		public Mypanel2() {
			// TODO Auto-generated constructor stub
			this.addMouseMotionListener(this);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			Graphics g = getGraphics();
			if(c==getBackground())
			{
				g.setColor(getBackground());
				g.fillOval(e.getX()-(20/2), e.getY()-(20/2), 20, 20);
			}else {
				g.setColor(c);
				x = (int)e.getX();
				y = (int)e.getY();
				g.fillOval(x, y, con,con);
			}
			if(clear==1) {
				g.clearRect(0, 0, getSize().width, getSize().height);
				clear = 0;
			}
			g.dispose();
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {

		}
		}
public static void main(String[] args)
		{
			Mypanel f = new Mypanel();
			f.setVisible(true);
			f.setSize(300,300);
		}
}