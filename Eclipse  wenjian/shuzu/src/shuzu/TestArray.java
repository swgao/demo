package shuzu;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int no01=88;
      int no02=78;
      int no03=88;
      /*int[] score;               //1������һ����������
      score = new int[5];          //��������
      score[0]=88;                 //��ʼ��
      score[1]=78;
      score[2]=58;
      score[3]=68;
      score[4]=98;
      for(int i=0;i<5;i++)         //����
    	  System.out.println(score[i]);
	*/
      /*int score[];               //����һ����������
      score = new int[5];          //��������
      score[0]=88;                 //��ʼ��
      score[1]=78;
      score[2]=58;
      score[3]=68;
      score[4]=98;
      for(int i=0;i<5;i++)         //����
    	  System.out.println(score[i]);*/
      /*int[] score= new int[5];     //2������һ���������鲢����
      score[0]=88;                 //��ʼ��
      score[1]=78;
      score[2]=58;
      score[3]=68;
      score[4]=98;
      for(int i=0;i<5;i++)         //����
    	  System.out.println(score[i]);*/
      int[] score= new int[5]; //����һ����������
      for(int i=0;i<5;i++) 
    	  score[i]=i;
      for(int i=0;i<5;i++)         //����
    	  System.out.println(score[i]);
      /*int[] score= {88,78,58,68,98 } ;              //3������ͬʱ�����ʼ��
      for(int i=0;i<5;i++)         //����
    	  System.out.println(score[i]);*/
	}
}
