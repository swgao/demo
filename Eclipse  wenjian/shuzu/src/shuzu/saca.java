package shuzu;

import java.util.Scanner;

public class saca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 int a = 0;
		 a=scan.nextInt();
		      int [] arr=new int[a+1];
		      arr[1]=arr[2]=1;
		      for(int i=3;i<arr.length;i++){
		          arr[i]=(arr[i-1]+arr[i-2])%10007;//对每一个斐波那契数列进行取余数
		      }
		      System.out.println(arr[a]);
		  }
	
	}

