package SS;

import java.awt.Color;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MoteBookDemo extends JFrame implements ActionListener {
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("�ļ�"),
		edit = new JMenu("�༭");
	JMenuItem[] MenuItem = {
			new JMenuItem("�½�"),
			new JMenuItem("��"),
			new JMenuItem("����"),
			new JMenuItem("�˳�"),
			new JMenuItem("ȫѡ"),
			new JMenuItem("����"),
			new JMenuItem("����"),
			new JMenuItem("ճ��"),
	};
	JTextArea textArea = new JTextArea();//���±�����
	String fileName = "NoName";//�򿪻򱣴�ʱ�õ����ļ���
	Toolkit toolKit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolKit.getSystemClipboard();//���а����
	//�򿪺ͱ����ļ��Ի���
	private JFileChooser openFileDialog = new JFileChooser();
	private JFileChooser saveFileDialog = new JFileChooser();
	public MoteBookDemo() {
		// TODO Auto-generated constructor stub
		setFont(new Font("Time New Roman",Font.PLAIN,15));
		setBackground(Color.white);
		setSize(500,500);
		setJMenuBar(menuBar);
		menuBar.add(file);
		menuBar.add(edit);
		//��Ӳ˵���
		for(int i = 0; i<4;i++) {
			file.add(MenuItem[i]);
			edit.add(MenuItem[i+4]);
		}
		//����ı���
		this.getContentPane().add(textArea);
		//�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ÿ���˵���Ӽ�����e
		for(int i = 0;i<MenuItem.length;i++) {
			MenuItem[i].addActionListener(this);
		}
	}
	public void openFile(String fileName) {
		try {
			File file = new File(fileName);
			FileReader readIn = new FileReader(file);
			int size = (int)file.length();
			int charsRead = 0;
			char[] content = new char[size];
			while(readIn.ready())
				charsRead += readIn.read(content,charsRead,size-charsRead);
			readIn.close();
			textArea.setText(new String(content,0,charsRead));
		}catch(Exception e) {
			System.out.println("Error openin file!");
		}
	}
	private void writeFile(String fileName) {
		// TODO Auto-generated method stub
		try {
		File file = new File(fileName);
		FileWriter write = new FileWriter(file);
		write.write(textArea.getText());
		write.close();
		}catch(Exception e) {
			System.out.println("Error closing file!");
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object eventSource = e.getSource();
		if(eventSource==MenuItem[0]) {//�˵���½�
			textArea.setText("");
		}
		else if(eventSource==MenuItem[1]) {
			openFileDialog.showOpenDialog(this);
			fileName = openFileDialog.getSelectedFile().getPath();
			if(fileName!=null) {
				openFile(fileName);
			}
		}
		else if(eventSource==MenuItem[2]) {
			saveFileDialog.showSaveDialog(this);
			fileName=saveFileDialog.getSelectedFile().getPath();
			if(fileName!=null) {
				writeFile(fileName);
			}
		}
		else if(eventSource==MenuItem[3]) {
			System.exit(0);
		}
		else if(eventSource==MenuItem[4]) {
			textArea.selectAll();
		}
		else if(eventSource==MenuItem[5]) {
			String text = textArea.getSelectedText();
			StringSelection selection = new StringSelection(text);
			clipboard.setContents(selection, null);
		}
		else if(eventSource==MenuItem[6]) {
			String text = textArea.getSelectedText();
			StringSelection selection = new StringSelection(text);
			clipboard.setContents(selection, null);
			textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
		}
		else if(eventSource==MenuItem[7]) {
			Transferable contents = clipboard.getContents(this);
			if(contents==null) 
				return;
				String text;
				text= "";
				try {
					text = (String)contents.getTransferData(DataFlavor.stringFlavor);
					
				}catch(UnsupportedFlavorException ex) {
					
				}catch(IOException ex) {}
				textArea.replaceRange(text, textArea.getSelectionStart(), textArea.getSelectionEnd());
				
			}
		}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoteBookDemo f = new MoteBookDemo();
		f.setVisible(true);
	}

}
