package clock;

public class DVD extends Item{
     private String director;
     
	public DVD(String title, String director, int playingTime, String coment) {
		super(title,playingTime,false,coment);
		setTitle("b");
		this.director = director;
	}
	public static void main(String[] args) {
		DVD dvd = new DVD("b","a",2,"..");
		dvd.print();
	}
	public void print() {
		System.out.print("DVD:");
		super.print();
		System.out.print(director);
		
	}

}
