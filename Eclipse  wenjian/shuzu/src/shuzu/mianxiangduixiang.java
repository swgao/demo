/**
 * 类就是具有相同静态特征和动态行为事物的集合
 * 定义类的关键子是 class
 */
package shuzu;

import java.util.Scanner;

public class mianxiangduixiang {
	//声明类的静态特征
   String number;     //学号属性
   String name;       //姓名属性
     float grade;     //成绩属性
	int nianling;
   
    //声明类的动态行为
   
   void shangke(){           //描述上课方法
	   System.out.println("上课可不是闹着玩的");
   }
   float kaoshi() {          //描述考试方法
	   System.out.println("我们的人生就是一场场考试，可不敢造次哦！");
	   return grade;
   }
     float nian(){
	   Scanner scan = new Scanner(System.in);
	  mianxiangduixiang m= new mianxiangduixiang(); 
	  System.out.println("请输入年龄");
	   m.nianling=scan.nextInt();
     return nianling;
   }
  public static void main(String[] args) {
	mianxiangduixiang vm= new mianxiangduixiang(); 
	vm.nian();
	vm.kaoshi();
	vm.shangke();
	vm.number="1803003104";
	vm.name="高世伟";
	System.out.println(vm.name);
	System.out.println(vm.number);
}
}