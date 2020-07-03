package shuzu;

public class ººÅµËþ {

	public static void main(String[] args) {
		hnt(3,"A","B","C");}
		static void hnt(int N,String from, String to,String help) {
			if(N==1) {
				System.out.println("move"+N+"from"+from+"to"+to);
				return;}
				hnt(N-1,from,help,to);
				System.out.println("move"+N+"from"+from+"to"+to);
				hnt(N-1,help,to,from);
			}
		

	}

