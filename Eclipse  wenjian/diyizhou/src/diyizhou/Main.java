package diyizhou;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();

	}

}
class Fraction{
	   int fenzi;
	   int fenmu;
	Fraction(int a,int b){
		this.fenzi=a;
		this.fenmu=b;
	}
	double toDouble() {
		return  1.0*fenzi / fenmu;
	}
	Fraction plus(Fraction r) {
		Fraction m = new Fraction(1,2);
		m.fenmu = r.fenmu*fenmu;
		m.fenzi = r.fenmu*fenzi + r.fenzi*fenmu;
		return m;
	}
	Fraction multiply(Fraction r) {
		Fraction m = new Fraction(5,6);
		m.fenzi = r.fenzi*fenzi;
		m.fenmu = r.fenmu*fenmu;
		return m;
	}
	void print() {
		int r;
		int x=fenzi;
		int y=fenmu;
		while(x!=0) {
			r= y%x;
			y=x;
			x=r;
		}
		fenzi/=y;
		fenmu/=y;
		if(fenzi==fenmu) {
			System.out.println(fenzi/fenmu);
		}
		else
			System.out.println(fenzi+"/"+fenmu);
	}
	
}

