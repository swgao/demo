package shuzu;

import java.util.Scanner;

public class CFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���������֣������ӡ���������뼸��");
		int sum = scan.nextInt();
    for(int i=1;i<=9;i++) {
    	for(int y=1;y<=i;y++) {
    		System.out.print(y+"*"+i+"="+i*y+"  ");
    	}
    	System.out.println();
    }
    	
	}

}
