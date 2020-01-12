package javashangke;

public class Monkey {
	private String color;
	private String name;
	private double age;
	public Monkey() {
		color="金色";
		name="杰克";
		age=1;
	}
	public Monkey(String color, String name, double age) {
		super();
		this.color = color;
		this.name = name;
		this.age = age;
	}
public void act() {
	System.out.println("这只"+color+"猴子"+"名字叫"+name+",今年"+age+"岁");
}
public void play(String play) {
	System.out.println(name+play);
}
}