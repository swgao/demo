package shuzu;

import java.util.Scanner;

public class ������С�� {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("������һ��С��(0~1)");
	double a=scan.nextDouble();
	
	StringBuilder sb = new StringBuilder("0.");
	while(a>0) {
		//��2��Ų��
		double r=a*2;
		//�ж���������
		if(r>=1) {
			sb.append("1");
			//������������
			a=r-1;
		}else {
		sb.append("0");
		a=r;
		}
		if(sb.length()>34) {
			System.out.println("ERROR");
			return;
		}
	}
	System.out.println(sb.toString());
	}

}
