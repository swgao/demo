package javashangke;

import java.util.Scanner;

public class ͳ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int big = 0;
		int min = 0;
		int kong = 0;
		int shuzi = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ���ַ���");
		String lin = sc.nextLine();
		for(int x = 0;x<lin.length();x++) {
			char ch = lin.charAt(x);
			if(ch>='a' && ch<='z')  {
				min++; 
			}else if(ch>='A' && ch<='Z') {
				big++;
			}else if(ch>='0' && ch<='9') {
				shuzi++;
			}
			else{
				kong++;
			}
		}
		System.out.println("��д��ĸ�У�"+big+"��");
		System.out.println("Сд��ĸ�У�"+min+"��");
		System.out.println("�ո��У�"+kong+"��");
		System.out.println("������"+shuzi+"��");
	}

}
