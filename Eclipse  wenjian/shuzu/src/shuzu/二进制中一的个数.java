package shuzu;

import java.util.Scanner;

public class ��������һ�ĸ��� {

	public static void main(String[] args) {
		/*
		 ˼·����1������Ƶ����루&������32�Σ������1�������������1��Ȼ��ÿ������Ӧ�ľͼ����Ϳ���
		 ������ֻ��32λ*/
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(Integer.toString(N,2)); //�����Ƶ����
		int count=0;
		for(int i=0;i<32;i++) {
			if((N&(1<<i))==(1<<i)){
				count++;
			}
		}
		System.out.println(count);
		/*
		 ˼·��һ��������ֻ��0.1���������Ǹ���������Ƽ�һ����������Ƶĵ�һ��һ�ͱ����0�������0�����1��Ȼ����ԭ�����루&��
		 �������ˣ�Ȼ��һֱ����֪����ȫ����Ϊ0��ÿ��һ�ξ���һ��һ�����������ξ��м���һ��*/
		count=0;
		while(N!=0) {
			N=((N-1)&N);
			count++;
		}
		System.out.println(count);
	}

}
