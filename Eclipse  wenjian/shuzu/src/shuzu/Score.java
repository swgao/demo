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
        	System.out.print("������"+(i+1)+"��ͬѧ������");
        	name[i]= scan.next();
        	System.out.print("������"+(i+1)+"��ͬѧ�ĳɼ�");
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
        System.out.println("�ܳɼ�"+sum);
        System.out.println("ƽ���ɼ�"+1.0*sum/score.length);
        System.out.println("������"+1.0*pass/score.length*100+"%");
        System.out.println("��߳ɼ�"+max);
        System.out.println("��ͳɼ�"+min);
        System.out.println(name[k]+"�����óɼ�"+max);
        System.out.println(name[m]+"������ɼ�"+min);
	}
}
