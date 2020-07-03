package shuzu;

public class shb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ComplexNumber b =new ComplexNumber();
b.real=2.1;
b.image=3.2;
b.Show();
ComplexNumber b1 = new ComplexNumber(3,4);
b1.Show();
b.add(b1).Show();
b.mutil(b1).Show();
	}

}
