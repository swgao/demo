package Java;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.mysql.jdbc.util.BaseBugReport;

public class MainFrame extends PublicJFrame {
	private JMenuItem mi_exit; //�˳�ϵͳ
	private JMenuItem mi_update_pass;//�޸�����
	private JMenuItem mi_user_upkeep;//�û�ά��
	private JMenuItem mi_user_query;//�û���ѯ
	private JMenuItem mi_teacher_query;//��ʦ��ѯ
	public MainFrame() {
		this.setTitle("ѧ����Ϣ����");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);//�������������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(createMenuBar());//����������
		
	}
	private JMenuBar createMenuBar() {       
		JMenuBar menuBar = new JMenuBar();            
		JMenu menu_upkeep = new JMenu("����ά��");           //����ά��
		mi_user_upkeep = new JMenuItem("�û�ά��");
		mi_user_upkeep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_upkeep_actionPerformed();
			}
		});
		menu_upkeep.add(mi_user_upkeep);
		JMenuItem mi_student_upkeep = new JMenuItem("ѧ��ά��");
		mi_student_upkeep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student_upkeep_actionPerformed();
			}
		});
		menu_upkeep.add(mi_student_upkeep);
		menuBar.add(menu_upkeep);
		JMenu menu_query = new JMenu("��ѯ");                 //��ѯ
		mi_user_query = new JMenuItem("�û���ѯ");
		mi_user_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_query_actionPerformed();
			}
		});
		menu_query.add(mi_user_query);
		mi_teacher_query = new JMenuItem("��ʦ��ѯ");
		mi_teacher_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_teacher_actionPerformed();
			}
		});
		menu_query.add(mi_teacher_query);
		menuBar.add(menu_query);
		JMenu menu_management = new JMenu("ϵͳ����");     //ϵͳ����
		mi_update_pass = new JMenuItem("�޸�����");
		mi_update_pass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_pass__actionPerformed();
			}
		});
		menu_management.add(mi_update_pass);
		mi_exit = new JMenuItem("ϵͳ�˳�");
		mi_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit_actionPerformed();
			}
		});
		menu_management.add(mi_exit);
		menuBar.add(menu_management);
		return menuBar;
	}
	private void user_upkeep_actionPerformed() {  //�����û�ά������
		new UserUpkeep();
	}
	private void student_upkeep_actionPerformed() {  //����ѧ��ά������
		new StudentUpkeep();
	}
	private void user_teacher_actionPerformed() {//������ʦ��ѯ����
		//new TeacherQuery();
	}
	private void user_query_actionPerformed() { //�����û���ѯ����
		new UserQuery();
	}
	private void update_pass__actionPerformed(){ //�����޸��������
		new UpdatePass();
	}
	private void exit_actionPerformed() {
		BaseDao.close();
		System.exit(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}

}
