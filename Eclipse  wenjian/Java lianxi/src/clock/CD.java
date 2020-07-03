package clock;

public class CD extends Item{
     private String artist;
     private int numpfTracks;
     public CD(String title, String artist, int numpfTracks, int playingTime, String coment) {
    	//this.title = title;
    	super(title,playingTime,false,coment);
		this.artist = artist;
		this.numpfTracks = numpfTracks;
		/*this.playingTime = playingTime;
		this.coment = coment;*/
	}
     
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numpfTracks=" + numpfTracks + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc = (CD)obj;
		return artist.equals(cc.artist);
	}

	public static void main(String[] args) {
	CD cd = new CD("a","b",2,2,"...");
	CD cd1 = new CD("a","b",2,2,"...");
	System.out.println(cd.equals(cd1));	
		cd.print();
		String s = "aa   "+cd;
		System.out.println(s);
	}
	/*public void print() {
		System.out.println("CD"+title+":"+artist);
	}*/

	
}

