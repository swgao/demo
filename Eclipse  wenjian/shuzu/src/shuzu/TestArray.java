package shuzu;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int no01=88;
      int no02=78;
      int no03=88;
      /*int[] score;               //1：声明一个整形数组
      score = new int[5];          //创建数组
      score[0]=88;                 //初始化
      score[1]=78;
      score[2]=58;
      score[3]=68;
      score[4]=98;
      for(int i=0;i<5;i++)         //引用
    	  System.out.println(score[i]);
	*/
      /*int score[];               //声明一个整形数组
      score = new int[5];          //创建数组
      score[0]=88;                 //初始化
      score[1]=78;
      score[2]=58;
      score[3]=68;
      score[4]=98;
      for(int i=0;i<5;i++)         //引用
    	  System.out.println(score[i]);*/
      /*int[] score= new int[5];     //2：声明一个整形数组并创建
      score[0]=88;                 //初始化
      score[1]=78;
      score[2]=58;
      score[3]=68;
      score[4]=98;
      for(int i=0;i<5;i++)         //引用
    	  System.out.println(score[i]);*/
      int[] score= new int[5]; //声明一个整形数组
      for(int i=0;i<5;i++) 
    	  score[i]=i;
      for(int i=0;i<5;i++)         //引用
    	  System.out.println(score[i]);
      /*int[] score= {88,78,58,68,98 } ;              //3：声明同时整体初始化
      for(int i=0;i<5;i++)         //引用
    	  System.out.println(score[i]);*/
	}
}
