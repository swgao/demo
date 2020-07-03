package jskl;

public class Tmdlmq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int g;
   int s;
   int b;
   for(g=0;g<10;g++) {
	   for(s=0;s<10;s++) {
		   for(b=0;b<10;b++) {
			   if(g*g*g+s*s*s+b*b*b==100*g+10*s+b)
				   System.out.println((100*g+10*s+b)+"Ë®ÏÉ»¨Êý");
		   }
	   }
   }
	}

}
