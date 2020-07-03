package javashangke;

import java.util.Scanner;

public class ×ÖµäÅÅĞò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ÊäÈëÓĞ¸ö×Ö·û´®");
		String s = sc.nextLine();
		char[] w = s.toCharArray();
		for(int x = 0;x<w.length-1;x++) {
			for(int y =x+1;y<w.length;y++) {
				if(w[x]>w[y]) {
					char t =w[x];
					w[x] = w[y];
					w[y] = t;
				}
			}
		}
		s = String.valueOf(w);
		System.out.print(s);
	}

}
