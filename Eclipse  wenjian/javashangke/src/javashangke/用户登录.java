package javashangke;

import java.util.Scanner;

public class �û���¼ {
public static void guess(){
		Scanner sc2 = new Scanner(System.in);
		int sum = (int)(Math.random()*100);
		System.out.println("������Ҫ�µ���");
		while(true) {
			int g = sc2.nextInt();
			if(sum>g) {
				System.out.println("��µ���С��");
			}
			else if(sum<g){
				System.out.println("��µ�������");
			}
			else {
				System.out.println("��ϲ��¶���");
				break;
			}
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name = "admin";
		String password = "123456";
		System.out.println("�������û���");
		do {
			String s = sc.nextLine();
			if(name.equals(s)) {
				break;
			}else {
				System.out.println("��������û���������");
				System.out.print("�����������û�����");
			}
		}while(true);
		System.out.println("����������");
		for(int i =3; i>0;i--) {
			String m = sc.nextLine();
			if(password.equals(m)) {
				System.out.println("������ȷ�������������Ϸ");
				guess();
				break;
			}else if(i==0){
				System.out.println("�����Ѿ�������");
			}
			else {
				System.out.println("����������������룺");
				System.out.println("�㻹��"+i+"�λ���");
			}
		}
		
		
	}

}
