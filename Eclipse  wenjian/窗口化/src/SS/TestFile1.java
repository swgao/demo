package SS;

import java.io.File;
import java.io.IOException;

public class TestFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path1 = new File("path1");
		File file1 = new File("path1\\file1.txt");
		System.out.println("Ŀ¼path1�������ǣ�"+path1.getName());
		System.out.println("Ŀ¼file1�������ǣ�"+file1.getName());
		System.out.println("Ŀ¼file1�ĳ����ǣ�"+file1.length());
		System.out.println("���ڴ���Ŀ¼path1...");
		path1.mkdir();
		try {
			System.out.println("���ڴ����ļ�file1...");
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] sa = new File(".").list();
		for(int i = 0; i< sa.length;i++) 
			System.out.println(sa[i]);
			System.out.println("�ļ�file1��·����"+file1.getAbsolutePath());
		file1.delete();
		path1.delete();
	}

}
