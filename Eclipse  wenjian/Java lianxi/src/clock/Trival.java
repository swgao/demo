package clock;

public class Trival {
		private int a; //������
		private int b; //������
		private int c;//������
		private double mianji,p; //��������� �������ܳ�
		private double zhugao,cemianji,dimianji,biaomianji; //���� ������� �������
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
		//System.out.println("���ܹ���������");
	return false;
	else 
		return true;
	/*else if(a==b && b==c) {
		System.out.println("�ȱ�������");
	}else {
		System.out.println("���ǵȱ�����������������");
	}*/

}
public void findArea() {
p = (a+b+c)/2;
mianji = Math.sqrt(p*(p-a)*(p-b)*(p-c));
cemianji = 2*p*zhugao;
this.dimianji = mianji;
biaomianji = (cemianji+dimianji*2);
System.out.println("�����������"+mianji);
System.out.println("�����������"+biaomianji);
}
}
