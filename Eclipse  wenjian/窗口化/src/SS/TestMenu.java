package SS;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.zip.Inflater;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

public class TestMenu extends JFrame implements ActionListener, ItemListener {
	JMenuItem miNew,miOpen,miExit; //定义菜单项
	JRadioButtonMenuItem rbmiRed,rbmiYellow,rbmiBlue; //菜单按钮
	JMenu mfile,jOptiton; //定义菜单
	JMenuBar mb;	//定义菜单栏
	public TestMenu() {
		mb = new JMenuBar();
		setJMenuBar(mb);
		mfile = new JMenu("文件");
		jOptiton = new JMenu("选项");
		mb.add(mfile);
		mb.add(jOptiton);
		mfile.add(miNew = new JMenuItem("新建"));
		mfile.add(miOpen = new JMenuItem("打开"));
		mfile.addSeparator();
		mfile.add(miExit = new JMenuItem("退出"));
		jOptiton.add(new JCheckBoxMenuItem("自动换行"));
		JMenu color = new JMenu("颜色");
		jOptiton.add(color);
		color.add(rbmiBlue = new JRadioButtonMenuItem("蓝色"));
		color.add(rbmiRed = new JRadioButtonMenuItem("红色"));
		color.add(rbmiYellow = new JRadioButtonMenuItem("黄色"));
		ButtonGroup btp = new ButtonGroup();
		btp.add(rbmiBlue);
		btp.add(rbmiRed);
		btp.add(rbmiYellow);
		miExit.addActionListener(this);
		miOpen.addActionListener(this);
		miNew.addActionListener(this);
		rbmiBlue.addItemListener(this);
		rbmiRed.addItemListener(this);
		rbmiYellow.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JRadioButtonMenuItem) {
			if(rbmiBlue.isSelected())
				getContentPane().setBackground(Color.blue);
			if(rbmiRed.isSelected())
				getContentPane().setBackground(Color.red);
			if(rbmiYellow.isSelected())
				getContentPane().setBackground(Color.yellow);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==miNew)
			JOptionPane.showMessageDialog(this, "新建文件");
		if(e.getSource()==miOpen)
			JOptionPane.showMessageDialog(this, "打开文件");
		if(e.getSource()==miExit)
			System.exit(0);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMenu f = new TestMenu();
		f.setVisible(true);
		f.setSize(300,300);
		f.setLocation(300,300);
	}

}
