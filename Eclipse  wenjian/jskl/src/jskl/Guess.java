package jskl;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rand =new Random();
Scanner scan = new Scanner(System.in);

int guerrNumber;
int number;
int counter=0;
guerrNumber = rand.nextInt(100)+1;
do {
	System.out.println("������һ������");
	number =scan.nextInt();
	counter++;
	if(guerrNumber<number)
		System.out.println("���ˣ�");
	else if(guerrNumber>number)
		System.out.println("С�ˣ�");
	}while(guerrNumber!=number);
System.out.println("��ϲ�㣬�����ˣ�");
switch(counter) {
case 1:
	System.out.println("̫���ˣ�");
	break;
case 2:
	System.out.println("��������");
	break;
case 3:
case 4:
case 5:
case 6:
	System.out.println("һ��㣡");
	break;
	default:
		System.out.println("��ҪŬ��!");
}
	}          //������
}
