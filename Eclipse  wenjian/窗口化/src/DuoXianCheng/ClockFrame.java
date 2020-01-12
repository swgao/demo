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
		lblock.setFont(new Font("����",Font.BOLD,50));
		lblock.setForeground(Color.blue);
		getContentPane().add(lblock);
		setLocationRelativeTo(null);//����
		setUndecorated(true);//����ʾ�߿�
		pack();
		addMouseListener(new MouseAdapter() { //���������˫���˳�����
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�գ�hhʱ:mm��:ss.SSS��");//��дhh��24���͵ģ���дmm���·ݣ���дss�Ǻ���
		return sdf.format(new Date());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockFrame f = new  ClockFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
		
	}

}
