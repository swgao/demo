package jskl;

import java.util.Scanner;

public class Testfd {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double diqu;
	double tax = 0;
    double lucheng;
    double qibu;
    System.out.println("���ĸ����ƣ�����-1 ����-2 ɣ����-3��");
    diqu = scan.nextInt();
    System.out.println("������·�̣����");
    lucheng = scan.nextDouble();
    if(diqu==1){
    	if(lucheng<=3)
    		tax=7;
    	else if(lucheng>3)
    		tax=(lucheng-3)*2.1+7;
    	System.out.println("����:"+tax);
    }
    if(diqu==2) {
    	if(lucheng<=3)
    		tax=8;
    	else
    		tax=(lucheng-3)*2.4+8;
    	System.out.println("����"+tax);
    	
    }
    if(diqu==3) {
    	if(lucheng<=3)
    		tax=10;
    	else
    		tax=(lucheng-3)*2+10;
    	System.out.println("����"+tax);
    }
    }

}
