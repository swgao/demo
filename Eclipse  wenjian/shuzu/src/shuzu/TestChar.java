package shuzu;

import java.util.Scanner;

public class TestChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		int i=0;
		/*do {System.out.println("请输入一个字符，y/Y继续：");
		ch = scan.next().charAt(0);
			i++;
			
		}while(ch=='Y' || ch=='y');
		System.out.println(i-1);*/     //不等于yY停止
		do {System.out.println("请输入一个字符，y/Y继续：");
		ch = scan.next().charAt(0);
			i++;
			
		}while(ch!='Y' && ch!='y');   //等于yY停止
		System.out.println(i-1);

	}

}
