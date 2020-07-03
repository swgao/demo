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
	case 1:System.out.println("综合频道");
	break;
	case 2:System.out.println("娱乐频道");
	break;
	case 3:System.out.println("降级频道");
	break;
	case 4:System.out.println("经济频道");
	break;
	case 5:System.out.println("竞技频道");
	break;
	case 6:System.out.println("文艺频道");
	break;
	case 7:System.out.println("国际频道");
	break;
	}
	
	
}public void PrintTv() {
	System.out.println("当前频道是");
	shoppindao(1);
	System.out.println("这个电视尺寸是"+chicun+",品牌是"+pinpai);
}public void huantai() {
	System.out.println("输入你想要换的频道（1~7）");
	Scanner scan = new Scanner(System.in);
	int m=scan.nextInt();
	System.out.println("跟换至"+m+"频道成功");
	shoppindao(m);
	}

	
}
