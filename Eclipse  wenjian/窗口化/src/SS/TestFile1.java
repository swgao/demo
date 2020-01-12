package SS;

import java.io.File;
import java.io.IOException;

public class TestFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path1 = new File("path1");
		File file1 = new File("path1\\file1.txt");
		System.out.println("目录path1的名字是："+path1.getName());
		System.out.println("目录file1的名字是："+file1.getName());
		System.out.println("目录file1的长度是："+file1.length());
		System.out.println("正在创建目录path1...");
		path1.mkdir();
		try {
			System.out.println("正在创建文件file1...");
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] sa = new File(".").list();
		for(int i = 0; i< sa.length;i++) 
			System.out.println(sa[i]);
			System.out.println("文件file1的路径是"+file1.getAbsolutePath());
		file1.delete();
		path1.delete();
	}

}
