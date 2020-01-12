package shuzu;

import java.util.Scanner;

public class 二进制中一的个数 {

	public static void main(String[] args) {
		/*
		 思路：用1与二进制的数与（&），与32次，如果是1，他与出来就是1，然后每次有相应的就计数就可以
		 二进制只有32位*/
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(Integer.toString(N,2)); //二进制的输出
		int count=0;
		for(int i=0;i<32;i++) {
			if((N&(1<<i))==(1<<i)){
				count++;
			}
		}
		System.out.println(count);
		/*
		 思路：一个二进制只有0.1，所以我们给这个二进制减一，这个二进制的第一个一就变成了0，后面的0都变成1，然后与原来的与（&）
		 就消掉了，然后一直做，知道他全部都为0，每做一次就有一个一，所以做几次就有几个一。*/
		count=0;
		while(N!=0) {
			N=((N-1)&N);
			count++;
		}
		System.out.println(count);
	}

}
