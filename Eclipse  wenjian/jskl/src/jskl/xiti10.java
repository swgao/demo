package jskl;

import java.util.Scanner;

public class xiti10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		System.out.print("输入一个整数：");	
		int num = input.nextInt();	
		while (num!=0)
		{
			System.out.print(num % 10);
			num =num/ 10;	}
		
		
	}

}
