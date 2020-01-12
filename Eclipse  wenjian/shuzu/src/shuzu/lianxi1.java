package shuzu;

public class lianxi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] score =new int[7];
   score[0]=1;
   score[1]=5;
   score[2]=7;
   score[3]=3;
   score[4]=9;
   score[5]=2;
   score[6]=6;
   for(int i=0;i<7;i++)
	   System.out.println(score[i]);
   int max=score[0];
   for(int i=1;i<score.length;i++) {
	   if(score[i]>max)
		   max=score[i];
   }
   System.out.println("最大是"+max);
   int min=score[0];
   for(int i=1;i<score.length;i++) {
	   if(score[i]<min)
		   max=score[i];
   }
   System.out.println("最小是"+min);
	}

}
