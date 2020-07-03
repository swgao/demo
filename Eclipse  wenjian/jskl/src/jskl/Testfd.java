package jskl;

import java.util.Scanner;

public class Testfd {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double diqu;
	double tax = 0;
    double lucheng;
    double qibu;
    System.out.println("是哪个车牌（夏利-1 富康-2 桑塔纳-3）");
    diqu = scan.nextInt();
    System.out.println("请输入路程（公里）");
    lucheng = scan.nextDouble();
    if(diqu==1){
    	if(lucheng<=3)
    		tax=7;
    	else if(lucheng>3)
    		tax=(lucheng-3)*2.1+7;
    	System.out.println("车费:"+tax);
    }
    if(diqu==2) {
    	if(lucheng<=3)
    		tax=8;
    	else
    		tax=(lucheng-3)*2.4+8;
    	System.out.println("车费"+tax);
    	
    }
    if(diqu==3) {
    	if(lucheng<=3)
    		tax=10;
    	else
    		tax=(lucheng-3)*2+10;
    	System.out.println("车费"+tax);
    }
    }

}
