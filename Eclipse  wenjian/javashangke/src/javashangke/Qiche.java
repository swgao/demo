package javashangke;

public class Qiche {
	private String color;
	private String style;
	public Qiche() {}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Qiche(String color, String style) {
		this.color = color;
		this.style = style;
	}
	public void start() {
		System.out.println(color+style+"��������������");
	}
	public void run(String from, String to ) {
		System.out.println(color+style+"���ڴ�"+from+"��"+to+"·�Ϸɱ�������");
	}
	public void stop() {
		System.out.println(color+style+"����ͣ��������");
	}
	
}
