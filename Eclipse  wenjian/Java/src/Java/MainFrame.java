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
	private JMenuItem mi_exit; //退出系统
	private JMenuItem mi_update_pass;//修改密码
	private JMenuItem mi_user_upkeep;//用户维护
	private JMenuItem mi_user_query;//用户查询
	private JMenuItem mi_teacher_query;//老师查询
	public MainFrame() {
		this.setTitle("学生信息管理");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);//设置主界面最大化
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(createMenuBar());//创建工具栏
		
	}
	private JMenuBar createMenuBar() {       
		JMenuBar menuBar = new JMenuBar();            
		JMenu menu_upkeep = new JMenu("基础维护");           //基础维护
		mi_user_upkeep = new JMenuItem("用户维护");
		mi_user_upkeep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_upkeep_actionPerformed();
			}
		});
		menu_upkeep.add(mi_user_upkeep);
		JMenuItem mi_student_upkeep = new JMenuItem("学生维护");
		mi_student_upkeep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student_upkeep_actionPerformed();
			}
		});
		menu_upkeep.add(mi_student_upkeep);
		menuBar.add(menu_upkeep);
		JMenu menu_query = new JMenu("查询");                 //查询
		mi_user_query = new JMenuItem("用户查询");
		mi_user_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_query_actionPerformed();
			}
		});
		menu_query.add(mi_user_query);
		mi_teacher_query = new JMenuItem("老师查询");
		mi_teacher_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_teacher_actionPerformed();
			}
		});
		menu_query.add(mi_teacher_query);
		menuBar.add(menu_query);
		JMenu menu_management = new JMenu("系统管理");     //系统管理
		mi_update_pass = new JMenuItem("修改密码");
		mi_update_pass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_pass__actionPerformed();
			}
		});
		menu_management.add(mi_update_pass);
		mi_exit = new JMenuItem("系统退出");
		mi_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit_actionPerformed();
			}
		});
		menu_management.add(mi_exit);
		menuBar.add(menu_management);
		return menuBar;
	}
	private void user_upkeep_actionPerformed() {  //创建用户维护界面
		new UserUpkeep();
	}
	private void student_upkeep_actionPerformed() {  //创建学生维护界面
		new StudentUpkeep();
	}
	private void user_teacher_actionPerformed() {//创建老师查询界面
		//new TeacherQuery();
	}
	private void user_query_actionPerformed() { //创建用户查询界面
		new UserQuery();
	}
	private void update_pass__actionPerformed(){ //创建修改密码界面
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
