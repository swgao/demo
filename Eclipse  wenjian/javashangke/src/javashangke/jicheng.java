package javashangke;

public class jicheng {
	public String name;
	private int age;
	char sex;
	public jicheng(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public jicheng() {
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public void eat(String food) {
		System.out.println(this.name+"ϲ����"+food);
	}
	public void play(String game) {
		System.out.println(this.name+"ϲ����"+game);
	}
	public void talk() {
		System.out.println(this.name+"˵����Һã�");
	}
	
	
}
