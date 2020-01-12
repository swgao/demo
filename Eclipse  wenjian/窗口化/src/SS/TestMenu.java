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
	JMenuItem miNew,miOpen,miExit; //����˵���
	JRadioButtonMenuItem rbmiRed,rbmiYellow,rbmiBlue; //�˵���ť
	JMenu mfile,jOptiton; //����˵�
	JMenuBar mb;	//����˵���
	public TestMenu() {
		mb = new JMenuBar();
		setJMenuBar(mb);
		mfile = new JMenu("�ļ�");
		jOptiton = new JMenu("ѡ��");
		mb.add(mfile);
		mb.add(jOptiton);
		mfile.add(miNew = new JMenuItem("�½�"));
		mfile.add(miOpen = new JMenuItem("��"));
		mfile.addSeparator();
		mfile.add(miExit = new JMenuItem("�˳�"));
		jOptiton.add(new JCheckBoxMenuItem("�Զ�����"));
		JMenu color = new JMenu("��ɫ");
		jOptiton.add(color);
		color.add(rbmiBlue = new JRadioButtonMenuItem("��ɫ"));
		color.add(rbmiRed = new JRadioButtonMenuItem("��ɫ"));
		color.add(rbmiYellow = new JRadioButtonMenuItem("��ɫ"));
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
			JOptionPane.showMessageDialog(this, "�½��ļ�");
		if(e.getSource()==miOpen)
			JOptionPane.showMessageDialog(this, "���ļ�");
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
