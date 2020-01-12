package clock;

public class Item {
	private String title;
	private int playingTime;
    private boolean gorIt=false;
    private String coment;
	public  Item() {}
	
  
   public Item(String title, int playingTime, boolean gorIt, String coment) {
		this.title = title;
		this.playingTime = playingTime;
		this.gorIt = gorIt;
		this.coment = coment;
	}

   public void setTitle(String title) {
	   this.title=title;
   }
public void print() {
		System.out.println(title);
   		}
	}