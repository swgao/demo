package Java;

public class Reader {
	private String id;
	private String name;
	private String sex;
	private String day;
	public Reader() {
		super();
	}
	public Reader(String id, String name, String sex, String day) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.day = day;
	}
	@Override
	public String toString() {
		return "Reader [id=" + id + ", name=" + name + ", sex=" + sex + ", day=" + day + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
}
