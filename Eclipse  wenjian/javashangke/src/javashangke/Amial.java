package javashangke;

public class Amial {
	String breed;
	String name;
	public Amial() {}
	public Amial(String breed, String name) {
		this.breed = breed;
		this.name = name;
	}
	public void eat(String food) {
		System.out.println(name+"ϲ����"+food);
	}
	public void bark() {
		System.out.println("****"+name+"�ڽ�");
	}
}
