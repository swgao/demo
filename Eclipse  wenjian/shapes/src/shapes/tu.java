package shapes;

public class tu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Picture pic=new Picture(420,420);
		      Circle c1=new Circle(210,210,20);
		      Line l1=new Line(210,230,210,300);
		      Line l2=new Line(210,240,190,260);
		      Line l3=new Line(210,240,230,240);
		      Line l4=new Line(210,300,170,320);
		      Line l5 = new Line(210,300,230,320);
		      pic.add(c1);
		      pic.add(l1);
		      pic.add(l2);
		      pic.add(l3);
		      pic.add(l4);
		      pic.add(l5);


		      pic.draw();    
	}

}
