package Tast;

import java.util.Scanner;

public class Tesekf {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int score;
		 System.out.println("������ɼ���0~100��:");
		 score = scan.nextInt();
		 String str="����";
		 if(score<60) {
			 str = "������";
		 }else if(score<80) {
			 str = "��";
		 }else
			 str = "����"; 
		 System.out.println("�ɼ�"+score+","+str);

	}

}
