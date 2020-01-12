package javashangke;

import java.util.Scanner;

public class 统计 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int big = 0;
		int min = 0;
		int kong = 0;
		int shuzi = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个字符串");
		String lin = sc.nextLine();
		for(int x = 0;x<lin.length();x++) {
			char ch = lin.charAt(x);
			if(ch>='a' && ch<='z')  {
				min++; 
			}else if(ch>='A' && ch<='Z') {
				big++;
			}else if(ch>='0' && ch<='9') {
				shuzi++;
			}
			else{
				kong++;
			}
		}
		System.out.println("大写字母有："+big+"个");
		System.out.println("小写字母有："+min+"个");
		System.out.println("空格有："+kong+"个");
		System.out.println("数字有"+shuzi+"个");
	}

}
