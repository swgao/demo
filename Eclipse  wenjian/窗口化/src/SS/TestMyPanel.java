package SS;

import javax.swing.JFrame;

public class TestMyPanel extends JFrame {
	public TestMyPanel() {
		getContentPane().add(new MyPanel());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMyPanel f = new TestMyPanel();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
