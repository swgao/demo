package jskl;

import java.util.Scanner;

public class xiti11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       double time;
       double fei=0;
       System.out.println("������ʱ�䡾Сʱ��������20Сʱ����");
       time = scan.nextDouble();
       if(time<=0) 
    	   fei=0;
       else if(time<=3)
    	   fei=5;
       else if(time<=18)
    	   fei=5+Math.ceil(time-3)*1; //Math.ceil��ȥС��
       if(time>18) 

    	 System.out.println(false);
       
    System.out.println(fei);
	}
	
}
