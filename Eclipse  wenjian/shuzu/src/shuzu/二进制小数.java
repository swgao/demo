package shuzu;

import java.util.Scanner;

public class 二进制小数 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("请输入一个小数(0~1)");
	double a=scan.nextDouble();
	
	StringBuilder sb = new StringBuilder("0.");
	while(a>0) {
		//乘2；挪整
		double r=a*2;
		//判断整数部分
		if(r>=1) {
			sb.append("1");
			//消除整数部分
			a=r-1;
		}else {
		sb.append("0");
		a=r;
		}
		if(sb.length()>34) {
			System.out.println("ERROR");
			return;
		}
	}
	System.out.println(sb.toString());
	}

}
