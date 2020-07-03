package shuzu;

import java.util.Scanner;

public class huiwen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int shuzi = scan.nextInt();
		int i= 0;
		int sum = 0;
		int record = shuzi;
		while(true) {
			i = shuzi%10;
			sum =sum*10+i;
			shuzi/=10;
			if(shuzi==0)
				break;
			
		}
if(sum==record) {
	System.out.println("是回文");
}else
	System.out.println("不是回文");
	}

}
