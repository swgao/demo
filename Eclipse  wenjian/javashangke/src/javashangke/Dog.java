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
		System.out.println("www"+name+"说，有人来了");
	}
	public void swim() {
		System.out.println("大热天，"+name+"在池塘里游泳");
	}
}
