package shuzu;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		 Scanner s = new Scanner(System.in);
		 int a = s.nextInt();
		String b = Integer.toString(a,2);
		for(int c = 0;c<b.length();c++) {
			int d=b.charAt(c);
			if(d==49) {
				f++;
			}else
				continue;
		}
		System.out.println(f);
	}

}
