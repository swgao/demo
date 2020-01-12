package NoteBook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>(); //容器类
     public void add(String s) {
    	 notes.add(s);
    	
     }
     public void add(String s ,int location) {
    	 notes.add(location,s );
     }
     public int getSize() {
    	 return notes.size();
     }
     public String getNote(int index) {
    	 return notes.get(index);
    	 
     }
     public void removeNote(int index) {
    	 notes.remove(index);
     }
     public String[] list() {
    	 int[] ia = new int[10];
    	 
    	 String[] a =new String[notes.size()];
    	 /*for(int i=0;i<notes.size();i++) {
    		 a[i] = notes.get(i);
    		 
    	 }*/   //写循环
    	 notes.toArray(a); //可以不用写循环用这种办法
    	 return a;
     }
	public static void main(String[] args) {
		int[] ia = new int[10];
		for(int i=0;i<ia.length;i++) {
			ia[i]=i;
		}
		for(int k:ia) {
			System.out.println(k);
		}
   	 String[] a =new String[10];
   	 for(int i=0;i<a.length;i++) {
   		 a[i]=""+i;
   	 }
   	System.out.println(ia[0]+2);
	System.out.println(a[0].length());
		/*NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("therid", 1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		System.out.println(nb.getNote(1));
		nb.removeNote(1);
		String[] a = nb.list();
		for(String s : a) {
			System.out.println(s);
		}*/
	}

}
