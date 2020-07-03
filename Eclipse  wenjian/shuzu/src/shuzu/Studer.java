package shuzu;
import java.util.Scanner;
public class Studer {
	//声明类的静态特征
   String number;     //学号属性
  static  String name;       //姓名属性
  static float grade;     //成绩属性
  static int nianling;
   
    //声明类的动态行为
	String mingzi() {
		Scanner scan = new Scanner(System.in);
		  Studer m= new Studer(); 
		  System.out.println("请输入名字");
		   m.name=scan.nextLine();
	     return name;
	}
   float chengji() {          //描述考试方法
	   Scanner scan = new Scanner(System.in);
		  Studer m= new Studer(); 
		  System.out.println("请输入成绩");
		   m.grade=scan.nextInt();
	   return grade;
   }
     float nian(){
	   Scanner scan = new Scanner(System.in);
	  Studer m= new Studer(); 
	  System.out.println("请输入年龄");
	   m.nianling=scan.nextInt();
     return nianling;
   }
  public static void main(String[] args) {
	Studer vm= new Studer(); 
	vm.nian();
	vm.mingzi();
	vm.chengji();
	System.out.println("我叫"+name+",今年"+nianling+"，我考了"+grade);

	}

}
