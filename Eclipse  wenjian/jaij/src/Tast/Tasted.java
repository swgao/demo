package Tast;

import java.util.Scanner;

public class Tasted {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double salary,salary1;
    double pay;
    double tax;
    System.out.println("请输入税前资");
    salary = scan.nextDouble();
    salary1 = salary-5000;
    if(salary<=0)
    	tax=0;
    else if(salary<=3000)
    	tax= salary1*.03;
    else if(salary<=12000)
    	tax=(salary1-3000)*.01+90;
    else if(salary<=25000)
        	tax= (salary1-12000)*.02+990;
    else if(salary<=35000)
    	tax= (salary1-25000)*.025+3560;
    else if(salary<=55000)
    	tax=( salary1-35000)*.03+6090;
    else if(salary<=80000)
    	tax=( salary1-55000)*.035+12090;
    else
    	tax=(salary1-80000)*.045+20840;
    System.out.println("工资"+salary+",应交税"+tax);
	}

}
