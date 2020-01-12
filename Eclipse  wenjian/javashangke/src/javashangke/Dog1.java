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
	System.out.println("ÍôÍôÍô");
}

	public static void main(String[] args) {
		Dog1 a = new Dog1("Ì©µÏ","ºÚÉ«","Ä¸µÄ");
		a.eat("kn");
		a.bakea();
		Animal cat = new Animal("Ğ¡»¨","»¨Ã¨") {
			public void bakea() {
				System.out.println("ß÷ß÷ß÷");
				}
			};
			cat.eat("Óã");
			cat.bakea();
		}

	}

	
