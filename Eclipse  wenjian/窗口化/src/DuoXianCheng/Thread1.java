package DuoXianCheng;

public class Thread1 extends Thread {
	public void run() { //�߳����Ĺ�����ʲô
		for(int i = 1;i<=50;i++)
			System.out.print(i+" ");
	}
}
