/**
 * ����Ǿ�����ͬ��̬�����Ͷ�̬��Ϊ����ļ���
 * ������Ĺؼ����� class
 */
package shuzu;

import java.util.Scanner;

public class mianxiangduixiang {
	//������ľ�̬����
   String number;     //ѧ������
   String name;       //��������
     float grade;     //�ɼ�����
	int nianling;
   
    //������Ķ�̬��Ϊ
   
   void shangke(){           //�����Ͽη���
	   System.out.println("�Ͽοɲ����������");
   }
   float kaoshi() {          //�������Է���
	   System.out.println("���ǵ���������һ�������ԣ��ɲ������Ŷ��");
	   return grade;
   }
     float nian(){
	   Scanner scan = new Scanner(System.in);
	  mianxiangduixiang m= new mianxiangduixiang(); 
	  System.out.println("����������");
	   m.nianling=scan.nextInt();
     return nianling;
   }
  public static void main(String[] args) {
	mianxiangduixiang vm= new mianxiangduixiang(); 
	vm.nian();
	vm.kaoshi();
	vm.shangke();
	vm.number="1803003104";
	vm.name="����ΰ";
	System.out.println(vm.name);
	System.out.println(vm.number);
}
}