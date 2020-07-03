package javashangke;

import java.util.Scanner;

public class 用户登录 {
public static void guess(){
		Scanner sc2 = new Scanner(System.in);
		int sum = (int)(Math.random()*100);
		System.out.println("请输入要猜的数");
		while(true) {
			int g = sc2.nextInt();
			if(sum>g) {
				System.out.println("你猜的数小了");
			}
			else if(sum<g){
				System.out.println("你猜的数大了");
			}
			else {
				System.out.println("恭喜你猜对了");
				break;
			}
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name = "admin";
		String password = "123456";
		System.out.println("请输入用户命");
		do {
			String s = sc.nextLine();
			if(name.equals(s)) {
				break;
			}else {
				System.out.println("你输入的用户名不存在");
				System.out.print("请重新输入用户名：");
			}
		}while(true);
		System.out.println("请输入密码");
		for(int i =3; i>0;i--) {
			String m = sc.nextLine();
			if(password.equals(m)) {
				System.out.println("密码正确，进入猜字谜游戏");
				guess();
				break;
			}else if(i==0){
				System.out.println("密码已经被锁定");
			}
			else {
				System.out.println("密码错误，请重新输入：");
				System.out.println("你还有"+i+"次机会");
			}
		}
		
		
	}

}
