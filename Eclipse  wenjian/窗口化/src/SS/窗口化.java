package SS;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Container;
public class ���ڻ� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("�ӷ�������");
		Container c = frame.getContentPane();//����һ������
		c.setLayout(new FlowLayout());//���ò��֣����Ӳ��ֻ���Ĭ�ϲ��֣��Ḳ��ǰ��Ķ���
		frame.setVisible(true);//���ô���Ŀ�����
		frame.setSize(100, 100);//���ô���Ĵ�С
		frame.setLocation(200, 200);//���ô���ĳ�ʼλ��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رյ�ʱ���˳�����������п���
		JTextField tf1 = new JTextField(5);
		JLabel lb = new JLabel("+");//�����ؼ���JLbel��JButton��JTexitField��etc��
		JTextField tf2 = new JTextField(5);
		JButton bt = new JButton("=");
		JTextField tf3 = new JTextField(5);
		tf3.setEnabled(false);//�ؼ��Ŀɱ༭��
		c.add(tf1);//���ؼ���ӵ�������
		c.add(lb);
		c.add(tf2);
		c.add(bt);
		c.add(tf3); 
		frame.pack();//ѹ��������İѿؼ�����һ��
		}

}

