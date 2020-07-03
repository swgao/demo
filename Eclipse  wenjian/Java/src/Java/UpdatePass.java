package Java;

import java.awt.Button;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdatePass extends PublicJFrame {
	private JTextField pf_pass1;
	private JTextField pf_pass2;
	private Button bt_ok;
	private Button bt_close;
	public UpdatePass() {
		setTitle("�޸�����");
		setSize(380,260);
		setResizable(false);
		setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);
		JLabel lb_pass1 = new JLabel("����������");
		lb_pass1.setBounds(new Rectangle(100,50,70,25));
		add(lb_pass1);
		pf_pass1 = new JTextField();
		pf_pass1.setBounds(new Rectangle(180,50,110,25));
		add(pf_pass1);
		JLabel lb_pass2 = new JLabel("ȷ������");
		lb_pass2.setBounds(new Rectangle(100,90,70,25));
		add(lb_pass2);
		pf_pass2 = new JTextField();
		pf_pass2.setBounds(new Rectangle(180,90,110,25));
		add(pf_pass2);
		bt_ok = new Button("�޸�");
		bt_ok.setBounds(new Rectangle(100,160,80,25));
		bt_ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ok_actionPerformed();
			}
		});
		add(bt_ok);
		bt_close = new Button("�ر�");
		bt_close.setBounds(new Rectangle(200,160,80,25));
		bt_close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		add(bt_close);
	}
	//�޸��¼�
		void ok_actionPerformed() {
			String pass1 = pf_pass1.getText();
			String pass2 = pf_pass2.getText();
			if(pass1.equals("")||pass2.equals("")) {
				JOptionPane.showMessageDialog(this, "�û����벻��Ϊ��");
				pf_pass1.requestFocus();
				return;
			}
			if(!pass1.equals(pass2)) {
				JOptionPane.showMessageDialog(this, "�������벻һ�£���������");
				pf_pass1.setText("");
				pf_pass2.setText("");
				pf_pass1.requestFocus();
				return;
				
			}
			//�ж��û��Ƿ����
			if(GlobalVar.login_user!=null) {
				String name = GlobalVar.login_user.getName();
				int i = UserDao.updatePass(name, pass1);
				if(i==1) {
					JOptionPane.showMessageDialog(null, "�����޸ĳɹ�");
					dispose();
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "���ǵ�ǰ�û����޸�ʧ��");
				
			}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UpdatePass();
	}

}
