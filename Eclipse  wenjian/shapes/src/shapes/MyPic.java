package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(420,300);
		Circle c1= new Circle(220,190,30);
		Circle c2= new Circle(220,10,30);
		Circle c3= new Circle(150,50,30);
		Circle c4= new Circle(100,100,30);
		Circle c5= new Circle(150,150,30);
		Circle c6= new Circle(220,130,30);
		Circle c7= new Circle(220,70,30);
		pic.add(c1);
		pic.add(c2);
		pic.add(c3);
		pic.add(c4);
		pic.add(c5);
		pic.add(c6);
		pic.add(c7);
		pic.draw();	
	}
}
