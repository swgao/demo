package DuoXianCheng;

public class Thread1 extends Thread {
	public void run() { //线程做的工作是什么
		for(int i = 1;i<=50;i++)
			System.out.print(i+" ");
	}
}
