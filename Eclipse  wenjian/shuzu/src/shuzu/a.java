package shuzu;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String s = Integer.toString(N,7);
		int sum=0;
		for(int i=0; i<s.length(); i++){
			sum += s.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}

	
