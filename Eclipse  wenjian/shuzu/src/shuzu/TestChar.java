package shuzu;

import java.util.Scanner;

public class TestChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		int i=0;
		/*do {System.out.println("������һ���ַ���y/Y������");
		ch = scan.next().charAt(0);
			i++;
			
		}while(ch=='Y' || ch=='y');
		System.out.println(i-1);*/     //������yYֹͣ
		do {System.out.println("������һ���ַ���y/Y������");
		ch = scan.next().charAt(0);
			i++;
			
		}while(ch!='Y' && ch!='y');   //����yYֹͣ
		System.out.println(i-1);

	}

}
