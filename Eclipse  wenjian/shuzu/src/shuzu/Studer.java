package shuzu;
import java.util.Scanner;
public class Studer {
	//������ľ�̬����
   String number;     //ѧ������
  static  String name;       //��������
  static float grade;     //�ɼ�����
  static int nianling;
   
    //������Ķ�̬��Ϊ
	String mingzi() {
		Scanner scan = new Scanner(System.in);
		  Studer m= new Studer(); 
		  System.out.println("����������");
		   m.name=scan.nextLine();
	     return name;
	}
   float chengji() {          //�������Է���
	   Scanner scan = new Scanner(System.in);
		  Studer m= new Studer(); 
		  System.out.println("������ɼ�");
		   m.grade=scan.nextInt();
	   return grade;
   }
     float nian(){
	   Scanner scan = new Scanner(System.in);
	  Studer m= new Studer(); 
	  System.out.println("����������");
	   m.nianling=scan.nextInt();
     return nianling;
   }
  public static void main(String[] args) {
	Studer vm= new Studer(); 
	vm.nian();
	vm.mingzi();
	vm.chengji();
	System.out.println("�ҽ�"+name+",����"+nianling+"���ҿ���"+grade);

	}

}
