package shuzu;

import java.util.Scanner;

public class ChengJi {
	
	public static void main(String[] args) {
		int [][]scores = new int[10][3];
		String [][]lovel = new String[10][3];
		for(int i=0;i<scores.length;i++) {
			for (int j = 0; j<scores[i].length;j++) {
				System.out.println("请输入第"+(i+1)+"个学生的第"+(j+1)+"门成绩");
				Scanner scan = new Scanner(System.in);
				scores[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<scores.length;i++) {
			for (int j = 0; j<scores[i].length;j++) {
				if(scores[i][j] <= 100 && scores[i][j] >= 0) {
					if(scores[i][j]>=90)
						lovel[i][j]= "优秀";
					else if(scores[i][j]>60)
						lovel[i][j] = "合格";
					else
						lovel[i][j] = "不合格";
				}
				else
					lovel[i][j]= "你输入的成绩不合法";
	}
		}
		for(int i=0;i<scores.length;i++) {
			System.out.println("第"+(i+1)+"的成绩");
			for (int j = 0; j<scores[i].length;j++) {
				System.out.println("第"+(j+1)+"课程"+scores[i][j]+"成绩判定:" + lovel[i][j]);
			}
			System.out.println();
		}
			}
				}