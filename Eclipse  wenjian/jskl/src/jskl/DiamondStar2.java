package jskl;

import java.util.Scanner;

public class DiamondStar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N;
		int j;
		int i;
		System.out.print("������߳���");
		N = scan.nextInt();
		//������
		for(i=1;i<=N;i++) {
			 for(j=1;j<=N-i;j++)   //��ǰ�ո���
				 System.out.print(" ");
			 for(j=1;j<=2*i-1;j++)
				 System.out.print("*");
			 System.out.print("\n");
			 }
		//������
			 for(i=1;i<N;i++) {
				 for(j=1;j<=i;j++)   //��ǰ�ո���
					 System.out.print(" ");
				 for(j=1;j<=2*(N-i)-1;j++)
					 System.out.print("*");
				 System.out.print("\n");
	}
	}
}//ʵ��
