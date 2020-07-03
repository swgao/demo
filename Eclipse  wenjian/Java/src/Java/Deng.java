package Java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Deng extends PublicJFrame implements ActionListener{
	
	private JTextField ming;
	private JPasswordField mi;
	private JButton login,close;
	
	public Deng(){
		getContentPane().setLayout(new FlowLayout());
		JLabel ming1 = new JLabel("�û���");
		ming = new JTextField(10);
		JPanel j = new JPanel();
		j.add(ming1);
		j.add(ming);
		add(j);
		JLabel mi1 = new JLabel("����");
		mi = new JPasswordField(10);
		JPanel j1 = new JPanel();
		j1.add(mi1);
		j1.add(mi);
		add(j1);
		JPanel j2 = new JPanel();
		login = new JButton("��½");
		close = new JButton("ȡ��");
		j2.add(login);
		j2.add(close);
		add(j2);
		login.addActionListener(this);
		close.addActionListener(this);
		setSize(300,300);
		setLocationRelativeTo(null);//����λ�þ���
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = ming.getText().trim();
		String pass = mi.getText().trim();
		
		if(e.getSource()==login) {
			if(name.equals("")||pass.equals("")) {
				JOptionPane.showMessageDialog(this, "����Ϊ��");
				
			}
		User user = UserDao.getUser(name,pass);
		if(user!=null) {
			//����������
			GlobalVar.login_user = user;
			new MainFrame();
			this.dispose();//�ͷŴ˽���
			
		}
		else {
			JOptionPane.showMessageDialog(this, "�û������������");
			ming.setText("");
			mi.setText("");
		}
		}
		if(e.getSource()==close) {
			JOptionPane.showMessageDialog(this, "���Ѿ�ȡ����ε�½");
			ming.setText("");
			mi.setText("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  new Deng();
	}
	

}