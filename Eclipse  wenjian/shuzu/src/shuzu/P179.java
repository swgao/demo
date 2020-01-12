package shuzu;

import java.util.Random;

public class P179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x [][] = new int[10][10];
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x.length;j++) {
				x[i][j] = (int)(Math.random()*10);
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		int max = -1;int j1=0;int i1=0;
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x.length;j++) {
				if(x[i][j]>max) {
					max=x[i][j];
					i1+=1;
					j1+=1;
				}
			}
		}
		System.out.println(max);
		System.out.println(i1+"   "+j1);
		}
}
