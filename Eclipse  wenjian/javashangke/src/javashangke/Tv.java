package javashangke;

import java.util.Scanner;

public class Tv {
	private String pinpai;
	private double chicun;
	int chann;
	public Tv(String pinpai, double chicun) {
		this.pinpai = pinpai;
		this.chicun = chicun;
	}
	public void setchann(int m) {
		if(m>=1) {
			chann=m;
		}
	}
public int getchann() {
	return chann;
}

public void shoppindao(int chann) {
	switch(chann) {
	case 1:System.out.println("�ۺ�Ƶ��");
	break;
	case 2:System.out.println("����Ƶ��");
	break;
	case 3:System.out.println("����Ƶ��");
	break;
	case 4:System.out.println("����Ƶ��");
	break;
	case 5:System.out.println("����Ƶ��");
	break;
	case 6:System.out.println("����Ƶ��");
	break;
	case 7:System.out.println("����Ƶ��");
	break;
	}
	
	
}public void PrintTv() {
	System.out.println("��ǰƵ����");
	shoppindao(1);
	System.out.println("������ӳߴ���"+chicun+",Ʒ����"+pinpai);
}public void huantai() {
	System.out.println("��������Ҫ����Ƶ����1~7��");
	Scanner scan = new Scanner(System.in);
	int m=scan.nextInt();
	System.out.println("������"+m+"Ƶ���ɹ�");
	shoppindao(m);
	}

	
}
