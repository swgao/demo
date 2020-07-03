package SS;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Container;
public class 窗口化 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("加法计算器");
		Container c = frame.getContentPane();//创建一个容器
		c.setLayout(new FlowLayout());//设置布局，不加布局会有默认布局，会覆盖前面的东西
		frame.setVisible(true);//设置窗体的可视性
		frame.setSize(100, 100);//设置窗体的大小
		frame.setLocation(200, 200);//设置窗体的初始位置
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭的时候退出程序，这里可有可无
		JTextField tf1 = new JTextField(5);
		JLabel lb = new JLabel("+");//创建控件（JLbel，JButton，JTexitField，etc）
		JTextField tf2 = new JTextField(5);
		JButton bt = new JButton("=");
		JTextField tf3 = new JTextField(5);
		tf3.setEnabled(false);//控件的可编辑性
		c.add(tf1);//将控件添加到容器里
		c.add(lb);
		c.add(tf2);
		c.add(bt);
		c.add(tf3); 
		frame.pack();//压缩，整齐的把控件放在一起
		}

}

