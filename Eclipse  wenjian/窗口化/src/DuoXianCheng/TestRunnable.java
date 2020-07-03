package DuoXianCheng;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread4 t1 = new Thread4(1);
		Thread t11 = new Thread(t1);
		Thread4 t2 = new Thread4(2);
		Thread t22 = new Thread(t2);
		Thread t3 = new Thread(new Thread4(3));
		t11.start();
		t22.start();
		t3.start();
		System.out.println("Ö÷Ïß³Ì");
	}

}
