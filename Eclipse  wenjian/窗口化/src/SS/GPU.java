package SS;

	import java.awt.Container;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class GPU extends JFrame implements ActionListener {
		JLabel lb;
		JTextField tf1,tf2,tf3;
		JButton bt,bt2;
		public  GPU(String t) {
			super(t);
			Container c = this.getContentPane();
			c.setLayout(new FlowLayout());
			lb = new JLabel("+");
			tf1 = new JTextField(5);
			tf2 = new JTextField(5);
			tf3 = new JTextField(15);
			 bt = new JButton("=");
			 bt2 = new JButton("在做一题");
			 c.add(tf1);
			 c.add(lb);
			 c.add(tf2);
			 c.add(bt);
			 c.add(tf3);
			 c.add(bt2);
			 tf3.setEditable(false);
			 bt.addActionListener(this);
			 bt2.addActionListener(this);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bt) {
				double a,b;
				a = Double.parseDouble(tf1.getText());
				b = Double.parseDouble(tf2.getText());
				if(lb.getText()=="+")
					tf3.setText(a+b+"");
				else if(lb.getText()=="-")
					tf3.setText(a-b+"");
				}else {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				lb.setText("-");
			}
			
			

		}

		public static void main(String[] args) {
			
			GPU f = new GPU("计算器");
			f.setSize(200, 200);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocation(300, 300);
			f.pack();
			
		}

	}
