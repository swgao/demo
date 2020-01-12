package clock;

import java.util.ArrayList;

public class Database {
	//private ArrayList<CD> listCD = new ArrayList<CD>();
	//private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listitem = new ArrayList<Item>();
	/*public void add(CD cd) {
	listCD.add(cd);
}
	
	public void add(DVD dvd) {
		listDVD.add(dvd);
	}*/
		public void add(Item item) {
			listitem.add(item);
		}
	public void list() {
		/*for (CD cd:listCD) {
			cd.print();
		}for (DVD dvd : listDVD) {
			dvd.print();
		}*/
		for (Item item : listitem) {
			item.print();
		}
	}
	public static void main(String[] args) {
		Item item = new Item("a",2,true,"...");
		CD cd = new CD("a","b",0,0,"...");
		item = (Item)cd;//×ª»»
		Database db = new Database();
		db.add(new CD("abc","abc",4,60,"..."));
		db.add(new CD("adc","gc",4,60,"..."));
		db.add(new DVD("xxx","aaa",60,"..."));
		db.add(new MP3("abc","aaa",6,6,"...."));
		db.list();
	}
 
}
