package shuzu;

public class Fraction {
	int fenzi;
	int fenmu;
	public Fraction() {
		
	}
public Fraction(int fenzi,int fenmu){
	this.fenmu=fenmu;
	this.fenzi=fenzi;
}

public void show() {
	if(fenmu==1)
	System.out.println(fenzi);
	else
		System.out.println(fenzi+"/"+fenmu);
}
public int gcd(int a,int b){  //最大公因数
	int r;
	do {
		r=a%b;
		a=b;
		b=r;
	}while(r!=0);
	return a;
}
public int lcm(int a,int b) {    //最小公倍数
	return a*b/gcd(a,b);
}
public Fraction reduce() {
	Fraction f=new Fraction();
	int d=this.gcd(this.fenzi, this.fenmu);
	f.fenzi=this.fenzi/d;
	f.fenmu=this.fenmu/d;
	return f;
}
public static void main(String[] args) {
	Fraction v1 = new Fraction();
	v1.fenmu=24;
	v1.fenzi=12;
	v1.show();
	v1.gcd(v1.fenzi, v1.fenmu);
	System.out.println(v1.gcd(v1.fenzi, v1.fenmu));
	System.out.println(v1.lcm(v1.fenzi, v1.fenmu));
	v1.reduce().show();	
}
}

