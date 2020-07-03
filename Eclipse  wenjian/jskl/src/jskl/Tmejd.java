package jskl;

import java.util.Scanner;

public class Tmejd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int a,b,c,x;
for(x=100;x<1000;x++) {
	a=x/100;
	b=(x/10)%10;    //x%100/10;
	c=(x%10);
	if(a*a*a+b*b*b+c*c*c==x)
		System.out.println(x+"是水仙花数");    //水仙花数
}
	}
}
