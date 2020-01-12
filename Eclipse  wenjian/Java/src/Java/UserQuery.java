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
	JLabel lb_query;//������ѯ��ǩ
	JTextField tf_query;//������ѯ�����ı���
	JComboBox<String>cb_query;//������ѯ��Ŀ��Ͽ�
	JButton bt_query; //��ѯ��ť
	private JTable table;//�������
	private List<Reader> list = ReaderDao.selectReaderList();//���÷�����ȡ�û��б�����
	//�û�����Ŀ����
	private String[] tb_heads= {"�û����","�û�����","�Ա�","��Уʱ��"};
	//�û���Ŀ��Ӧ���ֶ�
	private String[] fields= {"id","name","sex","day"};
	//�����û����ģ��
	private DefaultTableModel model = new DefaultTableModel(new Object[][] {},tb_heads);
	//����Ĭ�ϲ�ѯ�ֶ�
	private String field = "id";
	//�����ַ������Ͳ�ѯ�ֶε�ֵ
	String valueStr = "";
	UserQuery(){
		this.setTitle("�û���ѯ");
		this.setVisible(true);
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);//�������
		//�������ò�ѯ���
		JPanel queryPanel = createQueryPanel();
		this.add(queryPanel,BorderLayout.NORTH);
		//�������ñ�����
		JPanel tablePanel = createTablePanel();
		this.add(tablePanel,BorderLayout.CENTER);
	}
	private JPanel createQueryPanel() {
		JPanel queryPanel = new JPanel();
		queryPanel.setOpaque(false);
		queryPanel.setLayout(new GridBagLayout());
		((GridBagLayout)queryPanel.getLayout()).columnWidths = new int[] {0,100,200,120,80,80,0};
		((GridBagLayout)queryPanel.getLayout()).columnWeights = new double[] {0.5,0.0,0.0,0.0,0.0,0.0,0.5};
		lb_query = new JLabel("�������û����");
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
		//ΪĿ���ֶ���Ͽ������Ŀ�¼�������
		cb_query.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				cb_query_itemStateChanged(arg0);
				
			}
		});
		queryPanel.add(cb_query,new GridBagConstraints(3,0,1,1,0.0,0.0,GridBagConstraints.EAST,
				GridBagConstraints.BOTH,new Insets(10, 0, 10, 10),0,0));
		bt_query = new JButton("��ѯ");
		bt_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				query_actionPerformed();
			}
		});
		queryPanel.add(bt_query,new GridBagConstraints(4,0,1,1,0.0,0.0,GridBagConstraints.EAST,
				GridBagConstraints.BOTH,new Insets(10, 0, 10, 10),0,0));
		JButton bn_close = new JButton("�ر�");
		bn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		queryPanel.add(bn_close,new GridBagConstraints(5,0,1,1,0.0,0.0,GridBagConstraints.EAST,
				GridBagConstraints.BOTH,new Insets(10, 0, 10, 10),0,0));
		return queryPanel;
	}
	//����������
	private JPanel createTablePanel() {
		JPanel tablePanel = new JPanel(new BorderLayout(5,5));
		JScrollPane scrollPane = new JScrollPane();//�����������
		tablePanel.add(scrollPane);
		table = new JTable(model);//������񣬲�����ָ���ı��ģ��
		addRowToModel(list);//���û��б���ӵ����ģ����
		scrollPane.setViewportView(table);
		return tablePanel;
	}
	//����ģ����Ӷ�����Ϣ
	private void addRowToModel(List<Reader> list) {
		model.setRowCount(0);//����������
		for(int i = 0;i<list.size();i++) {
			Reader reader = (Reader)list.get(i);
			model.addRow(new Object[] {reader.getId(),reader.getName(),reader.getSex(),reader.getDay()});
		}
	}
	//��ѯ��Ͽ�
	private void cb_query_itemStateChanged(ItemEvent arg0) {
		if(arg0.getStateChange()==ItemEvent.SELECTED) {
			lb_query.setText("������"+(String)arg0.getItem()+":");
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
	//��ѯ�¼���Ӧ
	private void query_actionPerformed() {
		switch(field) {
		case "id":
		case "name":
		case "sex":
		case "day":
			valueStr = tf_query.getText();//��ȡ�ַ������͵Ĳ�ѯ����
			list = ReaderDao.selectReaderList(field,valueStr);//���ð��գ��ֶ�ֵ���ַ����ֶ�ֵ����ѯ�û����б�
		}
		addRowToModel(list);//����ȡ���û��б���ӵ����ģ����
	}
	public static void main(String[] args) {
		new UserQuery();

	}

}
