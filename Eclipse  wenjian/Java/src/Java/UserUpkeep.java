package Java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.UserDataHandler;

public class UserUpkeep extends PublicJFrame {
	private JTextField tf_id;
	private JTextField tf_name;
	private JTextField pf_pass;
	private JButton jb_insert,jb_update,jb_cancel,jb_close,jb_delete,jb_empty;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel(new Object[][] {},
			new String[] {"���","����","����"});
	private List<User> list = UserDao.selectUserList();
	UserUpkeep(){
		this.setTitle("�û���Ϣά��");
		setBounds(220,100,800,400);
		this.setResizable(false);
		JPanel dialogPane = new JPanel();
		dialogPane.setBorder(new EmptyBorder(5,5,5,5));//���ñ�Ե�հ״�С
		dialogPane.setBackground(new Color(198,236,253));
		dialogPane.setLayout(new BorderLayout());
		setContentPane(dialogPane);//�����Ի���ܡ�����Ϊ��ܵ�����ģ��
		JSplitPane outerPane = new JSplitPane();//�������ⲿ�ָ���塱
		outerPane.setOpaque(false);//���á��ⲿ�ָ���塱͸��
		outerPane.setResizeWeight(0.1);//���á��ⲿ�ָ���塱��ȷ���Ȩ��
		//���á��ⲿ�ָ���塱ˮƽ����
		outerPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		//���á��ⲿ�ָ���塱������һ��������չ
		outerPane.setOneTouchExpandable(true);
		//�����ⲿ�ָ���塱��ӵ����Ի���塱������
		dialogPane.add(outerPane,BorderLayout.CENTER);
		JSplitPane innerPane = new JSplitPane();//���á��ڲ��ָ���塱
		innerPane.setOpaque(false);//���á��ڲ��ָ���塱͸��
		innerPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED,null,null),
				"�û���Ϣά��",TitledBorder.LEADING,TitledBorder.TOP,new Font("΢���ź�",Font.PLAIN,14),new Color(59,59,59)));
		innerPane.setResizeWeight(0.8);
		//���á��ڲ��ָ���塱��ֱ����
		innerPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		//�����ڲ��ָ���塱�����ڡ��ⲿ�ָ���塱�����
		outerPane.setLeftComponent(innerPane);
		//�������ڲ��и������Ϸ�
		innerPane.setLeftComponent(createDataPanel());
		//����ť��塱�������ڲ��и������·�
		innerPane.setRightComponent(createButtonPanel());
		//�������ⲿ�и������Ҳ�
		outerPane.setRightComponent(createTablePanel());
	}
	private JPanel createDataPanel() {
		//���á�������塱
		JPanel dataPanel = new JPanel(null);
		//�����������ı�Ե�հ״�С
		dataPanel.setBorder(new EmptyBorder(5,5,5,10));
		dataPanel.setOpaque(false);  //�����������͸��
		JLabel jl_id = new JLabel("���:");//�����û���ű�ǩ
		jl_id.setBounds(50,20,100,25);//��������λ�ø���С
		dataPanel.add(jl_id);//���û���ű�ǩ��ӵ����������
		//�����û�����ı��򣬲�����user����û���������ʾ��ʼ����
		if(list.size()==0) {
			tf_id = new JTextField(String.valueOf(1));
		}else {
			tf_id = new JTextField(String.valueOf(list.size()+1));
		}
		tf_id.setEditable(false);//���ɱ༭
		//Ϊ�û�����ı������ʧȥ���������
		tf_id.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				tf_id_focusLost();
			}
		});
		tf_id.setBounds(130,20,150,25);
		//�����û�����ı�����ʾ��Ϣ
		tf_id.setToolTipText("���������û����");
		dataPanel.add(tf_id);
		//�����û�����ǩ
		JLabel jl_name = new JLabel("�û�����");
		jl_name.setBounds(50,60,100,25);
		dataPanel.add(jl_name);
		tf_name = new JTextField(10);
		tf_name.setBounds(130,60,150,25);
		tf_name.setToolTipText("���������û���");
		dataPanel.add(tf_name);
		tf_name.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				tf_name_focusLost();
			}
		});
		//���������ǩ
		JLabel jl_passl = new JLabel("���룺");
		jl_passl.setBounds(50,100,100,25);
		dataPanel.add(jl_passl);
		pf_pass = new JTextField(10);
		pf_pass.setBounds(130,100,150,25);
		tf_name.setToolTipText("������������");
		dataPanel.add(pf_pass);
		return dataPanel;
	}
	private JPanel createButtonPanel() {
		//������ť���
		JPanel buttonPanel = new JPanel(new GridBagLayout());
		buttonPanel.setOpaque(false);
		((GridBagLayout)buttonPanel.getLayout()).columnWidths = new int[] {
				0,60,60,60,60,60,0};
		((GridBagLayout)buttonPanel.getLayout()).columnWeights = new double[] {
				0.5,0.0,0.0,0.0,0.0,0.0,0.5};
		jb_insert = new JButton("���");
		jb_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jb_insert_actionPerformed();
			}
		});
		buttonPanel.add(jb_insert,new GridBagConstraints(1,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 5),0,0));
		jb_update = new JButton("�޸�");
		jb_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jb_update_actionPerformed();
				
			}
		});
		//���޸İ�ť��ӵ���ť���
		buttonPanel.add(jb_update,new GridBagConstraints(2,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 5),0,0));
		jb_delete = new JButton("ɾ��");
		jb_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jb_delete_actionPerformed();
				
			}
		});
		buttonPanel.add(jb_delete,new GridBagConstraints(3,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 0),0,0));
		jb_cancel = new JButton("ȡ��");
		jb_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				del_content();//�����������������ݷ����������������е�����
				
			}
		});
		buttonPanel.add(jb_cancel,new GridBagConstraints(4,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 5),0,0));
		jb_close = new JButton("�ر�");
		jb_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();   //�ر�ά������
				
			}
		});
		buttonPanel.add(jb_close,new GridBagConstraints(5,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 5),0,0));
		jb_empty = new JButton("�����������");
		jb_empty.setBounds(160,280,160,25);
		jb_empty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jb_empty_actionPerformed();
				
			}
		});
		buttonPanel.add(jb_empty,new GridBagConstraints(2,1,3,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(25, 0, 0, 0),0,0));
		return buttonPanel;
	}
	private JPanel createTablePanel() {
		//���������壬�ñ߽粼��
		JPanel tablePanel = new JPanel(new BorderLayout(5,5));
		JScrollPane scrollPane = new JScrollPane();//�����������
		tablePanel.add(scrollPane);//�����������ӵ���������
		table = new JTable(model);//����ָ���ı��ģ�����������
		for(int i = 0;i<list.size();i++) {
			User user = (User)list.get(i);
			model.addRow(new Object[] {user.getId(),user.getName(),user.getPass()});
		}
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				table_mouseClicked();
			}
		});
		scrollPane.setViewportView(table);
		return tablePanel;
	}
	public void del_content() {
		//���������û���ŵ��ı�������
		tf_id.setText(String.valueOf(list.size()+1));
		tf_name.setText("");
		pf_pass.setText("");
		tf_id.setEditable(true);
	}
	public void tf_id_focusLost() {
		//ͨ���û���ţ���ȡһ������
		User user = UserDao.getUser(Integer.parseInt(tf_id.getText().trim()));
		if(user!=null) {
			JOptionPane.showMessageDialog(null, "�û�����Ѵ��ڣ�����������");
			del_content();//���÷���������������
		}
	}
	public void tf_name_focusLost() {
		User user = UserDao.getUser(tf_name.getText().trim());
		if(user!=null) {
			JOptionPane.showMessageDialog(null, "�û����Ѵ��ڣ������������û���");
			tf_name.setText("");
		}
	}
	public void refresh() { //����ˢ�±������
		model.setRowCount(0);//������ģ�͵�����
		list = UserDao.selectUserList();//��ȡ�û�����
		//�����������
		for(int i = 0; i<list.size();i++) {
			User user = (User)list.get(i);
			model.addRow(new Object[] {user.getId(),user.getName(),user.getPass()});
		}
		del_content();
	}
	//���������¼���Ӧ
	public void table_mouseClicked() {
		//��ȡ�б��ж���
		User user = (User)list.get(table.getSelectedRow());
		//��������������ö�Ӧ������
		tf_id.setText(String.valueOf(user.getId()));
		tf_name.setText(user.getName());
		pf_pass.setText(user.getPass());
		tf_id.setEditable(false);
		
	}
	//��Ӱ�ť�¼���Ӧ������������û�
	public void jb_insert_actionPerformed() {
		User user = new User();
		user.setId(Integer.parseInt(tf_id.getText().trim()));
		user.setName(tf_name.getText().trim());
		user.setPass(pf_pass.getText().trim());
		//�жϲ����Ƿ�Ϊ�ɹ�
		if(tf_name.getText().trim().equals("")||pf_pass.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "�û���Ϣ��Ϊ��");
			return;
		}else {
			int i = UserDao.insertUser(user);//ִ��������
			if(i==1) {
				model.addRow(new Object[] {user.getId(),user.getName(),user.getPass()});
				refresh();//ˢ�±���������
			}
			del_content();//���������������
		}
	}
	//�޸İ�ť�¼���Ӧ�����������޸��û���Ϣ
	public void jb_update_actionPerformed() {
		User user = new User();
		user.setId(Integer.parseInt(tf_id.getText().trim()));
		user.setName(tf_name.getText().trim());
		user.setPass(pf_pass.getText().trim());
		if(tf_name.getText().trim().equals("")||pf_pass.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "�û���Ϣ��Ϊ��");
			return;
		}else {
			int i = UserDao.updateUser(user);//ִ��������
			if(i==1) {
				JOptionPane.showMessageDialog(null, "�û���Ϣ�޸ĳɹ�");
			}
				refresh();//ˢ�±���������
			del_content();//���������������
		}
	}
	//ɾ����ť�¼���Ӧ������ɾ���û�
	public void jb_delete_actionPerformed() {
		int id = Integer.parseInt(tf_id.getText());//��ȡ�û����
		//����ȷ���Ի���ѯ�����ɾ���û�
		int m = JOptionPane.showConfirmDialog(null, "��ȷ��ɾ�������û���Ϣ��","ɾ���û���Ϣ",JOptionPane.YES_NO_OPTION);
		if(m==JOptionPane.YES_NO_OPTION) {
			if(UserDao.deleteUser(id)==1) {
				refresh();
				JOptionPane.showMessageDialog(null, "ɾ���û��ɹ�");
				
			}
			del_content();
		}
	}
	//ɾ�������û�
	public void jb_empty_actionPerformed() {
		int m = JOptionPane.showConfirmDialog(null, "��ȷ��ɾ��ȫ���û���Ϣ��","ɾ���û���Ϣ",JOptionPane.YES_NO_OPTION);
		if(m==JOptionPane.YES_NO_OPTION) {
			int n = JOptionPane.showConfirmDialog(null, "ȷ�����ȫ���û���","����û��ٴ�ȷ��",JOptionPane.YES_NO_OPTION);
			if(n==JOptionPane.YES_NO_OPTION) {
				UserDao.emptyUser();
				refresh();
				JOptionPane.showMessageDialog(null, "ɾ���û��ɹ�");
				
			}
			del_content();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserUpkeep();
	}

}
