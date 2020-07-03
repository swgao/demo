package SS;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestCheckBox extends JFrame implements ItemListener {
	JTextField tf;
	JCheckBox cb,cb1;
	JPanel p;
	public TestCheckBox() {
		Container cp =this.getContentPane();
		p=new JPanel();
		tf=new JTextField("Hello");
		tf.setHorizontalAlignment(JTextField.CENTER);
		cp.add(tf,BorderLayout.NORTH);
		cb=new JCheckBox("¼Ó´Ö");
		cb1=new JCheckBox("Ð±Ìå");
		p.add(cb);
		p.add(cb1);
		cp.add(p,BorderLayout.CENTER);
		cb.addItemListener(this);
		cb1.addItemListener(this);
	}
	@Override
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() instanceof JCheckBox) {
			int s=0;
			if(cb.isSelected())
				s+=Font.BOLD;
			if(cb1.isSelected())
				s+=Font.ITALIC;
				tf.setFont(new Font("Times new Roman",s,10+5*s));
		}

	}

	public static void main(String[] args) {
		
		TestCheckBox f = new TestCheckBox();
		f.setVisible(true);
		f.setSize(300,300);
		f.setLocation(300,300);
		f.setDefaultCloseOperation(3);
		f.pack();
	}

}
