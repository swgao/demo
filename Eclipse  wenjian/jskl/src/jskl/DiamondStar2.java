package jskl;

import java.util.Scanner;

public class DiamondStar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N;
		int j;
		int i;
		System.out.print("请输入边长：");
		N = scan.nextInt();
		//上三角
		for(i=1;i<=N;i++) {
			 for(j=1;j<=N-i;j++)   //行前空格数
				 System.out.print(" ");
			 for(j=1;j<=2*i-1;j++)
				 System.out.print("*");
			 System.out.print("\n");
			 }
		//下三角
			 for(i=1;i<N;i++) {
				 for(j=1;j<=i;j++)   //行前空格数
					 System.out.print(" ");
				 for(j=1;j<=2*(N-i)-1;j++)
					 System.out.print("*");
				 System.out.print("\n");
	}
	}
}//实心
