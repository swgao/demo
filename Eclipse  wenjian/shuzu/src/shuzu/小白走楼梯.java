package shuzu;

import java.util.Scanner;
/*
 * ��Ŀ��
 * С��������¥�ݣ�¥����n��̨�ף�С�׿���һ����һ������������������������ʵ��һ������
 * ����С���ж���������¥�ݵķ���*/
public class С����¥�� {
private static int f(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		return f(n-1)+f(n-2)+f(n-3);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������¥����");
		int n = scan.nextInt();
		System.out.println(f(n));
		
	}

	
}
