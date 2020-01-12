package zuoye;

public class ClassB implements InterfaceA {

	@Override
	public int method(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}System.out.println(f);
		return f;
	}

}
