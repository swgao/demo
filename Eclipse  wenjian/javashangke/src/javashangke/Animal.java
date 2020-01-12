package javashangke;

public abstract class Animal {
	private String name;
	private String color;
	public Animal() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public void eat(String food) {
		System.out.println(name+"Ï²»¶³Ô"+food);
	}
	abstract public void bakea();
}
