package javashangke;

public class Cat extends Amial {
	public Cat() {
		super();
		}
		public Cat(String breed,String name) {
			super(breed,name);
		}
		public void bark() {
			System.out.println("������,"+breed+name+"˵��������");
		}
		public void eat(String food) {
			System.out.println(breed+name+"˵��Ҫ��"+food);
		}
}
