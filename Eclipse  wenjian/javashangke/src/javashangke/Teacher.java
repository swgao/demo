package javashangke;

public class Teacher extends Person{
	private int teacherId;
	public Teacher(String id, String name, int teacherId) {
		super(id, name);
		this.teacherId = teacherId;
	}

	public int getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public void print() {
		System.out.println("name="+name+",teacher="+teacherId);
		super.print();
		}


	public static void main(String[] args) {
		Teacher teacher = new Teacher("45","“¶¿œ ¶",3);
		teacher.print();
	}

}
