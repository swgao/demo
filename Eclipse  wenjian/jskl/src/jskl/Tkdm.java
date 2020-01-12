package jskl;

import java.util.Scanner;

public class Tkdm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a,b,c;
		int x=100;
		while(x<1000) {
			a=x/100;
			b=(x/10)%10;    //x%100/10;
			c=(x%10);
			if(a*a*a+b*b*b+c*c*c==x)
				System.out.println(x+"是水仙花数");    //水仙花数
			x++;
		}
	}
}
