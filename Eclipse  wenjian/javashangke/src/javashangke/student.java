package javashangke;

public class student extends jicheng{
	String classNo;
	String stuNO;
	public student(String name, int age, char sex, String classNo, String stuNO) {
		super(name,age,sex);
		this.classNo = classNo;
		this.stuNO = stuNO;
	}
	public void sport(String sth) {
		System.out.println(this.name+"Ï²»¶Íæ"+sth);
	}
	public void banji(String jinianji) {
		System.out.println(this.name+"ÔÚ"+jinianji+"°à");
	}
	public student() {
	}
	
	
}
