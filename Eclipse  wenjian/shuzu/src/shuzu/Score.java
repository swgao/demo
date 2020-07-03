package shuzu;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int score[]= new int[5];
        String name[]=new String[5];
        int sum=0;
        double aver=0;
        int max=0;
        int k=0;
        int min=100;
        int m=0;
        int pass=0;
        double passRate;
        for(int i=0;i<score.length;i++) {
        	System.out.print("请输入"+(i+1)+"个同学的名字");
        	name[i]= scan.next();
        	System.out.print("请输入"+(i+1)+"个同学的成绩");
        	score[i]=scan.nextInt();
        	sum+=score[i];
        	if(score[i]>max) {
        		max=score[i];
        		k=i;
        	}
        		if(score[i]<min) {
        			min=score[i];
        			m=i;
        		}
        		if(score[i]>=60)
        			pass++;
        }
        System.out.println("总成绩"+sum);
        System.out.println("平均成绩"+1.0*sum/score.length);
        System.out.println("及格率"+1.0*pass/score.length*100+"%");
        System.out.println("最高成绩"+max);
        System.out.println("最低成绩"+min);
        System.out.println(name[k]+"获得最好成绩"+max);
        System.out.println(name[m]+"获得最差成绩"+min);
	}
}
