package shuzu;

import java.util.Scanner;

public class ad {
	private static int m() {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c,d,e;
		c=a&b;
		d=a|b;
		e=c^d;
		int cnt=0;
		while(e!=0)
		{
			e=((e-1)&e);
			cnt++;
		}
		System.out.println(cnt);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ad a=new ad();
		a.m();
		
	}

}
