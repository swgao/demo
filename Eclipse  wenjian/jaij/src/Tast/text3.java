package Tast;

import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("�������һ������:\n");
        int a = scan.nextInt();
        System.out.print("������ڶ�������:\n");
        int b = scan.nextInt();
        int i = a;
        int j = b;
        int x =0,y =0;
        if(a < b){
            x = b;
            b = a;
            a = x;
        }
        while(b != 0){
            y = a % b;
            a = b;
            b = y;
        }
        //��С������
        int t = i * j / a;
        System.out.println(i+"��"+j+"�����Լ��Ϊ��"+ a);
        System.out.println(i+"��"+j+"����С������Ϊ��"+ t);  
    }
}
