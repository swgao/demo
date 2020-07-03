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
	System.out.println("请输入一个整数");
	number =scan.nextInt();
	counter++;
	if(guerrNumber<number)
		System.out.println("大了！");
	else if(guerrNumber>number)
		System.out.println("小了！");
	}while(guerrNumber!=number);
System.out.println("恭喜你，猜中了！");
switch(counter) {
case 1:
	System.out.println("太棒了！");
	break;
case 2:
	System.out.println("真厉害！");
	break;
case 3:
case 4:
case 5:
case 6:
	System.out.println("一般般！");
	break;
	default:
		System.out.println("需要努力!");
}
	}          //猜字谜
}
