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
		JLabel ming1 = new JLabel("用户名");
		ming = new JTextField(10);
		JPanel j = new JPanel();
		j.add(ming1);
		j.add(ming);
		add(j);
		JLabel mi1 = new JLabel("密码");
		mi = new JPasswordField(10);
		JPanel j1 = new JPanel();
		j1.add(mi1);
		j1.add(mi);
		add(j1);
		JPanel j2 = new JPanel();
		login = new JButton("登陆");
		close = new JButton("取消");
		j2.add(login);
		j2.add(close);
		add(j2);
		login.addActionListener(this);
		close.addActionListener(this);
		setSize(300,300);
		setLocationRelativeTo(null);//设置位置居中
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = ming.getText().trim();
		String pass = mi.getText().trim();
		
		if(e.getSource()==login) {
			if(name.equals("")||pass.equals("")) {
				JOptionPane.showMessageDialog(this, "不能为空");
				
			}
		User user = UserDao.getUser(name,pass);
		if(user!=null) {
			//创建主界面
			GlobalVar.login_user = user;
			new MainFrame();
			this.dispose();//释放此界面
			
		}
		else {
			JOptionPane.showMessageDialog(this, "用户名或密码错误");
			ming.setText("");
			mi.setText("");
		}
		}
		if(e.getSource()==close) {
			JOptionPane.showMessageDialog(this, "你已经取消这次登陆");
			ming.setText("");
			mi.setText("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  new Deng();
	}
	

}
