package javashangke;

public class Monkey {
	private String color;
	private String name;
	private double age;
	public Monkey() {
		color="��ɫ";
		name="�ܿ�";
		age=1;
	}
	public Monkey(String color, String name, double age) {
		super();
		this.color = color;
		this.name = name;
		this.age = age;
	}
public void act() {
	System.out.println("��ֻ"+color+"����"+"���ֽ�"+name+",����"+age+"��");
}
public void play(String play) {
	System.out.println(name+play);
}
}