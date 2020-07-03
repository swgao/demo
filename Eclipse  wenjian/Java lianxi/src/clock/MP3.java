package clock;

public class MP3 extends Item { 
	public  MP3(String title, String artist, int numpfTracks, int playingTime, String coment) {
	super(title,playingTime,false,coment);
	}
	
	public static void main(String[] args) {
		MP3 mp3 = new MP3("a","c",2,2,"...");
		mp3.print();
	}
	public void print() {
		System.out.println();
		super.print();
		System.out.println();
	}
}


