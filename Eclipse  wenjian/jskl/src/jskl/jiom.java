package jskl;

import java.util.Scanner;

public class jiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		double T;
		double t;
	    double p;
	    
	    System.out.print("������ͣ��ʱ�䣨Сʱ����");
          T = scan.nextDouble();	 
              if(T%1==1)
            	  t=T;
              else
            	  t=(int)(T+1);
        
       if(t<1)
      		System.out.print("����������");
      	else if(t<=3)
      	{ 
      		p=5;
      	    System.out.print("���ã�����ͣ��ʱ��Ϊ:"+T+"Сʱ\n��Ӧ�ɷ�"+p+"Ԫ��");
      	    }
      	else if(t>3){
      		p=5+(t-3);
            System.out.print("���ã�����ͣ��ʱ��Ϊ:"+T+"Сʱ\n��Ӧ�ɷ�"+p+"Ԫ��");
            }
      		else if(t>=20)
        	{
      	       p=t/24*20+t%24;
      	       System.out.print("���ã�����ͣ��ʱ��Ϊ:"+T+"Сʱ\n��Ӧ�ɷ�"+p+"Ԫ��");
        	}
      		
      		
	        }

	}

