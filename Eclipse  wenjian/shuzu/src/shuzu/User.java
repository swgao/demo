package shuzu;

public class User {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return "User:" +name;
	}
	public boolean equals(Object o) {
		return name.equals(((User)o).name);
	}
}
