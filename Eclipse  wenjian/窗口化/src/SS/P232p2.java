package SS;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class P232p2 extends JFrame {
	public P232p2() {
	JTextArea t = new JTextArea("sadsa",100,0);
	JScrollPane jsp = new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	getContentPane().add(jsp);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P232p2 f = new P232p2();
		f.setVisible(true);
		f.setSize(300,300);
	}

}
