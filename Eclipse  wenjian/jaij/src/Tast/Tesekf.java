package Tast;

import java.util.Scanner;

public class Tesekf {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int score;
		 System.out.println("请输入成绩（0~100）:");
		 score = scan.nextInt();
		 String str="及格";
		 if(score<60) {
			 str = "不及格";
		 }else if(score<80) {
			 str = "良";
		 }else
			 str = "优秀"; 
		 System.out.println("成绩"+score+","+str);

	}

}
