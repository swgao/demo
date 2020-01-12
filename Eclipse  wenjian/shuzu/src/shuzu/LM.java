package shuzu;

import java.util.Scanner;

public class LM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int i=0; 
		int num1 = 0;
	    int num2 = 0;
	    int num = 0;
	    int flag = 0;
		int sz1[]=new int[N]; 
		 for (int c= 0; c < N; c++) {
			 sz1[c]=scan.nextInt();
             }
	    for (i = 0; i < sz1.length; i++)
	    {
	        num = num^sz1[i];
	    }
	    for (i = 0; i < 32; i++)
	    {
	        if (((num >> i) & 1) != 1)
	        {
	            flag++;
	        }
	        else
	            break;

	    }
	    for (i = 0; i < sz1.length; i++)
	    {
	        if (((sz1[i] >> flag)&1) == 1)
	            num1 ^= sz1[i];
	        else
	            num2 ^= sz1[i];
	    }
	   System.out.println(num2);
	   System.out.println(num1);

}
}
