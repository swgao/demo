package shuzu;

import java.util.Scanner;
/*
 * 题目：
 * 小白正在走楼梯，楼梯有n阶台阶，小白可以一次上一个，或者两个，或者三个，实现一个方法
 * 计算小白有多少种走完楼梯的方法*/
public class 小白走楼梯 {
private static int f(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		return f(n-1)+f(n-2)+f(n-3);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入楼梯数");
		int n = scan.nextInt();
		System.out.println(f(n));
		
	}

	
}
