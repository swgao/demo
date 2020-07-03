package DuoXianCheng;

public class Thread4 implements Runnable {
	int i;
	public Thread4(int i) {
		this.i = i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int ii=0;ii<10;ii++)
			System.out.println("Threads"+i+"print"+ii);
	}

}
