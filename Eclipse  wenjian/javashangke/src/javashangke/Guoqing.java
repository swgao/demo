package javashangke;

public class Guoqing {
	private static final String sth = null;
	private String name;
	//int age;
	
	public Guoqing() {}

	public Guoqing(String name) {
		this.name = name;
		//this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	/*public int getAge() {
		if(this.age>22)
			return 22;
		else if(age<16)
			return 16;
		else
			return age;
	}
	public void setAge(int age) {
		this.age = age;
	}*/

	public void talk() {
		System.out.println(name+"说：国庆节到了，咋们去旅游吧");
	}
	public void talk(String sth) {
		System.out.println(name+"说："+sth);
	}
	public void talk(Guoqing p,String sth) {
		System.out.println(name+"对"+p.getName()+"说:"+sth);
	}
	public void dirve(Qiche car) {
		System.out.println(name+"启动了他的"+car.getColor()+car.getStyle());
		car.start();
	}
	public void brake(Qiche car) {
		System.out.println("达到目的地"+name+"刹车");
		car.stop();
	}
	public void lock(Qiche car) {
		System.out.println(name+"下了车，锁了"+car.getColor()+car.getStyle());
	}
}

