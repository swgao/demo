package javashangke;

public class Dog extends Amial {
	private String furColor;
	public Dog() {
	super();
	}
	public Dog(String breed,String name,String furColor) {
		super(breed,name);
		this.furColor=furColor;
	}
	public void bark() {
		System.out.println("www"+name+"˵����������");
	}
	public void swim() {
		System.out.println("�����죬"+name+"�ڳ�������Ӿ");
	}
}
