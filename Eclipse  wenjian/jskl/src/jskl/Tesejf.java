package jskl;

import java.util.Scanner;

public class Tesejf {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int shi;
int fen;
int miao;
int sum;
System.out.println("������һ������");
sum = scan.nextInt();
shi=sum/3600;
fen=(sum%3600)/60;
miao=(sum%3600)%60;
System.out.println("�ܹ�"+shi+"Сʱ"+fen+"����"+miao+"����");


	}

}
