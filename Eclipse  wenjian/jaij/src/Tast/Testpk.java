package Tast;

import java.util.Scanner;

public class Testpk {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
         double weight,height;
         int sex;
         int bmi;
         String sex1;
         String suggest;
         System.out.println("����������Ա�(��-1 Ů-0):");
         sex = scan.nextInt();
         System.out.println("���������(m):");
         height = scan.nextDouble();
         System.out.println("�������������(kg):");
         weight = scan.nextDouble();
         bmi = (int)(weight/height/height+0.5);
         
         if(sex==1) {
        	 sex1="��ʿ";
        	 if(bmi<=20)
        		 suggest = "̫���ˣ���ǿ��ʳ��";
        	 else if(bmi<=24)
        		 suggest = "��׼��ģ��뱣��";
        	 else if(bmi<=30)
        		 suggest = "΢�֣�ע����ʳ����ǿ������";
        	 else if(bmi<=34)
        		 suggest = "���֣���ǿ��������Ҫ���ʣ�";
        	 else
        		 suggest = "���֣���ǿ��������Ҫ��ʳ��";
         }else {
        	 sex1="Ůʿ";
        	 if(bmi<=19)
        		 suggest = "̫���ˣ���ǿ��ʳ��";
        	 else if(bmi<=23)
        		 suggest = "��׼��ģ��뱣��";
        	 else if(bmi<=29)
        		 suggest = "΢�֣�ע����ʳ����ǿ������";
        	 else if(bmi<=33)
        		 suggest = "α�֣���ǿ��������Ҫ����!";
        	 else
        		 suggest = "���֣���ǿ��������Ҫ��ʳ��";
        	 
         }
         System.out.println(sex1+":\n�����:"+height+"\n����:");
         System.out.println("\n������������׼ֵ:"+bmi+"\n"+suggest);
	}

}
