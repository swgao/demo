package shuzu;

import java.util.Scanner;

public class xiti2 {

	public static void main(String[] args) {
		int he=0;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] score=new int[11];
		for (int b=0;b<=10;b++) {
			System.out.println("请输入第"+b+"个数");
			score[b]=scan.nextInt();
		}
		
		   for(int i=0;i<score.length;i++) {
			   he+= score[i];
		   }
		   System.out.println("总和="+he);
		   double pingjun=0;
		   pingjun=1.0*he/score.length;
		   System.out.println("平均值="+pingjun);
	}

}
