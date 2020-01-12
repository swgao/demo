package zuoye;

public class ClassA implements InterfaceA {

	@Override
	public int method(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			
		}System.out.println(sum);
		return sum;
	}

}
