package jskl;

import java.util.Scanner;

public class xiti10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		System.out.print("����һ��������");	
		int num = input.nextInt();	
		while (num!=0)
		{
			System.out.print(num % 10);
			num =num/ 10;	}
		
		
	}

}
