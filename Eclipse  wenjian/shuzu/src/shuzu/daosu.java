package shuzu;

import java.util.Scanner;
		public class daosu {
 public static String fe(String a) {
String c="";
		
		for(int b = a.length()-1;b>=0; b--) {
			c+=a.charAt(b);}
		return c;

 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("请输入一个数");
		Scanner scan = new Scanner(System.in);
		String a=scan.nextLine();
		String n=fe(a);
		System.out.println(n);*/
		Scanner scan = new Scanner(System.in);
		int a=0;
		int c=0;
		int b=scan.nextInt();
		int s=b;
		while(true)
		{
			a=b%10;
			c=c*10+a;
			b/=10;
			if(b==0)
				break;
		}if(c==s)
			System.out.println("回文");
		else
			System.out.println("不是");
	}
		}
