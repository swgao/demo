package javashangke;

public  class Dog1 extends Animal {
	String sex;
	
	public Dog1() {
		super();
		
	}

	public Dog1(String name, String color,String sex) {
		super(name, color);
		this.sex=sex;
		
	}
public void bakea() {
	System.out.println("������");
}

	public static void main(String[] args) {
		Dog1 a = new Dog1("̩��","��ɫ","ĸ��");
		a.eat("kn");
		a.bakea();
		Animal cat = new Animal("С��","��è") {
			public void bakea() {
				System.out.println("������");
				}
			};
			cat.eat("��");
			cat.bakea();
		}

	}

	
