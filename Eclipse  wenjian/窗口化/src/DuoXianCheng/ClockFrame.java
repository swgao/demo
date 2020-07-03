package DuoXianCheng;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockFrame extends JFrame {
	JLabel lblock = null;
	public ClockFrame() {
		lblock = new JLabel(getDate());
		lblock.setFont(new Font("宋体",Font.BOLD,50));
		lblock.setForeground(Color.blue);
		getContentPane().add(lblock);
		setLocationRelativeTo(null);//居中
		setUndecorated(true);//不显示边框
		pack();
		addMouseListener(new MouseAdapter() { //用这个方法双击退出程序
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2)
					System.exit(0);
				
			}
		});
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					lblock.setText(getDate());
				}
				
			}
		}).start();;
		
	}
	
	private String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日，hh时:mm分:ss.SSS秒");//大写hh是24类型的，大写mm是月份，大写ss是毫秒
		return sdf.format(new Date());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockFrame f = new  ClockFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
		
	}

}
