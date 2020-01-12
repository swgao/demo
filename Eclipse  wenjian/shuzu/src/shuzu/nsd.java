package shuzu;

import java.util.Scanner;

public class nsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(a=1;a<=n;a++) {
			for(b=1;b<=n-a;b++)
				System.out.print(" ");
			for(b=1;b<=2*a-1;b++)
				System.out.print("*");
			System.out.print("\n");
		}
	for(a=1;a<=n;a++) {
		for(b=1;b<=a;b++)
			System.out.print(" ");
		for(b=1;b<=2*(n-a)-1;b++)
			System.out.print("*");
		System.out.println("\n");
	}
	}

}
