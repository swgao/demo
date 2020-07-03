package javashangke;

public class Car {
	private String brand;
	private String color;
	private double speed;
	public Car() {
		 brand="兰博基尼";
		color="红色";
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
		System.out.println(getColor()+"的"+getBrand()+"的速度是"+getSpeed());
	}
	
}
