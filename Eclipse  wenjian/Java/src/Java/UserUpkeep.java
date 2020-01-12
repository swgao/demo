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
			new String[] {"编号","姓名","密码"});
	private List<User> list = UserDao.selectUserList();
	UserUpkeep(){
		this.setTitle("用户信息维护");
		setBounds(220,100,800,400);
		this.setResizable(false);
		JPanel dialogPane = new JPanel();
		dialogPane.setBorder(new EmptyBorder(5,5,5,5));//设置边缘空白大小
		dialogPane.setBackground(new Color(198,236,253));
		dialogPane.setLayout(new BorderLayout());
		setContentPane(dialogPane);//将“对话框架”设置为框架的内容模板
		JSplitPane outerPane = new JSplitPane();//创建“外部分割面板”
		outerPane.setOpaque(false);//设置“外部分割面板”透明
		outerPane.setResizeWeight(0.1);//设置“外部分割面板”宽度分配权限
		//设置“外部分割面板”水平分配
		outerPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		//设置“外部分割面板”可以有一个出发扩展
		outerPane.setOneTouchExpandable(true);
		//将“外部分割面板”添加到“对话面板”的中央
		dialogPane.add(outerPane,BorderLayout.CENTER);
		JSplitPane innerPane = new JSplitPane();//设置“内部分割面板”
		innerPane.setOpaque(false);//设置“内部分割面板”透明
		innerPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED,null,null),
				"用户信息维护",TitledBorder.LEADING,TitledBorder.TOP,new Font("微软雅黑",Font.PLAIN,14),new Color(59,59,59)));
		innerPane.setResizeWeight(0.8);
		//设置“内部分割面板”垂直分配
		innerPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		//将“内部分割面板”设置在“外部分割面板”的左侧
		outerPane.setLeftComponent(innerPane);
		//设置在内部切割面板的上方
		innerPane.setLeftComponent(createDataPanel());
		//“按钮面板”设置在内部切割面板的下方
		innerPane.setRightComponent(createButtonPanel());
		//设置在外部切割面板的右侧
		outerPane.setRightComponent(createTablePanel());
	}
	private JPanel createDataPanel() {
		//设置“数据面板”
		JPanel dataPanel = new JPanel(null);
		//设置数据面板的边缘空白大小
		dataPanel.setBorder(new EmptyBorder(5,5,5,10));
		dataPanel.setOpaque(false);  //设置数据面板透明
		JLabel jl_id = new JLabel("编号:");//创建用户编号标签
		jl_id.setBounds(50,20,100,25);//设置他的位置跟大小
		dataPanel.add(jl_id);//将用户编号标签添加到数据面板上
		//创建用户编号文本框，并根据user表的用户个数，显示初始数据
		if(list.size()==0) {
			tf_id = new JTextField(String.valueOf(1));
		}else {
			tf_id = new JTextField(String.valueOf(list.size()+1));
		}
		tf_id.setEditable(false);//不可编辑
		//为用户编号文本框添加失去焦点监听器
		tf_id.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				tf_id_focusLost();
			}
		});
		tf_id.setBounds(130,20,150,25);
		//设置用户编号文本框提示信息
		tf_id.setToolTipText("必须输入用户编号");
		dataPanel.add(tf_id);
		//创建用户名标签
		JLabel jl_name = new JLabel("用户名：");
		jl_name.setBounds(50,60,100,25);
		dataPanel.add(jl_name);
		tf_name = new JTextField(10);
		tf_name.setBounds(130,60,150,25);
		tf_name.setToolTipText("必须输入用户名");
		dataPanel.add(tf_name);
		tf_name.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				tf_name_focusLost();
			}
		});
		//创建密码标签
		JLabel jl_passl = new JLabel("密码：");
		jl_passl.setBounds(50,100,100,25);
		dataPanel.add(jl_passl);
		pf_pass = new JTextField(10);
		pf_pass.setBounds(130,100,150,25);
		tf_name.setToolTipText("必须输入密码");
		dataPanel.add(pf_pass);
		return dataPanel;
	}
	private JPanel createButtonPanel() {
		//创建按钮面板
		JPanel buttonPanel = new JPanel(new GridBagLayout());
		buttonPanel.setOpaque(false);
		((GridBagLayout)buttonPanel.getLayout()).columnWidths = new int[] {
				0,60,60,60,60,60,0};
		((GridBagLayout)buttonPanel.getLayout()).columnWeights = new double[] {
				0.5,0.0,0.0,0.0,0.0,0.0,0.5};
		jb_insert = new JButton("添加");
		jb_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jb_insert_actionPerformed();
			}
		});
		buttonPanel.add(jb_insert,new GridBagConstraints(1,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 5),0,0));
		jb_update = new JButton("修改");
		jb_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jb_update_actionPerformed();
				
			}
		});
		//将修改按钮添加到按钮面板
		buttonPanel.add(jb_update,new GridBagConstraints(2,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 5),0,0));
		jb_delete = new JButton("删除");
		jb_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jb_delete_actionPerformed();
				
			}
		});
		buttonPanel.add(jb_delete,new GridBagConstraints(3,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 0),0,0));
		jb_cancel = new JButton("取消");
		jb_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				del_content();//调用清空数据面板内容方法，清楚数据面板中的数据
				
			}
		});
		buttonPanel.add(jb_cancel,new GridBagConstraints(4,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 5),0,0));
		jb_close = new JButton("关闭");
		jb_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();   //关闭维护界面
				
			}
		});
		buttonPanel.add(jb_close,new GridBagConstraints(5,0,1,1,0.0,0.0,GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,new Insets(0, 0, 0, 5),0,0));
		jb_empty = new JButton("清空所有数据");
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
		//创建表格面板，用边界布局
		JPanel tablePanel = new JPanel(new BorderLayout(5,5));
		JScrollPane scrollPane = new JScrollPane();//创建滚动面板
		tablePanel.add(scrollPane);//将滚动面板添加到表格面板上
		table = new JTable(model);//采用指定的表格模型来创建表格
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
		//重新设置用户编号的文本框数据
		tf_id.setText(String.valueOf(list.size()+1));
		tf_name.setText("");
		pf_pass.setText("");
		tf_id.setEditable(true);
	}
	public void tf_id_focusLost() {
		//通过用户便号，获取一个对象
		User user = UserDao.getUser(Integer.parseInt(tf_id.getText().trim()));
		if(user!=null) {
			JOptionPane.showMessageDialog(null, "用户编号已存在，请重新输入");
			del_content();//调用方法，清空面板数据
		}
	}
	public void tf_name_focusLost() {
		User user = UserDao.getUser(tf_name.getText().trim());
		if(user!=null) {
			JOptionPane.showMessageDialog(null, "用户名已存在，请重新输入用户名");
			tf_name.setText("");
		}
	}
	public void refresh() { //用于刷新表格数据
		model.setRowCount(0);//清楚表格模型的数据
		list = UserDao.selectUserList();//获取用户对象
		//重新添加数据
		for(int i = 0; i<list.size();i++) {
			User user = (User)list.get(i);
			model.addRow(new Object[] {user.getId(),user.getName(),user.getPass()});
		}
		del_content();
	}
	//表格鼠标点击事件响应
	public void table_mouseClicked() {
		//获取列表中对象
		User user = (User)list.get(table.getSelectedRow());
		//在数据面板中设置对应的数据
		tf_id.setText(String.valueOf(user.getId()));
		tf_name.setText(user.getName());
		pf_pass.setText(user.getPass());
		tf_id.setEditable(false);
		
	}
	//添加按钮事件相应，用于添加新用户
	public void jb_insert_actionPerformed() {
		User user = new User();
		user.setId(Integer.parseInt(tf_id.getText().trim()));
		user.setName(tf_name.getText().trim());
		user.setPass(pf_pass.getText().trim());
		//判断操作是否为成功
		if(tf_name.getText().trim().equals("")||pf_pass.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "用户信息不为空");
			return;
		}else {
			int i = UserDao.insertUser(user);//执行添加语句
			if(i==1) {
				model.addRow(new Object[] {user.getId(),user.getName(),user.getPass()});
				refresh();//刷新表格面板内容
			}
			del_content();//清空数据面板的数据
		}
	}
	//修改按钮事件相应方法，用于修改用户信息
	public void jb_update_actionPerformed() {
		User user = new User();
		user.setId(Integer.parseInt(tf_id.getText().trim()));
		user.setName(tf_name.getText().trim());
		user.setPass(pf_pass.getText().trim());
		if(tf_name.getText().trim().equals("")||pf_pass.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "用户信息不为空");
			return;
		}else {
			int i = UserDao.updateUser(user);//执行添加语句
			if(i==1) {
				JOptionPane.showMessageDialog(null, "用户信息修改成功");
			}
				refresh();//刷新表格面板内容
			del_content();//清空数据面板的数据
		}
	}
	//删除按钮事件响应，用于删除用户
	public void jb_delete_actionPerformed() {
		int id = Integer.parseInt(tf_id.getText());//获取用户编号
		//调用确定对话框，询问书否删除用户
		int m = JOptionPane.showConfirmDialog(null, "你确定删除这条用户信息？","删除用户信息",JOptionPane.YES_NO_OPTION);
		if(m==JOptionPane.YES_NO_OPTION) {
			if(UserDao.deleteUser(id)==1) {
				refresh();
				JOptionPane.showMessageDialog(null, "删除用户成功");
				
			}
			del_content();
		}
	}
	//删除所有用户
	public void jb_empty_actionPerformed() {
		int m = JOptionPane.showConfirmDialog(null, "你确定删除全部用户信息？","删除用户信息",JOptionPane.YES_NO_OPTION);
		if(m==JOptionPane.YES_NO_OPTION) {
			int n = JOptionPane.showConfirmDialog(null, "确定清空全部用户？","清空用户再次确定",JOptionPane.YES_NO_OPTION);
			if(n==JOptionPane.YES_NO_OPTION) {
				UserDao.emptyUser();
				refresh();
				JOptionPane.showMessageDialog(null, "删除用户成功");
				
			}
			del_content();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserUpkeep();
	}

}
