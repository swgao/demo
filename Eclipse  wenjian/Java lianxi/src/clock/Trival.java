package clock;

public class Trival {
		private int a; //三角形
		private int b; //三角形
		private int c;//三角形
		private double mianji,p; //三角形面积 三角形周长
		private double zhugao,cemianji,dimianji,biaomianji; //柱高 柱侧面积 柱底面积
	public Trival() {
	}
	
public Trival(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		}
		
public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public int getC() {
	return c;
}

public void setC(int c) {
	this.c = c;
}
public double getMianji() {
	return mianji;
}

public void setMianji(double mianji) {
	this.mianji = mianji;
}

public double getZhugao() {
	return zhugao;
}

public void setZhugao(double zhugao) {
	this.zhugao = zhugao;
}
public boolean panduan() {
	
	
	if(a<=0 || b<=0 || c<=0|| a+b<=c || b+c<=a || c+a<=b) 
		//System.out.println("不能构成三角形");
	return false;
	else 
		return true;
	/*else if(a==b && b==c) {
		System.out.println("等边三角形");
	}else {
		System.out.println("不是等边三角形请重新输入");
	}*/

}
public void findArea() {
p = (a+b+c)/2;
mianji = Math.sqrt(p*(p-a)*(p-b)*(p-c));
cemianji = 2*p*zhugao;
this.dimianji = mianji;
biaomianji = (cemianji+dimianji*2);
System.out.println("三角形面积："+mianji);
System.out.println("三棱柱表面积"+biaomianji);
}
}
