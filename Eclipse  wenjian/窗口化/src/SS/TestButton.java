package SS;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestButton extends JFrame implements ActionListener {
	private JButton jb;
	private JLabel jl;
	private int count = 0;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		count++;
		jl.setText("按钮点击了"+count+"此");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestButton frame = new TestButton();
		frame.setVisible(true);
		frame.pack();
	}
public TestButton() {
	setTitle("TestButton");
	jb=new JButton("press me",new ImageIcon("images/2.jpg"));
	jb.setMnemonic('p');
	jb.setToolTipText("press me");
	jl =new JLabel("按钮点击了0此");
	getContentPane().setLayout(new FlowLayout());
	getContentPane().add(jb);
	getContentPane().add(jl);
	jb.addActionListener(this);
	
}
}
