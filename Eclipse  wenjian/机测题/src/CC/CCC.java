package CC;

import java.util.Random;

public class CCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random	r = new Random();
		int a[] =new int[31];
		for(int i=0;i<=30;i++) {
			a[i] = r.nextInt(10);
		}
		for(int i=0;i<=30;i++) {
			System.out.print(+a[i]+" ");
		}
	}

}
