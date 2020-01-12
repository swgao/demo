package javashangke;

public class Cat extends Amial {
	public Cat() {
		super();
		}
		public Cat(String breed,String name) {
			super(breed,name);
		}
		public void bark() {
			System.out.println("喵喵喵,"+breed+name+"说，他饿了");
		}
		public void eat(String food) {
			System.out.println(breed+name+"说他要吃"+food);
		}
}
