package javashangke;

public class Car {
	private String brand;
	private String color;
	private double speed;
	public Car() {
		 brand="��������";
		color="��ɫ";
		speed = 0;
	}
	public Car(String brand,String color) {
		super();
		this.brand=brand;
		this.color=color;
		speed=0;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void run() {
		System.out.println(getColor()+"��"+getBrand()+"���ٶ���"+getSpeed());
	}
	
}
