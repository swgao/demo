package Java;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class UserQuery extends PublicJFrame {
	JLabel lb_query;//生命查询标签
	JTextField tf_query;//声明查询条件文本框
	JComboBox<String>cb_query;//声明查询栏目组合框
	JButton bt_query; //查询按钮
	private JTable table;//声明表格
	private List<Reader> list = ReaderDao.selectReaderList();//调用方法获取用户列表并保存
	//用户表栏目名称
	private String[] tb_heads= {"用户编号","用户姓名","性别","来校时间"};
	//用户栏目对应表字段
	private String[] fields= {"id","name","sex","day"};
	//创建用户表格模型
	private DefaultTableModel model = new DefaultTableModel(new Object[][] {},tb_heads);
	//设置默认查询字段
	private String field = "id";
	//设置字符串类型查询字段的值
	String valueStr = "";
	UserQuery(){
		this.setTitle("用户查询");
		this.setVisible(true);
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);//界面居中
		//创建设置查询面板
		JPanel queryPanel = createQueryPanel();
		this.add(queryPanel,BorderLayout.NORTH);
		//创建设置表格面板
		JPanel tablePanel = createTablePanel();
		this.add(tablePanel,BorderLayout.CENTER);
	}
	private JPanel createQueryPanel() {
		JPanel queryPanel = new JPanel();
		queryPanel.setOpaque(false);
		queryPanel.setLayout(new GridBagLayout());
		((GridBagLayout)queryPanel.getLayout()).columnWidths = new int[] {0,100,200,120,80,80,0};
		((GridBagLayout)queryPanel.getLayout()).columnWeights = new double[] {0.5,0.0,0.0,0.0,0.0,0.0,0.5};
		lb_query = new JLabel("请输入用户编号");
		queryPanel.add(lb_query,new GridBagConstraints(1,0,1,1,0.0,0.0,GridBagConstraints.EAST,
				GridBagConstraints.BOTH,new Insets(10, 10, 10, 10),0,0));
		tf_query = new JTextField();
		tf_query.requestFocus();
		tf_query.addKeyListener(new KeyAdapter() {
			public void KeyTyped(KeyEvent arg0) {
				if(arg0.getKeyChar()=='\n') {
					query_actionPerformed();
				}
			}
		});
		queryPanel.add(tf_query,new GridBagConstraints(2,0,1,1,0.0,0.0,GridBagConstraints.EAST,
				GridBagConstraints.BOTH,new Insets(10, 0, 10, 10),0,0));
		cb_query = new JComboBox<String>(tb_heads);
		//为目标字段组合框添加条目事件监听器
		cb_query.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				cb_query_itemStateChanged(arg0);
				
			}
		});
		queryPanel.add(cb_query,new GridBagConstraints(3,0,1,1,0.0,0.0,GridBagConstraints.EAST,
				GridBagConstraints.BOTH,new Insets(10, 0, 10, 10),0,0));
		bt_query = new JButton("查询");
		bt_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				query_actionPerformed();
			}
		});
		queryPanel.add(bt_query,new GridBagConstraints(4,0,1,1,0.0,0.0,GridBagConstraints.EAST,
				GridBagConstraints.BOTH,new Insets(10, 0, 10, 10),0,0));
		JButton bn_close = new JButton("关闭");
		bn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		queryPanel.add(bn_close,new GridBagConstraints(5,0,1,1,0.0,0.0,GridBagConstraints.EAST,
				GridBagConstraints.BOTH,new Insets(10, 0, 10, 10),0,0));
		return queryPanel;
	}
	//创建表格面版
	private JPanel createTablePanel() {
		JPanel tablePanel = new JPanel(new BorderLayout(5,5));
		JScrollPane scrollPane = new JScrollPane();//创建滚动面板
		tablePanel.add(scrollPane);
		table = new JTable(model);//创建表格，并采用指定的表格模型
		addRowToModel(list);//将用户列表添加到表格模型中
		scrollPane.setViewportView(table);
		return tablePanel;
	}
	//像表格模型添加读者信息
	private void addRowToModel(List<Reader> list) {
		model.setRowCount(0);//清楚表格数据
		for(int i = 0;i<list.size();i++) {
			Reader reader = (Reader)list.get(i);
			model.addRow(new Object[] {reader.getId(),reader.getName(),reader.getSex(),reader.getDay()});
		}
	}
	//查询组合框
	private void cb_query_itemStateChanged(ItemEvent arg0) {
		if(arg0.getStateChange()==ItemEvent.SELECTED) {
			lb_query.setText("请输入"+(String)arg0.getItem()+":");
			tf_query.setText("");
			for(int i = 0;i<tb_heads.length;i++) {
				if(arg0.getItem().equals(tb_heads[i])) {
					field = fields[i];
				}
			}
			list = ReaderDao.selectReaderList();
			addRowToModel(list);
			tf_query.requestFocus();
		}
	}
	//查询事件相应
	private void query_actionPerformed() {
		switch(field) {
		case "id":
		case "name":
		case "sex":
		case "day":
			valueStr = tf_query.getText();//获取字符串类型的查询条件
			list = ReaderDao.selectReaderList(field,valueStr);//调用按照（字段值。字符串字段值）查询用户的列表
		}
		addRowToModel(list);//将获取的用户列表，添加到表格模型中
	}
	public static void main(String[] args) {
		new UserQuery();

	}

}
